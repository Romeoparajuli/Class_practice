package javaclassProject.com;

import java.util.Scanner;

import javax.naming.AuthenticationException;

public class Variables {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number");
		int a =scanner.nextInt();
		System.out.println("enter the second number");
		int b =scanner.nextInt();
		int sum = a+b;
		
		System.out.println("the sum of 2 numbers is :"+sum);
		

	}

}
