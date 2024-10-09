package assignment6;

//2.Write a Java program to create a Animal interface with a method called bark()
//that takes no arguments and returns void. Create a Dog class that implements Animal
//and overrides speak() to print "Dog is barking".
//

interface Animal{void bark();}
	
class Dog implements Animal{@Override public void bark() {System.out.println( " the dog is barking  vou vou  ");}}

public class MainRunnable {
	public static void main(String[] args) { Dog dog = new Dog(); dog.bark();}

}
