package day8;



public class StudentTest {
	
	int Sid;
	String nameString;
	Result resuStudent;
	public StudentTest(int sid, String nameString, Result resuStudent) {
		super();
		Sid = sid;
		this.nameString = nameString;
		this.resuStudent = resuStudent;
	}
	
	
	void display() {
		System.out.println("the id is :"+Sid);
		System.out.println("the name is :"+nameString);
		System.out.println(" the Result is :"+resuStudent);
	}
	
	
	public static void main(String[] args) {
		StudentTest studentTest =  new StudentTest(1111, "sahil", Result.NQ);
		studentTest.display();
		System.out.println(Result.valueOf("PASSED"));
		System.out.println(Result.valueOf("PASSED").ordinal());
		
		
	}
	
	
	

}
