# [Garbage Collection](https://github.com/Ajallen14/S3_Java_Lab/tree/main/Garbage%20Collection)
Garbage collection is a mechanism that automatically manages memory allocation and deallocation for Java objects. It's a form of automatic memory management that helps to prevent memory leaks and reduce the risk of null pointer exceptions.


**How Garbage Collection Works**

    * Object Creation: When a new object is created, memory is allocated for it on the heap.
    * Object Usage: The object is used by the program, and references to it are stored in variables, data    structures, or other objects.
    * Object Becomes Unreachable: When an object is no longer referenced by any part of the program, it becomes eligible for garbage collection.
    * Garbage Collection: The Java Virtual Machine (JVM) periodically runs a garbage collector, which identifies objects that are no longer reachable and reclaims their memory.
    * Memory Reclamation: The reclaimed memory is made available for future object allocations

# [Matrix](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Matrix/matrix.java)
**createMatrix()**: Creates a matrix by asking the user to input the values of each element.

**checkIfValid()**: Checks if the number of columns in Matrix A is equal to the number of rows in Matrix B.

**displayMatrix()**: Displays a matrix.

**multiply()**: Multiplies two matrices and returns the resultant matrix

# [Polymorphism](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Polymorphism/polymorphism.java)
Polymorphism allows objects of different classes to be treated as objects of a common superclass. This means that objects of different classes can be referred to using a common reference variable, and the correct method to be called is determined at runtime based on the actual class of the object.

It is achieved through :
  - **Method overriding**
  - **Method overloading**

## Method Overloading
Method overloading is a type of polymorphism where multiple methods with the same name can be defined, but with different parameter lists. The method to be called is determined at compile-time based on the number and types of arguments passed to the method

## Method Overriding
Method overriding is a type of polymorphism where a subclass provides a specific implementation of a method that is already defined in its superclass. The method to be called is determined at runtime based on the actual class of the object.
