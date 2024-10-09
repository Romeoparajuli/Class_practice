package assignment2;

//3.Write a Java program to create a class called "Book" 
//with instance variables title, author, and price. 
//Implement a default constructor and two parameterized constructors: 
//One constructor takes title and author as parameters.
//The other constructor takes title, author, and price as parameters.
//Print the values of the variables for each constructor.
public class Book {

	private String title, author;
	private double price;

	Book() {
		this.title = "unknown";
		this.author = "unknown";
		this.price = 0.0;

	}

	Book(String title, String author) {
		this.title = title;
		this.author = author;

	}

	Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;

	}

	void displayData() {
		System.out.println("the title of the book is:" + title);
		System.out.println("the auther of the book is:" + author);
		System.out.println("the price of the book is:" + price);

	}

	public static void main(String[] args) {

		Book book = new Book();// defult
		Book book2 = new Book("java", "oracal");
		Book book3 = new Book("python", "Dhungana ", 10000);

		book.displayData();
		System.out.println("");
		book2.displayData();
		System.out.println("");
		book3.displayData();
		System.out.println("");

	}

}
