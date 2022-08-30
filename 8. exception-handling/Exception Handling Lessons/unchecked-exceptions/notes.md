# Unchecked Exceptions

- They happen during the runtime, will crash your application
- Result of badly written code
- Never catch an unchecked exception, fix your code.
  - ArrayIndexOutOfBoundsException
  - NullPointerException
  - IllegalArgumentException
  - InputMismatchException (User enter value that Scanner isn't expecting)
  - IllegalStateException
  - etc

- Never replace if-else with try-catch