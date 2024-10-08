package day9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStram {

	private static final String Student = null;

	public static void main(String[] args) {

		//Student std = new  Student(011, 25, "milan parjuli", "palpa");

		try {
			String filePathString = "C:\\Users\\Romeo\\OneDrive - Crimson College of Technology\\Documents\\code\\yahoooooooo.txt";
			File file = new File(filePathString);
			
			//ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
			
			//out.writeObject(std);
			
			//out.close();
			
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
			 Student stdStudent = (Student)inputStream.readObject();
			 
			 System.out.println(stdStudent.toString());
			
			
			

		} catch (Exception e) {
			e.getMessage();
			
		}
		
	}
}
