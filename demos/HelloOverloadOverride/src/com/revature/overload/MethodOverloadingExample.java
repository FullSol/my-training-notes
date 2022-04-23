package com.revature.overload;

public class MethodOverloadingExample {
	// Method overloading is methods having the same name and different signatures by datatypes or number of arguments
	// Parameters must be different, method name must be the same, return type does not affect overloading
	// This is an example of Polymorphism
	
	public static void main(String[] args) {
		System.out.println("Calling add()...");
		System.out.println(add(4.3, 6.4, 9.1));
		System.out.println(add(4.5, 6.2));
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int add(double a, double b) {
		// casting prevents type coercion
		return (int) (a + b);
	}
	
	public static double add(double a, double b, double c) {
		// casting prevents type coercion
		return a + b + c;
	}

}
