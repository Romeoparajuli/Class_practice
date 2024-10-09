package asifnmentFirst;

import java.util.Scanner;
//4. Write a Java program that takes a number from the user 
//and generates an integer between 1 and 7.
//It displays the weekday name.
public class DayCalander {
	public static void main(String[] args) {
		System.out.println(" enter any key from 1 to 7");
		Scanner scanner = new Scanner(System.in);

		int button = scanner.nextInt();

		switch (button) {
		case 1:
			System.out.println("sunday");

			break;
		case 2:
			System.out.println("monday");

			break;
		case 3:
			System.out.println("tuesday");

			break;
		case 4:
			System.out.println("wednseday");

			break;
		case 5:
			System.out.println("thursday ");
			break;
		case 6:
			System.out.println("friday");

			break;
		case 7:
			System.out.println("saturday");

			break;

		default:
			System.err.println("invalid key pressed !!");
			break;
		}

	}
}
