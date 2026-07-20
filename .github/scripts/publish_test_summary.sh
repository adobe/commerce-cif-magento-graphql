#!/usr/bin/env bash
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

set -euo pipefail

if [ -f build-reports/.total-tests ]; then
  total_tests=$(cat build-reports/.total-tests)
  file_count=$(cat build-reports/.file-count)
  passed_files=$(cat build-reports/.passed-files)
  failed_files=$(cat build-reports/.failed-files)
  failed_cases=$(cat build-reports/.failed-cases 2>/dev/null || echo 0)
  passed_cases=$(cat build-reports/.passed-cases 2>/dev/null || echo 0)
  skipped_cases=$(cat build-reports/.skipped-cases 2>/dev/null || echo 0)
else
  total_tests=0
  file_count=0
  passed_files=0
  failed_files=0
  failed_cases=0
  passed_cases=0
  skipped_cases=0
fi

{
  echo "<details open>"
  if [ "${failed_cases}" != "0" ]; then
    echo "<summary><strong>Test Results</strong> — ${total_tests} tests · ${passed_cases} passed · ${failed_cases} failed · ${skipped_cases} skipped</summary>"
  else
    echo "<summary><strong>Test Results</strong> — ${total_tests} tests · ${passed_cases} passed · ${skipped_cases} skipped · all passed</summary>"
  fi
  echo ""
  if [ -f build-reports/test-summary.md ]; then
    cat build-reports/test-summary.md
  elif [ -d target/surefire-reports ]; then
    echo "Tests ran but summary was not generated."
  else
    echo "Build failed before tests ran."
  fi
  echo "</details>"
} > "$GITHUB_STEP_SUMMARY"
