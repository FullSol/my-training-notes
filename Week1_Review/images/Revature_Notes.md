1. [HackerRank](https://www.hackerrank.co) (Paired programming)

	* Initialize array to [10]?
	* Insert into the array the 10 elements
	* Initialize sum to zero
	* Initialize size to array.length
	* Increment the sum by the element value
	* Loop through the array until loop counter reaches size
	* return the final sum

	```
	public static long aVeryBigSum(List<Long> ar){
		long sum;

		for(int i=0; i < ar.lengh; i++){
			sum += ar[i];
		}
		return sum;
	}
	```

2. [OOP Pillars](https://files.slack.com/files-pri/T03B0UEG171-F03BM66EB8F/image.png)
	* Abstraction
		* Hiding implementation details and expose only the functionality to the user
		* Real like examples: Santa & his flying reindeer
		* Java code example: abstract classes aY interfaces
	* Polymorphism
		* "Many forms"; The functions behave differently based on the actiaon impolementation
		* Real life example: States of water
		* Java code example: method ocerloading & overriding
	* Inheritance
		* Defining relationshops between two classes, resultin of the subclass gain the fields & behaviors (methods) of the parent
		* Real life example: subclasses can extend from the aprent class
	* Encapsulation
		* data hiding, the weapping aroun of your code
		* Real life example: Vending machine/arcade crane
		* Java code example: access modifiers, getters/setters

3. Java Coding
	*  variable scopes
		*  can java see this variable and use it.
			1. static/class scope = only visible within the class
			2. method scope
			3. block scope
	*  access modifiers
		* getter & setter are used to have access to our private fields (fields are private by default)
		* private = accessible within only that class
		* default = accessible within the class and its package members
		* public = accessible anywhere
		* protected = accessible to the package and its subclasses
		* private -> protected -> default -> public (least to most accessible)

	* non-access modifiers
		* static
		* abstract
		* final
		* volatile
		* synchronized
		* transient
		
	* object instantiation

	* Strings
 
	* Data Structures / Algorithm basics
		* Data Structures (definition): a way of organizing data so that it can be used effectively
		* creating fast and powerful algorithms.
		* Algorithm (definition): line by line instructions to solve a problem or complete a task
		
		```
		public int countEvens(int elements[]){
			int count = 0;
			for(int i = o; i < elements.length; i++){
				if(elements[i]%2 == 0){
					count++;
				}
			}
		}
		```
		
		* Time complexity (definition): how much time does it take to run an algorithm
		
		* Constant Time O(1) ex:
		
		```
		public int getElementFrom(int [] a, int index){
			return a[index];
		}
		```
		
	* Arrays
		* Arrays (definition): a container object that holds a fixed number of values.
		* Stores multiple values
		* index starts at 0
		* the length of the array is established when the array is created.
		* Immutable (definition): cannot be changed

	* Testing our Java code
		*  What is a test? 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		.
