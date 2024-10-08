package day11;


@FunctionalInterface

public interface FunctionalInterfacePra {
	
	 int sum(int a ,int b);
	
	 default int multiply(int a , int b ) {	return a*b;}
	 static int div (int a , int b ) {return a*b;}
	  
	 default double subtract (double a , double b ) {return a-b;}

}
