package dayTwo;


class X{
	Subject subject;
	
	public X(Subject subject) {
		this.subject=subject;
		
		
	}
	void getSubjectName() {
		System.out.println(subject.nameString);
	}	
}




class Subject {

	int id;
	String nameString;

	public Subject(int id, String nameString) {
		this.id = id;
		this.nameString = nameString;
		X x=new X(this);
		x.getSubjectName();
				

	}

	void getId() {
		System.out.println(id);
	}

	void getName() {
		System.out.println(nameString);

	}

	public static void main(String[] args) {
		Subject subject = new Subject(12, "nepali");
		subject.getId();
		subject.getName();

	}

}
