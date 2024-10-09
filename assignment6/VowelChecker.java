package assignment6;
//3.Write a Java program to create a method that takes a string as input and 
//throws an exception if the string does not contain vowels.
import java.util.Scanner;

class check{
	void checkvowel(String inputString ) throws NoVowelsException{
		if(!inputString.matches(".*[aeiouAEIOU].*"))
			throw new NoVowelsException("no vowles");
		else {
			System.out.println(" the string has vowles");}}}


public class VowelChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the sentence :");
		String input = scanner.nextLine();
		try {
			check check = new check();
		check.checkvowel(input);
			
		} catch (Exception e) {
			System.out.println(" exception cought "+  ""+e.getMessage());
		}
		
	}
	

}
