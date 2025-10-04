# CalcStage1 (Java Swing) — Stage 1: Singleton + Factory Method

Package: `Calc`

## Files
- `Calculator.java` — Swing UI wired to `CalculatorEngine` (Singleton).
- `CalculatorEngine.java` — holds current/previous/op state and computes using `OperationFactory`.
- `OperationFactory.java` — registry-based factory.
- `OperationCreator.java` + `AddCreator/SubCreator/MulCreator/DivCreator` — Factory Method creators.
- `Operation.java` + concrete ops: `AddOperation/SubOperation/MulOperation/DivOperation`.

## Run
In NetBeans or any IDE:
- New Project (Java with Ant/Gradle/Maven) → add sources under `src/Calc/`.
- Run `Calc.Calculator` (has `main`).

> UI uses `org.netbeans.lib.awtextra.AbsoluteLayout`, which NetBeans resolves automatically.
