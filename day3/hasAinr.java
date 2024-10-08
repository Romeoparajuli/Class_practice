package day3;



//agirgation
class A{
	String nameString;
	
	A(String namString) {
		this.nameString=namString;
		
	}
	 void getName() {
		 System.out.println("the name is :"+nameString);
	 }
}



class B{
	A a;
	 B( A a ) {
	this.a = a ;
	
	}
	 
	 void callName() {
		 a.getName();
	 }
}



public class hasAinr {
	public static void main(String[] args) {

		A a = new A("milan");
		B b =  new B(a);
		b.callName();
	}

}
