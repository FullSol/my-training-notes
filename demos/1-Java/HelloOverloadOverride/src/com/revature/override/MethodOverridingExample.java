package com.revature.override;

public class MethodOverridingExample {

	public static void main(String[] args) {
		Wolf howler = new Wolf();
		Animal cat = new Animal();
		
		howler.speak();
		cat.speak();
		
		Animal werewolf = new Wolf();
		werewolf.speak();
	}

}
