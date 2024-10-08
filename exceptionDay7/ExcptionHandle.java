package exceptionDay7;

public class ExcptionHandle {
	public static void main(String[] args) {
		
//		try {
//			System.out.println("before");
//			int a= 10/0;
//			System.out.println(a);
//			System.out.println("after");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			
//			
//			
//		}
//	
//		try {
//
//			String string = null;
//			int len = string.length();
//			System.out.println(len );
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		
		
//		//Index  out of bounds
//		try {
//			int a[]= {1,2,3,4,5};
//			System.out.println(a[10]);
//			
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			
//			
//		}
//		
		
		try {
			String string= "nccaa";
			int num= Integer.valueOf(string);
			
			
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} 
		
		catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		} finally {
			System.out.println("after");
		}
		
		
		
			
	}

}
