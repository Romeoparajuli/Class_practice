package day3;


 class parent{
	
        final void sum(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	
}

class child extends parent{
	
	void sum(int a,int b, int d) {
		int c = a+b+d;
		System.out.println(c);
	}
}

public class overriding {
	public static void main(String[] args) {
		child child = new child();
		child.sum(1, 6,1);
	}

}
