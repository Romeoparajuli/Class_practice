package assignment3;
//2.Write a Java program to create a class called Constants 
//with a static final variable 'PI' initialized to 3.14159. 
//Create a method to calculate the area of a circle given its radius, 
//using the 'PI' constant. 
//Demonstrate the method in the main method.
import java.util.Scanner;

public class AreaOfCircle {
	static double PI= 3.14159;
	 double rad;
	
//	
//	AreaOfCircle(double rad){
//		this.rad= rad;
//	}
//	.
	double calculateArea() {
		return PI*rad*rad;
		
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println(" enter the valu of radius in cm :");
		System.out.println(".................................... :");
		double rad=scanner.nextDouble();
		
		AreaOfCircle arc= new AreaOfCircle();
		arc.rad=rad;
		double result= arc.calculateArea();
		System.out.println(".................................... :");
		System.out.println("the area of circle ::"+ result);
	}

}
