# Throw Unchecked exceptions

- We throw unchecked exceptions to maintain quality control
- forbid the caller from misusing methods/cons.

## Most common exceptions to throw:
- IllegalArgumentException
- IllegalStateException (Object calls a method with an Illegal State)
    - Not properly initialized before calling a method.

They act as checkpoints to fix your code.