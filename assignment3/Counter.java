package assignment3;
//.Write a Java program to create a class called "Counter" with a static variable count.
//Implement a constructor that increments count every time an object is created.
//Print the value of count after creating several objects. 
public class Counter {
 static int count =0;
 
 
 Counter(){
	 count++;
	 
 }
  public static int getCount() {
	  return count;
	  
  }
	
	public static void main(String[] args) {
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		
		
		System.out.println(" The total number of objects created ::"+Counter.getCount());
	}
	

}
