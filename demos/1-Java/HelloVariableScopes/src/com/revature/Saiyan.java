package com.revature;

public class Saiyan {
	// Characteristics, aka fields
	// Naming convention = camelCase (lower-case first word, capitalize all other words after.)
	String name;
	String move;
	int powerLevel;
	int defenseLevel;
	
	// behavior = methods
	// constructor = special method that is used for initializing the object
	// By default, if we do not make our own constructor, Java gives a default constructor:
	// public Saiyan(){super()}
	
	public Saiyan() {
		super();
	}
	
	public Saiyan(String name, String move, int powerLevel, int defenseLevel) {
		// this keyword = reference variable that refers to the current class instance
		// ex. Saiyan goku = new Saiyan("Goku", "Spirit Bpmb", 100000, 500000)
		this.name = name;
		this.move = move;
		this.powerLevel = powerLevel;
		this.defenseLevel = defenseLevel;
	}

	// getter & setter are used to have access to our private fields (fields are private by default)
	// private = accessible within only that class
	// default = accessible within the class and its package members
	// public = accessible anywhere
	// protected = accessible to the package and its subclasses
	// private -> protected -> default -> public (least to most accessible)
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}

	public int getDefenseLevel() {
		return defenseLevel;
	}

	public void setDefenseLevel(int defenseLevel) {
		this.defenseLevel = defenseLevel;
	}
	
	// This method is originally from the Object class
	// This @Override is a Java annotation
	// Annotation a tag representing the metadata and is attached to a class, method, interface, or variable/field used by the Java compiler
	@Override
	public String toString() {
		return "Saiyan [name=" + name + ", move = " + move + ", power level = " + powerLevel + ", defense level: " + defenseLevel + "]";
	}
}
