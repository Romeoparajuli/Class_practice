package day11;

public class AreaOFCircle {
	public static void main(String[] args) {
		Circle cr = new Circle() {
			
			@Override
			public double areaOfCircle(double rad) {
				Double c =Math.PI*rad*rad;
				return c;
				
			}
			
			
		};
		System.out.println(cr.areaOfCircle(2.1));
		
		
		// lamda
		
		Circle ccr =(rad)->{
			double arr = Math.PI*rad*rad;
			return arr;
			
		};
		
		System.err.println(ccr.areaOfCircle(2));
	}
	
	

	
	

}
