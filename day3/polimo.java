package day3;


class Aa{
	int a;
	int b;
	
	 int sum(int a , int b) {
		 int c= a+b;
		return c;
		 
	 }
	 double sum( double a  ,double b ,double c) {
		double d=a+b+c;
		// System.out.println(d);
		return d;
		 
	 }
	 
}

public class polimo {
	public static void main(String[] args) {
		Aa aa = new Aa();
	    int sum1=	aa.sum(5, 5);
		double sum = aa.sum(5.1, 5.0, 1.0);
		System.out.println(sum1);
		System.out.println(sum);
	}

}
