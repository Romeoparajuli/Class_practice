package asifnmentFirst;

import java.util.Scanner;

//1.Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
public class TempConverter {
	double fahr;
	// Method to set the Fahrenheit temperature

	void setFahrenheit(double fahr) {//setFahrenheit(double fahr): Updates the Fahrenheit temperature in the object.The method takes a parameter fahr, which represents the Fahrenheit temperature.
		this.fahr = fahr;     // The this keyword is used to refer to the current instance's variable fahr, which is being updated with the value passed to the method. 

	}
	 // Method to convert Fahrenheit to Celsius // Computes and returns the Celsius temperature based on the stored Fahrenheit temperature.
	double setCelsious() {
		return (fahr - 32) * 5 / 9;

	}
	
	public static void main(String[] args) {
		System.out.println("Enter temperature in Fahrenheit: ");
		Scanner scanner= new Scanner(System.in);
		double fahr= scanner.nextDouble();
		
		TempConverter Converter= new TempConverter();
		Converter.setFahrenheit(fahr);
		double cel=  Converter.setCelsious();
		System.out.println("Temperature in Celsius:"+cel);
		
		
		
	}
	
//
//	public static void main(String[] args) {
//		
//		
//		
//		System.out.println("Enter the temp in Fahrenheit : ");
//
//		Scanner tScanner = new Scanner(System.in);
//		double far = tScanner.nextDouble();
//		System.out.println(far);
//
//		double cel = (far - 32) * 5 / 9;
//		System.out.println(" the temp in  Celsius : " + cel);
//
//	}

}
