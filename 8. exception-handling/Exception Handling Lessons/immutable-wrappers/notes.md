# Wrappers

- Wrapper is an immutable class that wraps around a primitive.
- Every ***primitive*** type has a immutable wrapper class

1. int ==> ***Integer***
2. long ==> ***Long***
3. double ==> ***Double***
4. char ==> ***Character***
5. N/A ==> ***String***

***IMMUNE TO THE REFERENCE TRAP***

## When to use Primitive vs Wrapper:

- Use Primitive 90% of the time. (less space, faster)
- Use Wrapper when you need the variable to be:
  - nullable
  - to call methods