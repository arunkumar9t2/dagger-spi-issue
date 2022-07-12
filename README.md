### Dagger SPI Plugin Issue Repro

SPI plugins are not called since 2.40 unless hilt's `enableAggregatingTask` is manually disabled

* `enableAggregatingTask` = `true`
```bash
./gradlew kaptDebugKotlin --rerun-tasks

> Task :app:kaptDebugKotlin
Visiting :dev.arunkumar.dagger.Sword_HiltComponents.SingletonC
BUILD SUCCESSFUL in 8s
20 actionable tasks: 20 executed
```

* `enableAggregatingTask` = `false`
```bash
./gradlew kaptDebugKotlin --rerun-tasks

> Task :app:kaptDebugKotlin
warning: The following options were not recognized by any processor: '[dagger.fastInit, kapt.kotlin.generated]'

BUILD SUCCESSFUL in 7s
20 actionable tasks: 20 executed
```