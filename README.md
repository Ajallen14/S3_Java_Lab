# [**Binary Search**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Binary%20Search/binaryS.java)
Binary search operates on a sorted array by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle of the interval, the search continues in the lower half. Otherwise, it continues in the upper half. This process continues until the value is found or the interval is empty

**Logic**
* The method uses a while loop that continues as long as low is less than or equal to high.
* It calculates the middle index mid and checks if the middle element is equal to the search element.
* If the middle element is less than the search element, it adjusts low to mid + 1 to search the right half.
* If the middle element is greater, it adjusts high to mid - 1 to search the left half.
* If the element is found, it returns the index; if not found, it returns 0.



# [**Doubly Linked List**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Doubly%20Linked%20List/Doubly_linked_list.java)
A Doubly Linked List is a type of linked data structure that consists of a sequence of nodes, where each node contains three components: a data field, a pointer to the next node in the sequence, and a pointer to the previous node. This allows traversal of the list in both directions (forward and backward).

head: a reference to the first node in the list.
tail: a reference to the last node in the list

Each Node object contains:
* data: an integer value stored in the node.
* next: a reference to the next node in the list.
* prev: a reference to the previous node in the list.



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


# [**Frequency of Character**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Frequency%20of%20a%20character/frequency.java)
**Logic**
* An integer variable count is initialized to zero to keep track of the occurrences of the character.
* A for loop iterates through each character of the string:
    * str.charAt(i) retrieves the character at index i.
    * If this character matches ch, the count is incremented
* After the loop completes, the method returns the total count of occurrences of the character.



# [**Garbage Collection**](https://github.com/Ajallen14/S3_Java_Lab/tree/main/Garbage%20Collection)
Garbage collection is a mechanism that automatically manages memory allocation and deallocation for Java objects. It's a form of automatic memory management that helps to prevent memory leaks and reduce the risk of null pointer exceptions.


**How Garbage Collection Works**

    * Object Creation: When a new object is created, memory is allocated for it on the heap.
    * Object Usage: The object is used by the program, and references to it are stored in variables, data    structures, or other objects.
    * Object Becomes Unreachable: When an object is no longer referenced by any part of the program, it becomes eligible for garbage collection.
    * Garbage Collection: The Java Virtual Machine (JVM) periodically runs a garbage collector, which identifies objects that are no longer reachable and reclaims their memory.
    * Memory Reclamation: The reclaimed memory is made available for future object allocations




# [**Inheritance**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Inheritance/Inheritance.java)
Inheritance is a fundamental concept in object-oriented programming (OOP) that allows one class (the child or subclass) to inherit the properties and behaviors (methods) of another class (the parent or superclass). In Java, inheritance promotes code reusability and establishes a hierarchical relationship between classes

**Key Points**
* Single Inheritance: Java supports single inheritance, meaning a class can inherit from only one superclass.

* extends Keyword: The extends keyword is used to declare inheritance. A subclass inherits all the non-private fields and methods from its superclass.

* Method Overriding: A subclass can provide a specific implementation of a method that is already defined in its superclass.

* Constructor: The constructor of the superclass is called when an object of the subclass is created, which can be done explicitly using super().


# [**Matrix**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Matrix/matrix.java)
**createMatrix()**: Creates a matrix by asking the user to input the values of each element.

**checkIfValid()**: Checks if the number of columns in Matrix A is equal to the number of rows in Matrix B.

**displayMatrix()**: Displays a matrix.

**multiply()**: Multiplies two matrices and returns the resultant matrix



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


# [**Palindrome**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Palindrome/palindrome.java)
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward.


1. This method takes a string str as input and initializes two indices: i (starting from the beginning of the string) and j (starting from the end of the string).
2. A while loop runs as long as i is less than j. Inside the loop:
3. It compares the characters at positions i and j.
4. If the characters are not the same, it returns false, indicating that the string is not a palindrome.
5. If they are the same, it increments i and decrements j to check the next pair of characters.
6. If the loop completes without finding any mismatches, it returns true, indicating that the string is a palindrome.


# [**Polymorphism**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Polymorphism/polymorphism.java)
Polymorphism allows objects of different classes to be treated as objects of a common superclass. This means that objects of different classes can be referred to using a common reference variable, and the correct method to be called is determined at runtime based on the actual class of the object.

It is achieved through :
  - **Method overriding**
  - **Method overloading**

