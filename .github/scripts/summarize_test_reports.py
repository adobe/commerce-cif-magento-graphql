#
# Copyright 2026 Adobe. All rights reserved.
# This file is licensed to you under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License. You may obtain a copy
# of the License at http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software distributed under
# the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
# OF ANY KIND, either express or implied. See the License for the specific language
# governing permissions and limitations under the License.
#

import glob
import os
import re
import xml.etree.ElementTree as ET

surefire_dir = "target/surefire-reports"
total_tests = 0
total_skipped = 0
total_failures = 0
total_errors = 0
file_count = 0
passed_files = 0
failed_files = 0
failed_cases = []


def classname_to_source(classname):
    return "src/test/java/" + classname.replace(".", "/") + ".java"


def extract_failure_detail(testcase):
    for tag in ("failure", "error", "rerunFailure", "rerunError", "flakyFailure", "flakyError"):
        elem = testcase.find(tag)
        if elem is None:
            continue
        message = elem.get("message") or ""
        body = (elem.text or "").strip()
        stack = elem.findtext("stackTrace", default="").strip()
        detail = body or stack or message
        if message and message not in detail:
            detail = f"{message}\n{detail}".strip()
        kind = "ERROR" if tag in ("error", "rerunError", "flakyError") else "FAILURE"
        return kind, message, detail
    return None, "", ""


def parse_location(classname, detail):
    path = classname_to_source(classname)
    match = re.search(r"\((\w+\.java):(\d+)\)", detail)
    if match:
        filename, line = match.group(1), match.group(2)
        if path.endswith("/" + filename):
            return path, line
    return path, ""


for xml_path in sorted(glob.glob(os.path.join(surefire_dir, "TEST-*.xml"))):
    file_count += 1
    classname = os.path.basename(xml_path)[len("TEST-"):-len(".xml")]
    root = ET.parse(xml_path).getroot()
    tests = int(root.get("tests", "0"))
    failures = int(root.get("failures", "0"))
    errors = int(root.get("errors", "0"))
    skipped = int(root.get("skipped", "0"))
    total_tests += tests
    total_skipped += skipped
    total_failures += failures
    total_errors += errors
    if failures or errors:
        failed_files += 1
    else:
        passed_files += 1
    for testcase in root.findall("testcase"):
        kind, message, detail = extract_failure_detail(testcase)
        if not kind:
            continue
        name = testcase.get("name", "")
        tc_class = testcase.get("classname", classname)
        source_file, line = parse_location(tc_class, detail)
        failed_cases.append(
            {
                "name": name,
                "classname": tc_class,
                "kind": kind,
                "message": message,
                "detail": detail,
                "source_file": source_file,
                "line": line,
            }
        )

# Per-testcase counts (matching the aem-cif-guides-venia overview table).
# Derived from the suite attributes so the numbers always reconcile:
# tests = passed + failures + errors + skipped.
total_failed = total_failures + total_errors
total_passed = total_tests - total_skipped - total_failed

os.makedirs("build-reports", exist_ok=True)
with open("build-reports/.total-tests", "w", encoding="utf-8") as f:
    f.write(str(total_tests))
with open("build-reports/.file-count", "w", encoding="utf-8") as f:
    f.write(str(file_count))
with open("build-reports/.passed-files", "w", encoding="utf-8") as f:
    f.write(str(passed_files))
with open("build-reports/.failed-files", "w", encoding="utf-8") as f:
    f.write(str(failed_files))
with open("build-reports/.failed-cases", "w", encoding="utf-8") as f:
    f.write(str(len(failed_cases)))
with open("build-reports/.passed-cases", "w", encoding="utf-8") as f:
    f.write(str(total_passed))
with open("build-reports/.skipped-cases", "w", encoding="utf-8") as f:
    f.write(str(total_skipped))

lines = []
# Overview table (Total / Passed / Failed / Skipped) — same layout as venia.
lines.append("| Total | ✅ Passed | ❌ Failed | ⏭️ Skipped |")
lines.append("|------:|----------:|----------:|-----------:|")
lines.append(f"| {total_tests} | {total_passed} | {total_failed} | {total_skipped} |")
lines.append("")

if failed_cases:
    # Keep the summary small: just list which tests failed. Full stack traces live
    # in the uploaded build-reports artifact — link to it so details are one click
    # away ("analyze"), not inlined. Mirrors core-cif-components (CircleCI) output.
    lines.append(f"### Failed tests ({len(failed_cases)})")
    lines.append("")
    for case in failed_cases:
        lines.append(f"- `{case['name']}` — `{case['classname']}`")
    lines.append("")

    server = os.environ.get("GITHUB_SERVER_URL", "https://github.com")
    repo = os.environ.get("GITHUB_REPOSITORY", "")
    run_id = os.environ.get("GITHUB_RUN_ID", "")
    if repo and run_id:
        run_url = f"{server}/{repo}/actions/runs/{run_id}"
        lines.append(
            f"🔎 Download the **build-reports** artifact from the [workflow run]({run_url}) "
            f"to see full stack traces."
        )
    else:
        lines.append("🔎 Download the **build-reports** artifact to see full stack traces.")
    lines.append("")

with open("build-reports/test-summary.md", "w", encoding="utf-8") as f:
    f.write("\n".join(lines) + "\n")

with open("build-reports/test-annotations.txt", "w", encoding="utf-8") as f:
    for case in failed_cases:
        title = f"{case['name']} ({case['kind'].lower()})"
        msg = (case["message"] or case["detail"] or case["kind"]).replace("%", "%25").replace("\r", "")
        msg = msg.replace("\n", "%0A")
        line = f",line={case['line']}" if case["line"] else ""
        f.write(
            f"::error file={case['source_file']}{line},title={title}::{msg}\n"
        )
