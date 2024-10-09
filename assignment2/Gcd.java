package assignment2;

import java.util.Scanner;

//2.Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.

public class Gcd {
//	Euclidean Algorithm for GCD
	static int gcd(int a, int b) {
		if(a==0) return b;// base
		else {
			return gcd(b%a, a);}}// recursive
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number");
		int first= scanner.nextInt();
		System.out.println("enter second  number");
		int second= scanner.nextInt();
		
		
		int result= gcd(first, second);
		System.out.println(" the GCD is :"+result);
			
	}
	

}
