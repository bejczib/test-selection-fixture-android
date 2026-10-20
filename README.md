# test-selection-fixture-android

Android fixture for trying the Bitrise [Test Selection step](https://github.com/bitrise-steplib/bitrise-step-test-selection) end to end.
Bitrise app: `06876dd4-9848-4b9c-9642-832b8583e608` (stack ubuntu-noble-24.04-bitrise-2025-android). The app uses the
config stored on bitrise.io; `bitrise.yml` here is a mirror of it.

Modules: `domain` (plain Kotlin JVM) ← `core` ← `feature` (Android libraries) ← `app`, two JUnit tests each.

Workflows:
- `full_tests` – baseline, `./gradlew test`.
- `selective_tests` – Test Selection + Android Unit Test (`test-selection` branch) with `on_empty_selection: skip`; pushes trigger this.
- `selective_tests_script` – the script-based consumer: `./gradlew $(cat gradle-tasks.txt)`.

Scenario branches: `try/core`, `try/domain` (JVM module, runs as `:domain:test`), `try/feature-tests`, `try/app`, `try/catalog`.
