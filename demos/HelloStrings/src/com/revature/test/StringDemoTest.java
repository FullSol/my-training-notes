package com.revature.test;

import static org.junit.Assert.*;

import com.revature.Driver;

import org.junit.BeforeClass;

import org.junit.Test;

public class StringDemoTest {
	
	/**
	 * Unit testing is a part of TDD (Test Driven Development)
	 * TDD - first make your test and then write code to pass the test
	 * Our testing framework in Java is called JUnit
	 * 
	 * WHen making the Unit Test remember the 3 A's:
	 * 	- Arrange - Setup the test by providing the preliminary/needed code (ex. class instance Animal needed for AnimalTest)
	 * 	- ACT - Invocation of the method being tested. (ex. Animal.speak())
	 * 	- Assert - Check if the expectations were met. (ex. assertEquals(expected is bark, actual should be also bark))
	 */
	
	public static Driver target;
	
	@BeforeClass
	public static void setup() {
		target = new Driver();
	}
	
	@Test
	public void fancyString_positiveTest() {
		String expected = "test-string";
		assertEquals(expected, target.fancyString("test"));
	}

}
