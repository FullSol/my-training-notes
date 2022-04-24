package com.revature.drivers;

import com.revature.Saiyan;

public class Driver {
	
	// variable scope = can java see this variable and use it.
	// 1. static/class scope = only visible within the class
	// static loves static
	// static keyword is a non-access modifier that signals to Java that this variable/method
	// only applies to its current class.
	// 2. method scope = visible inside of given method
	// 3. block scope = visible within a block of code (ex. for loop, int i)
	// shadowing = when there are two variables of the same name, the one in the closest proximity takes over.
	// non-access modifiers: static, abstract, final, volatile, synchronized, transient
	// a modifier allows for fine-tuning of access to code.
	
	static int id = 10000; // class/static scope
	
	public static void main(String[] args) {
		// Instantiate a new object
		Saiyan goku = new Saiyan("Goku", "Spirit Bpmb", 100000, 500000);
		
		System.out.println(goku);
		
		variableScopeExample();
	}
		
	public static void variableScopeExample() {
	// int id = 2000; // method scope
		
		for (int id = 1502; id < 1503; id++) {
			System.out.println(id);
		}
	} 

}
