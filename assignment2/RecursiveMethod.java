package assignment2;

import java.util.Scanner;



//1.Write a Java recursive method to calculate the sum of all numbers from 1 to n.
public class RecursiveMethod {
	
	static int sum(int n)	{
		if (n==1) return 1;// base case
		else {
			return n+sum(n-1);}}  //recursive case 
	
	
	public static void main(String[] args) {
		 System.out.println(" enter the value of n:");
		 Scanner scanner = new Scanner(System.in);
		 int valN= scanner.nextInt();// taking the value of n storing in variable ;
		 
		int result= sum(valN);
		 
		 System.out.println("the sum of n terms is :"+result);
		
	}

}
