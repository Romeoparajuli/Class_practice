package asifnmentFirst;

import java.util.Scanner;

//2.Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
public class SumAll {

	public static void main(String[] args) {
		Scanner dvScanner = new Scanner(System.in);

		System.out.println(" enter the integer between 0 to 1000 ");
		int num = dvScanner.nextInt();

		if (num < 0 || num > 1000)
			System.err.println("Please enter a valid integer between 0 and 1000.");
		else {
			int sum = 0;
			while (num > 0) {
				int digit = num % 10;// Get the last digit
				sum += digit;// // Add the digit to the sum
				//sum = sum+digit;
				num /= 10; // Remove the last digit
			}
			System.out.println("the sum of inputed number  :" + sum);

		}

	}

}
