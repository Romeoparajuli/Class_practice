package ConditionalStatements;

import java.util.Scanner;

public class elseif {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter A number:");
		int a = scanner.nextInt();
		System.out.println("enter b number:");
		int  b = scanner.nextInt();
		
		if (a==b) {
			System.out.println("equals ");
			}else if(a>b) {
				System.out.println("a is grater");
				
			}else {
				System.out.println("b is grater");
			}
	
	}

}
