package day4;

abstract class rastraBank{
	int coletAmount=50000;
	
	
	abstract void intrest();
	
	
	
}
 class garima extends rastraBank{

	@Override
	void intrest() {
		System.out.println("rate is 20%");
		
	}
	 
 }
 
 class Nmb extends rastraBank{

	@Override
	void intrest() {
		System.out.println("2%");
		
	}
	 
 }

public class Abstraction {
	public static void main(String[] args) {
		garima grGarima = new garima();
		grGarima.intrest();
		int coletAmount = grGarima.coletAmount;
		System.out.println(coletAmount);
		
		rastraBank nmBank = new Nmb();
		nmBank.intrest();
		int coletAmount2 = nmBank.coletAmount;
		System.out.println(coletAmount2);
	}

}
