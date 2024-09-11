# [**Garbage Collection**](https://github.com/Ajallen14/S3_Java_Lab/tree/main/Garbage%20Collection)
Garbage collection is a mechanism that automatically manages memory allocation and deallocation for Java objects. It's a form of automatic memory management that helps to prevent memory leaks and reduce the risk of null pointer exceptions.


**How Garbage Collection Works**

    * Object Creation: When a new object is created, memory is allocated for it on the heap.
    * Object Usage: The object is used by the program, and references to it are stored in variables, data    structures, or other objects.
    * Object Becomes Unreachable: When an object is no longer referenced by any part of the program, it becomes eligible for garbage collection.
    * Garbage Collection: The Java Virtual Machine (JVM) periodically runs a garbage collector, which identifies objects that are no longer reachable and reclaims their memory.
    * Memory Reclamation: The reclaimed memory is made available for future object allocations

# [**Matrix**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Matrix/matrix.java)
**createMatrix()**: Creates a matrix by asking the user to input the values of each element.

**checkIfValid()**: Checks if the number of columns in Matrix A is equal to the number of rows in Matrix B.

**displayMatrix()**: Displays a matrix.

**multiply()**: Multiplies two matrices and returns the resultant matrix

# [**Polymorphism**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Polymorphism/polymorphism.java)
Polymorphism allows objects of different classes to be treated as objects of a common superclass. This means that objects of different classes can be referred to using a common reference variable, and the correct method to be called is determined at runtime based on the actual class of the object.

It is achieved through :
  - **Method overriding**
  - **Method overloading**

### *Method Overloading*
Method overloading is a type of polymorphism where multiple methods with the same name can be defined, but with different parameter lists. The method to be called is determined at compile-time based on the number and types of arguments passed to the method

### *Method Overriding*
Method overriding is a type of polymorphism where a subclass provides a specific implementation of a method that is already defined in its superclass. The method to be called is determined at runtime based on the actual class of the object.

# [**Exeception Handeling**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Execption%20Handeling/excep_handel.java)
Types of Exceptions :
  - **Checked Exceptions**
  - **Unchecked Exceptions**

  ### Checked Exceptions
  Checked exceptions are exceptions that are checked at compile-time. These exceptions must be handled by the programmer using a try-catch block. 
  Examples of checked exceptions include:
- IOException
- SQLException
- FileNotFoundException

### Unchecked Exceptions
Unchecked exceptions are exceptions that are not checked at compile-time. These exceptions are typically caused by programming errors and can be handled using a try-catch block. 
Examples of unchecked exceptions include:
- NullPointerException
- ArrayIndexOutOfBoundsException
- ArithmeticException

# [**File Handeling**](https://github.com/Ajallen14/S3_Java_Lab/tree/main/File%20Handeling)
Java has two primary classes for file handling:
- **File**: This class represents a file or directory on the file system. It provides methods to create, delete, rename, and manipulate files and directories.
- **RandomAccessFile**: This class allows you to read and write data to a file in a random access manner, meaning you can jump to any position in the file and read or write data.
File Input/Output (I/O) Streams

Java uses streams to read and write data to files. There are two types of streams:

- **InputStream**: Used to read data from a file.
- **OutputStream**: Used to write data to a file.

Some common stream classes for file I/O are:

- **FileInputStream**: Reads data from a file.
- **FileOutputStream**: Writes data to a file.
- **BufferedReader**: Reads text data from a file, buffering the input for efficiency.
- **BufferedWriter**: Writes text data to a file, buffering the output for efficiency.

### Common File Handling Scenarios
- Reading and writing text files: Use *BufferedReader* and *BufferedWriter* to read and write text data to files.
- Reading and writing binary files: Use *FileInputStream* and *FileOutputStream* to read and write binary data to
files.
- Copying files: Use *FileInputStream* and *FileOutputStream* to copy files.
- Reading and writing CSV files: Use *BufferedReader* and *BufferedWriter* to read and write CSV data to files.

# [**Multi-Threaded**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Matrix/matrix.java)
Multi-threading in Java is a process of executing multiple threads or flows of execution concurrently, improving the overall performance and responsiveness of a program. In Java, threads are lightweight processes that can run in parallel, sharing the same memory space.

Multi-threading is useful in scenarios where:

* **Responsiveness**: You want to perform multiple tasks simultaneously, such as handling user input while performing a time-consuming operation in the background.
* **Performance**: You want to take advantage of multiple CPU cores to speed up computationally intensive tasks.
* **Concurrency**: You want to handle multiple requests or connections concurrently, such as in a web server or a chat application.

#### **Java Thread Basics**

In Java, a thread is an instance of the Thread class or a subclass of Thread. You can create a thread in two ways:

* **Extending the Thread class**: By creating a subclass of Thread and overriding the run() method.
* **Implementing the Runnable interface** : By implementing the Runnable interface and providing a run() method.

#### **Thread States**

A thread in Java can be in one of the following states:

* **Newborn**: The thread is created but not started.
* **Runnable**: The thread is eligible to run but may not be currently executing.
* **Running**: The thread is currently executing.
* **Waiting**: The thread is waiting for some event to occur.
* **Sleeping**: The thread is sleeping for a specified amount of time.
* **Blocked**: The thread is blocked due to I/O operations or synchronization.
* **Dead**: The thread has finished executing.

To ensure thread safety, Java provides various **synchronization mechanisms**, including:

* **Synchronized methods**: Methods declared with the synchronized keyword.
* **Synchronized blocks**: Blocks of code enclosed in synchronized statements.
* **Locks**: Objects that can be used to synchronize access to shared resources.


# [**String Tokenzier**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/String%20Tokenizer/str_tonken.java)

# [**Frequency of Character**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Frequency%20of%20a%20character/frequency.java)

# [**Palindrome**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Palindrome/palindrome.java)

# [**Matrix**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Matrix/matrix.java)