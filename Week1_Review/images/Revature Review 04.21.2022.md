## What is the stack trace
A stack trace is a report that provides information about program subroutines. It is commonly used for certain kinds of debugging, where a stack trace can help software engineers figure out where a problem lies or how various subroutines work together during execution.

A stack trace is also known as a stack traceback or a stack backtrace.

## Serialization
Convert its state to a byte stream so that the byte stream can be reverted back into a copy of the object. A Java object is serializable if its class or any of its superclasses implements either the java.

## Getting User Input

```class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
```

## Printing Output

```
class GFG {
    public static void main(String[] args)
    {
 
        // The cursor will remain
        // just after the 1
        System.out.print("GfG1");
 
        // This will be printed
        // just after the GfG2
        System.out.print("GfG2");
    }
}
```

## What is Space Complexity
Space Complexity of an algorithm is the total space taken by the algorithm with respect to the input size. Space complexity includes both Auxiliary space and space used by input. 

```
int add (int n){
    if (n <= 0){
        return 0;
    }
    return n + add (n-1);
}
```
> Here each call add a level to the stack :
>
1.  add(4)
2.    -> add(3)
3.      -> add(2)
4.        -> add(1)
5.          -> add(0)

> Each of these calls is added to call stack and takes up actual memory.
So it takes O(n) space.

## What is a Linked List
A series of nodes that contain data and information on how to get to the next node. A linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a linked list are linked using pointers.

What methods can be used with linked lists?

> .getFirst() - gets the first element
> .getLast() - gets the last element
> .element() - retrieve the head
> .insert() - add to the list
> .next() - moves to the next element

## What is brute force implementation
Straight-forward methods of solving a problem that rely on sheer computing power and trying every possibility rather than advanced techniques to improve efficiency.

## What is inheritance
A concept that acquires the properties from one class to other classes; for example, the relationship between father and son. In Java, a class can inherit attributes and methods from another class. The class that inherits the properties is known as the sub-class or the child class.

## What is abstraction
Data Abstraction is defined as the process of reducing the object to its essence so that only the necessary characteristics are exposed to the users. Abstraction defines an object in terms of its properties (attributes), behavior (methods), and interfaces (means of communicating with other objects).


## What is a sprint
A sprint is a short, time-boxed period when a scrum team works to complete a set amount of work. Sprints are at the very heart of scrum and agile methodologies, and getting sprints right will help your agile team ship better software with fewer headaches.  


## How would we use an interface in a subclass
An interface is a completely "abstract class" that is used to group related methods with empty bodies:

```
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

## How to create a custom exception
You can create a custom exception by extending the RuntimeException class.

## Multidimensional Arrays in Java
Multidimensional Arrays can be defined in simple words as array of arrays. Data in multidimensional arrays are stored in tabular form (in row major order).

Syntax:

`data_type[1st dimension][2nd dimension][]..[Nth dimension] array_name = new data_type[size1][size2]….[sizeN];`

where:

data_type: Type of data to be stored in the array. For example: int, char, etc.
dimension: The dimension of the array created.
For example: 1D, 2D, etc.
array_name: Name of the array
size1, size2, …, sizeN: Sizes of the dimensions respectively.

*[Geeks for Geeks](https://www.geeksforgeeks.org/multidimensional-arrays-in-java/)*

## What are some of the main features of Java

## Difference between abstraction and encapsulation

## How would you implement encapsulation

## List the datatypes from smallest to largest
1. boolean
2. short
3. int
4. long
5. float
6. double
7. boolean
8. char
