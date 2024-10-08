package day5;

public class StringPractice {
	public static void main(String[] args) {
//		String string= "java";
//		System.out.println(string);
//		String s1=string.concat("is oops");
//		System.out.println(s1);
////		
//		String s1="java string";    
//		// The string s1 does not get changed, even though it is invoking the method      
//		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
//		s1.concat("is immutable");    
//		System.out.println(s1);    
//		s1=s1.concat(" is immutable so assign it explicitly");    
//		System.out.println(s1);  
//		
//	
		// string buffer test

//		
//		StringBuffer s1 = new StringBuffer("hello");
//		
//		System.out.println(s1);
//		s1.append(" world");
//		s1.append(" this is milan parajuli");
//		System.out.println(s1);
		
//		
//		StringBuffer s1 = new StringBuffer("hello");
//		System.out.println(s1);
//		s1.insert(2," world");
//		s1.append(" this is milan parajuli");
//		System.out.println(s1);
//
//		
//		String s1="hello";  
//		String s2="hello";  
//		String s3="meklo";  
//		String s4="hemlo";  
//		String s5="flag";  
//		System.out.println(s1.compareTo(s2));  
//		System.out.println(s1.compareTo(s3)); 
//		System.out.println(s1.compareTo(s4)); 
//		System.out.println(s1.compareTo(s5)); 
//		
		
//		String s1=" "; 
//		//String s3="";
//		String s2="javatpoint";  
//		  
//		System.out.println(s1.isEmpty());  
//		System.out.println(s2.isEmpty());
//		System.out.println(s2.isBlank());
//		System.out.println(s1.isBlank());
//		
//		
//		String s1="JAVATPOINT HELLO stRIng";  
//		String s1lower=s1.toLowerCase();  
//		System.out.println(s1lower); 
//		String s1upper=s1.toUpperCase(); 
//		System.out.println(s1upper);
		
		
		
		String s1= "milan was  director of nccaa lumbini";
		String replaceString= s1.replace("was", "is");
		System.out.println(replaceString);
		
		String replaceString2= s1.replaceAll("\\s", "");
		System.out.println(replaceString2);
		
	}

}
