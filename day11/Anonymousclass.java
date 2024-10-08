package day11;

public class Anonymousclass {
	public static void main(String[] args) {
		
		
		FunctionalInterfacePra test = new FunctionalInterfacePra() {
			
			@Override
			public int sum(int a, int b) {
				int c = a+b;
				
				return c;
			}
		};
		
		
		
		System.out.println(test.sum(2, 2));
		System.out.println(	test.multiply(2, 3));
		System.out.println(test.subtract(10, 6));
	

		
		
		
	   
		
	}

	

}
