# DS & A Questions

> Note: Don't forget about this document. [Revature Study Guide](https://sites.google.com/revature.com/studyguide/java?authuser=0). The references in this document are from the internet through google searches. These provide additional references to the material below.

> Documented by Dhruv Patel, editing and formatting - Calvin Raines

## What is a data structure? What is an algorithm?

### Algorithms
The methods that perform useful computations (line by line instructions to solve a problem or complete a task). The algorithms are said to be polymorphic: the same method can be used on many different implementations of the collection interface.

### Data Structure
A particular way of organizing data in a computer so that it can be used effectively.


    
Types of Data Structures\*:

* Array
* Linked List
* Stack
* Queue
* Binary Tree
* Binary Search Tree
* Heap
* Hashing
* Graph

**_The data structure can also be classified as:_**

**Static data structure** - is the type where the size is allocated at the compile time. Therefore, the maximum size is fixed.

**Dynamic Data structure** - The size is allocated at the run time. Therefore, the maximum size is flexible.

[My Great Learning: Data Structures & Algorithm using Java a Beginners Guide](https://www.mygreatlearning.com/blog/data-structures-using-java/#what-are-data-structure)
        
## How would you make your own algorithm?

* Sequence of steps to solve a problem or complete a task.

> For example: If we want to create sum of two numbers.

**Step 1**: Determine the goal of the algorithm. <br>
**Step 2**: Read input A and B.<br>
**Step 3**: Process the input A and B: Sum = A + B <br>
**Step 4**: Print Sum -> System.out.println(Sum); <br>
**Step 5**: Stop <br>

> Another example of Algorithm:

![Algorithm Example](./images/Alg_Day2.png)

## What is a breadcrumb statement?\**
A trail of events that occurred in your application leading up to the primary error. They can be as simple as generic logging messages, or they can contain rich metadata about the state of your application: network requests, database queries, UI events, navigation changes, or even earlier occurring errors.

> example

```
for(int i = 0; i < 200; i++){
	//... do something
	System.out.println(i)	// Breadcrumb statement
}

```

[Sentry.io: Debug Issues Faster with Breadcrumbs](https://blog.sentry.io/2016/05/04/breadcrumbs)

## What is the difference between time complexity and space complexity?

**Time Complexity** - is the computational complexity describing the amount of time required for the execution of an algorithm.

* It measures the time taken by every statement of the algorithm, and It is highly dependent on the size of the processed data.
* It also helps define the effectiveness of an algorithm and to evaluate its performance.

**Space complexity** - represents the amount of memory on program uses in order to achieve its execution. Because the program needs memory to store input data and temporary values while being executed, space complexity is auxiliary and input space.

## What are asymptotic notations / What is Big##O?

**Asymptotic notations** - is used to describe the running time of an algorithm, how much time an algorithm takes with a given input, n.

### Big O
* Big O notation: means time in simpler terms (How much time its going to take?)
* The number of operations that the computer will manke is equal to the input size squared
* O(n^2)
* Big -O notion give an upper bound of the computational complexity of an algorithm in the worst case
    
![Big O Notation](./images/Big_O_Notation.png)

## What is amortized analysis?
Finds the average cost of each operation in a sequence, when the sequence experiences its worst-case. This way, we can estimate a more precise bound for the worst-case of our sequence.

## What is a stack?
A linear data structure which follows a particular order in which the operations are performed. The order may be LIFO (Last in First Out) or FILO (First in Last Out).

## What is an array?
A collection of items stored at contiguous memory locations. Storing multiple items of the same type together. This makes it easier to calculat ethe posititon of each element by adding an offset to a base value.

> Ex: the memory location of the first element of the array (generally denoted by the name of the array). The base value is index 0 and the difference between the two indexes is the offset.

## How are arrays indexed?
Arrays are indexed starting with the number 0 for the first element and increasing for each consecutive element

* Array can be indexed (access) by referring to its index number.
* In the example bellow the indexes in NumPy arrays start with 0, meaning that the first element has index 0, and the second has index 1.

```
import numpy as np
arr = np.array([1, 2, 3, 4])
print(arr[0])
```

## What is Recursion?
The process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called as recursive function. Using recursive algorithm, certain problems can be solved quite easily.·

>Ex:

```
int fact(int n){
	if (n < = 1) // base case
	return 1;
else
	return n*fact(n-1);
}
```

## What is an ArrayList?
A part of collection framework and is present in java.util package. It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.

The difference between Array and Array List in Java is that the size of an array cannot be modified ( if you want to add or remove elements to/from an array, you have to create a new one). While eleents can be added and removed from an ArrayList.

<hr>

\* Reviewed item edited by Calvin Raines<br>
\* Reviewed item edited by Levi Choi
