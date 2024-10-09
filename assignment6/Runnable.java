package assignment6;

import java.util.Scanner;

//.Write a Java program to create an interface Shape with the getArea() method. 
//Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
//Implement the getArea() method for each of the three classes.
class Rectangle implements Shape {
     double  length, breath;
     Rectangle(double length, double breath) {this.length= length;this.breath=breath;}
	@Override
	public double getArea() {return  length*breath ; }}

class Triangle implements Shape{
	double base, hight;
	Triangle(double base,double hight){this.base=base;this.hight=hight;}
	@Override
	public double getArea() {return  (base*hight)/2;}}

 class  Circle implements Shape{
	 double rad; static double pi = 3.14;
	 Circle(double red){this.rad = rad;}
	 public double getArea() {return pi*rad*rad;}}
		 
	 
 

public class Runnable {
	 public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println( " Finding the area of Rectangle ");
		System.out.println( " --------------------------------- ");

		System.out.println("enter the length of rectangle ");
		double length= scanner.nextDouble();
		System.out.println("enter the breath of rectangle ");
		double breath= scanner.nextDouble();
		
		Rectangle rectangle = new Rectangle(length, breath);
		System.out.println("......................................");
		System.out.println(" the area of rectangle is :"+ rectangle.getArea());
		System.out.println("......................................");
		
		
		
		System.out.println(" Finding the area of  triangle ");
		System.out.println("......................................");
		System.out.println(" Enter the hight of triangle ");
		double hight=scanner.nextDouble();
		System.out.println(" Enter the base of triangle ");
		double base = scanner.nextDouble();
		
		Triangle triangle = new Triangle(base, hight);
		System.out.println("......................................");
		System.out.println("the area of triangle is "+ triangle.getArea() );
		System.out.println("......................................");
		
		
		System.out.println("the area of circle ");
		System.out.println("......................................");
		System.out.println("enter the radious :");
		double rad = scanner.nextDouble();
		System.out.println("......................................");
		Circle circle = new Circle(rad);
		System.out.println("the area of circle "+circle.getArea());
		System.out.println("......................................");
		
		
		
		
		
		
		
		
		
		
		
		 
		 
	//	Rectangle rectangle = new Rectangle(12, 2);
		///rectangle.getArea();
		//rectangle.Display();
		
	}

}
