# World of Objects

## Object-Oriented Programming
- Find closely related variables
- Combine them into an object

## How to plan your code
- Look for ***objects*** (things)
- Look for ***fields*** that describe each object
- Look for ***actions** the object can perform

## To create a class object
1. The class you're creating an object from.
2. The variable name.
3. The ***new*** keyword
4. The class name followed by parentheses.

        Car nissan = new Car();
5. The variable holds a variable.

Another name for ***object*** is ***instance***.

### The Big 3 when you write a class
- If a class has field/s, it needs
  1. Constructor
  2. Getters
  3. Setters

### The this keyword
***this*** means the current object.

## Public vs Private
- Methods and Constructors are public
- Fields should be private, you should not have direct access to the fields.
- private preserves the state of the object.
- If I need a value, I don't want the actual field, I want a getter to return a copy of it.

## Reference trap
- By mishandling 
  - Arrays
  - Objects
- Do not set class variables (objects) equal to each other!!!

## Copy constructor
It copies every value from one object to another.
### Constructor overload
- Having more than one constructor
- Same name, different parameters.

## Actions
- Action is a method, what an object can do.

## toString method
- connects every field into a String
- toString runs when you print an object!!! (System.out.println(object))

## Setter

1. The setter should only update one object.
2. The setter lets the user choose which one.

***Don't use Arrays.copyof() on an array of objects!!!***

## Almost everything in Java is an Object!!!

### Primitive type
- Most basic data type
- int, double, long, boolean, char
- stores a value directly
- cannot be null
- they have not methods

### Class types
- You can create objects from
- Store a reference that point to an object
- can be null
- can call methods from its class
- String is a Class type
- String is NOT prone to reference trap!!!
- Scanner is also a Class type!
- Arrays are also objects.

### The null value
- primitive values can't be null
- class values can be null.
- class types don't have a fixed memory size.
