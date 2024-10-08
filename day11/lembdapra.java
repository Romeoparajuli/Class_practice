package day11;import java.util.concurrent.ForkJoinTask;

public class lembdapra {
	public static void main(String[] args) {
//		FunctionalInterfacePra prc = (a ,  b)-> a+b;
//		
//		System.out.println(prc.sum(1, 2));
//		System.out.println(	prc.multiply(2, 3));
//		
		FunctionalInterfacePra abc=( a ,b )->{ 
			int c = a+b;
			return c;
			};
		System.out.println(abc.sum(1, 2));
		
	

	}
}
