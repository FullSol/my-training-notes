package com.revature;

import java.util.Random;

public class Driver {
	
	public static void main(String[] args) {
		// 1. Initialized a new array of int with a size of 20
		// indexing 0 - 19
		// Default value of an int is 0
		// therefore every element in our array has a value of a 0 at start		
		int[] numbers = new int[20];
		int[] numbers2 = new int[20];
		
		Random rand = new Random(50); // 0 - 50 inclusively
		
		System.out.println(numbers[0]);
		
		// 2. iterate through the array and assign each element a random number
		for(int i=0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(50) + 1;
			numbers2[i] = (int) (Math.random() * 50); //using the math class
		}
		
		System.out.println(numbers[0]);
		// 3. print our array to the console.
		for(int element : numbers) {
			System.out.print(element+ ", ");
		}
		
		System.out.println("\n-----------------------");
		
		for(int element : numbers2) {
			System.out.print(element+ ", ");
		}
	}

}
