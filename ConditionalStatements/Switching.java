package ConditionalStatements;

import java.util.Scanner;

public class Switching {
	public static void main(String[] args) {
		System.out.println("press any key");
		Scanner scanner = new Scanner(System.in);
		int  button = scanner.nextInt();
		switch(button) {
		case 1  :
			System.out.println("you pressed 1 "); break;
		
		case 2  :
			System.out.println("you pressed 2 "); break;
		case 3  :
			System.out.println("you pressed 3 "); break;
		default:System.err.println("invalid!!!!");
		
		}
		
	}

}