### *Method Overloading*
Method overloading is a type of polymorphism where multiple methods with the same name can be defined, but with different parameter lists. The method to be called is determined at compile-time based on the number and types of arguments passed to the method

### *Method Overriding*
Method overriding is a type of polymorphism where a subclass provides a specific implementation of a method that is already defined in its superclass. The method to be called is determined at runtime based on the actual class of the object.


# [**Quick Sort**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Quick%20Sort/quick_sort.java)
Quick Sort is a highly efficient sorting algorithm that follows the divide-and-conquer paradigm. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot. The steps are as follows:

1. Choose a Pivot: Select an element from the array as the pivot. The choice of pivot can vary; common strategies include picking the first element, the last element, the middle element, or a random element.

2. Partitioning: Rearrange the array so that all elements less than the pivot come before it and all elements greater than the pivot come after it. After partitioning, the pivot is in its final position.

3. Recursively Apply: Recursively apply the above steps to the sub-arrays of elements with smaller and larger values.



# [**Simple Calculator**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Simple%20Calculator/cal.java)
wo main packages are used:

1. javax.swing:
  Description: This package is part of the Java Foundation Classes (JFC) and provides a set of lightweight components for building graphical user interfaces (GUIs) in Java applications. Unlike AWT (Abstract Window Toolkit), which uses native system components, Swing components are written entirely in Java and are platform-independent.
  Key Components Used:
    * JFrame: A top-level container that represents a window where components can be added. It serves as the main     window for the application.
    * JTextField: A component that allows the user to enter and edit a single line of text. In this calculator, it is used to display input and results.
    * JButton: A button component that can trigger an action when clicked. Each button in the calculator corresponds to a digit or an operation.

2. java.awt.event:
  Description: This package contains classes and interfaces for handling events in AWT and Swing applications. It provides the necessary tools to respond to user interactions, such as mouse clicks, key presses, and other actions.
  Key Components Used:
    * ActionListener: An interface that must be implemented by any class that wants to handle action events (like button clicks). The actionPerformed method is called when an action event occurs.
    * ActionEvent: A class that encapsulates information about an action event, such as which component triggered the event. It is passed as an argument to the actionPerformed method.



# [**String Tokenzier**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/String%20Tokenizer/str_tonken.java)
* A String Tokenizer in Java is a utility that breaks a string into smaller units called tokens. These tokens can be words, keywords, identifiers, or any other meaningful elements of the string

* You can use the **StringTokenizer class** to tokenize a string.

* you can use the **split() method** of the String class to tokenize a string.


# [**Thread Syncrhronization**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Thread%20Synchronization/Thread_sync.java)
Thread synchronization is a mechanism that ensures that two or more concurrent threads do not simultaneously execute some particular program segment, which can lead to inconsistent or incorrect results. In Java, synchronization is primarily used to control access to shared resources by multiple threads. This is crucial in multi-threaded applications where threads may share data or resources, and without proper synchronization, it can lead to race conditions, data corruption, or unexpected behavior.

**Execution Flow**

When the main method is executed:
  1. Both threads t1 and t2 are started almost simultaneously.
  2. Since both threads are trying to call the print method on the same Display instance, the synchronization mechanism comes into play:
  3. If t1 starts executing print("Hello"), it will acquire the lock on the Display object.
  4. While t1 is sleeping for 1 second, t2 will be blocked from entering the print method because it cannot acquire the lock.
  5. After t1 finishes executing the print method, it releases the lock, allowing t2 to proceed and execute print("world")

# [**Traffic Light**](https://github.com/Ajallen14/S3_Java_Lab/blob/main/Traffic%20Light/traffic_light.java)
**Packages**
1. javax.swing.*: This package contains classes for creating a GUI in Java. It includes components like JFrame, JPanel, JRadioButton, and others that are used to build the user interface.
2. java.awt.*: This package provides classes for components that are dependent on the native system. It includes classes for graphics, colors, and layout management.
3. java.awt.event.*: This package contains classes for event handling in AWT and Swing. It includes interfaces like ActionListener and classes like ActionEvent that are used to handle user actions (like button clicks).

**Key Components**
* JFrame: A top-level container that represents the main window of the application.
* JPanel: A generic container that can hold components and is used for custom painting.
* JRadioButton: A button that allows the user to select one option from a group. In this case, it is used to select the traffic light color.
* ButtonGroup: A class that groups radio buttons so that only one button can be selected at a time.
* Graphics: A class that provides methods for drawing shapes, text, and images on components