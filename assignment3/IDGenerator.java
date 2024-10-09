package assignment3;
//3.Write a Java program to create a class called "IDGenerator" with a 

//static variable 'nextID' and a static method "generateID()" that 
//returns the next ID and increments 'nextID'. 
//Demonstrate the usage of generateID in the main method.

public class IDGenerator {

	static int nextId = 100000;
    static int generateId() {return nextId++;}
    public static void main(String[] args) {
		System.out.println("the generated Id:" + IDGenerator.generateId());
		System.out.println("the generated Id:" + IDGenerator.generateId());
		System.out.println("the generated Id:" + IDGenerator.generateId());
		System.out.println("the generated Id:" + IDGenerator.generateId());
	}

}
