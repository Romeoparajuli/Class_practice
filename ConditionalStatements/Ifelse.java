package ConditionalStatements;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
//		System.out.println("enter  your age :");
		Scanner scanner = new Scanner(System.in);
//		int age = scanner.nextInt();
//
//		if (age > 18) {
//			System.out.println("you are adult");
//
//		} else {
//			System.out.println(" you are not adult ");
//		}

		checkAge(scanner);
	
		 

	}

	private static void checkAge(Scanner scanner) {
		System.out.println("enter  your age :");
		int age = scanner.nextInt();
		if (age>18) {
			System.out.println("you are adult");
			
		} else {System.out.println("you are kid ");

		}
		
		System.out.println("Do you want to continue ? (y/n)");
		 String anString = scanner.next();
		 if(anString.equalsIgnoreCase("y")) {
			 checkAge(scanner);
		 }
		
	}

}
