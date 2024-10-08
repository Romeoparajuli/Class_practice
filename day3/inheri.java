package day3;

class Animal{
	String nameString;
	
	Animal(String nameString){
		this.nameString=nameString;
		
	}
	
	void eat() {
		System.out.println("eat grass");
	}
	
	void sound() {
		System.out.println("Bark");
	}
}

class dog extends Animal{

	dog(String nameString) {
		super(nameString);
		
		super.eat();super.sound();
	
	}
	
}


public class inheri {
	public static void main(String[] args) {
		dog dog = new dog("BullDog");
		//dog.eat();
		//dog.sound();
		
	}

}
