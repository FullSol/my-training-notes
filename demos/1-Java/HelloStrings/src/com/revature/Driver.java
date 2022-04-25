package com.revature;

public class Driver {

	public static void main(String[] args) {
		/**
		 * Topics: Strings
		 * An array is a sequence of elements of a similar datatype
		 * A string is an array of characters
		 * 
		 * In Java, strings and arrays are immutable
		 * 
		 * This is an example of Javadocs in use:
		 * @author Calvin Raines
		 */
		
		/**
		 * Topic: Strings API
		 * API - Application Programming Interface
		 * The String API consists of built-in methods that help us develop complex strings in our application.
		 * Also allows us to do string manipulation
		 * 
		 */
		String greeting1 = "Hello, my name is Calvin. ";
		String greeting2 = "Welcome to Revature. ";
		
		// Concat joins strings together
		System.out.println(greeting1.concat(greeting2));
		
		/**
		 *  Algorithm for just getting my name to be printed
		 *  1. Find out how big the string is.
		 *  2. Find out at what point my name appears in the string.
		 *  3. Divide the string at that intersection.
		 *  4. Print my name.
		 */
		
		int size = greeting1.length();
		
		// Format allows us to make our own custom strings
		System.out.println(String.format("The size of this string is: %s", size));
		
		// Find the index of C - the first letter of my name
		System.out.println(String.format("My name starts at index: %s", greeting1.indexOf('C')));
		
		String name = greeting1.substring(greeting1.indexOf('C'), greeting1.indexOf('C') + 6);
		
		System.out.println(name);
		
		System.out.println("------------------------");
		
		/**
		 * Algorithm for changing "Welcome to Revature." to "Welcome to Walmart."
		 * 1. Breakdown the string into an array of more strings (words)
		 * 2. Iterate through that array and find Revature
		 * 3. Replace Revature with Walmart.
		 * 4. Put the sting back together
		 * 5. Print out the result
		 */
		
		//TODO Fix this
		
		String[] words = greeting2.split(" ");

		String newGreetings2 = new String();
		
		for(String word: words){
			System.out.println(word);
			
			if(word.equals("Revature.")){
				word.replace("Revature", "Walmart");
			}
		}
		
		for(String w: words) {
			newGreetings2 += String.format("%s ", w);
		}
		
		System.out.println(("Spongebob Square Pants"));
		
	}
	
	/**
	 * StringBuilder vs StringBuffer vs String
	 * StringBuilder, StringBuffer extend from the Object class (the parent class of all objects in Java)
	 * Comparison: Chart in notes
	 * 
	 * StringBuilder & StringBuffer have access to some object class methods like .equals(), clone(), and toString()
	 * 
	 * 
	 */
	
	public static String fancyString(String s) {
		StringBuilder sBuilder = new StringBuilder(s);
		return sBuilder.append("-string").toString();
	}
}
