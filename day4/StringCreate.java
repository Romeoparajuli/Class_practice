package day4;

public class StringCreate {
	
	public static void main(String[] args) {
//		String string= "mailn";
//		String string1= "mailn";
//		
//		char ch []= {'m','i','l','a','n'};
//		String string3=new String(ch);
//		
//		String string2=  new String("mailn");
//		
//		System.out.println(string);
//		System.out.println(string2);
//		System.out.println(string3);
//		
//		System.out.println(string==string1);
		
		StringBuilder stringBuilder = new StringBuilder("abc");
		StringBuilder append = stringBuilder.append("xvc");
		
        System.out.println(stringBuilder.hashCode()+ " " + append.hashCode());
		
		
		

		
	}

	
	

}
