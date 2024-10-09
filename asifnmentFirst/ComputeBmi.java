package asifnmentFirst;


//3.Write a Java program to compute the body mass index (BMI).[ BMI = weight/height2.]
import java.util.Scanner;



public class ComputeBmi {
//	
//	public static void main(String[] args) {
//		double height;
//		double weight;
//	
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(" enter your height ");
//		height = scanner.nextDouble();
//		System.out.println(" enter your wight ");
//		weight = scanner.nextDouble();
//		 if (height<=0||weight<=0)System.err.println("invalid height or weight!!");
//		
//		 else {
//			 double bmi = weight/(height*height);
//		System.out.println("the  bmi :"+ bmi);
//		 }
//	}

	double height;
	double weight;

	void getMeasurement(double height, double weight) {
		this.height = height;
		this.weight = weight;

	}

	double getBmi() {
		if (height <= 0 || weight <= 0)
			System.err.print("Height and weight must be positive values");

		return weight / (height * height);
	}

	public static void main(String[] args) {
		Scanner scs = new Scanner(System.in);
		System.out.println("enter your height");
		double height = scs.nextDouble();
		System.out.println("enter your weight");
		double weight = scs.nextDouble();

		ComputeBmi cBmi = new ComputeBmi();
		cBmi.getMeasurement(height, weight);
		double bmi = cBmi.getBmi();
		System.out.println("the  bmi :" + bmi);

	}

}
