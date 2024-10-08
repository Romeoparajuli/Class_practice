package javaclassProject.com;

public class Person {
	String name;
	int salary;
	static String workplace = "NCCAA LUMBINI";

	Person(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	void Display() {
		System.out.println("name:" + name + "\n" + "salary :" + salary + "\n" + "workplace:" + workplace);
	}

	public static void main(String[] args) {
		Person p1 = new Person("milan Parajuli", 20000);
		p1.Display();

	}
}
