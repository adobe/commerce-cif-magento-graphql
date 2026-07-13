#!/usr/bin/env bash
set -euo pipefail

if [ -f build-reports/.total-tests ]; then
  total_tests=$(cat build-reports/.total-tests)
  file_count=$(cat build-reports/.file-count)
  passed_files=$(cat build-reports/.passed-files)
  failed_files=$(cat build-reports/.failed-files)
  failed_cases=$(cat build-reports/.failed-cases 2>/dev/null || echo 0)
else
  total_tests=0
  file_count=0
  passed_files=0
  failed_files=0
  failed_cases=0
fi

{
  echo "<details open>"
  if [ "${failed_cases}" != "0" ]; then
    echo "<summary><strong>Test Results</strong> — ${total_tests} tests · ${failed_cases} failed testcase(s) · ${failed_files} failed file(s)</summary>"
  else
    echo "<summary><strong>Test Results</strong> — ${total_tests} tests · ${file_count} files · all passed</summary>"
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
