# Booleans & Conditionals

## boolean true/false
1. The value type: boolean.
2. The variable name
3. The variable value


boolean bool1 = true;

Booleans are useful if written in comparisons.

### Comparisons
- >
- <
- >=
- <=
- ==
- !=
- equals (equal to (for String))
- !equals (not equal to (for String))

## if statements
1. The condition
2. The code (runs if condition is true)
3. When condition is false it runs the else statement.

## Logical Operators
- Let you compare many things at once
- The most common are: OR and AND

### OR ||
We can combine as many comparisons as we want. If one them is true then the condition is true. Checks if one of the comparisons is true.

### AND &&
true if every comparison is true.

## switch
- switch compares one value against a list of values

•

## Delimiters
- white space that separates input data
- scan methods nextInt(), nextLong(), nextDouble(), next() skip the delimiter and read the next value.
- scan.nextLine() It reads the current line, entire line and doesn't care about delimiters.

The scan.nextLine() trap when some of the other methods are ahead methods of the scan.nextLine() method. We have to call a throwaway scan.nextLine() before the real scan.nextLine().