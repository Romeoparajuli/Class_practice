package day4;

interface parent{
	int val = 90000;
	void saySomthing();
	
	int throwSomething(int i ,int j);
}

class child implements parent{

	@Override
	public void saySomthing() {
		System.out.println(" say hello ");
		
		
	}
	@Override
	public int throwSomething(int i, int j) {
		int sum= i+j;
		
		return sum;
	}
	
}

public class Interfaceclass {
	
	public static void main(String[] args) {
		
		parent chiParent= new child();
		chiParent.saySomthing();
		int result=chiParent.throwSomething(5, 05);
		System.out.println(result);
		int val = chiParent.val;
		System.out.println("nnnnn:"+val);
		
	}

}
