package day9;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArrayBufferStram {
	public static void main(String[] args) throws IOException {
		try {

			FileOutputStream fOutputStream=new FileOutputStream("C:\\Users\\Romeo\\OneDrive - Crimson College of Technology\\Documents\\code\\yahoooooooo.txt");
			FileOutputStream fOutputStream2=new FileOutputStream("C:\\Users\\Romeo\\OneDrive - Crimson College of Technology\\Documents\\code\\yahoooooooo1.txt");
			ByteArrayOutputStream bOutputStream = new ByteArrayOutputStream();
			bOutputStream.write(65);
			bOutputStream.writeTo(fOutputStream);
			bOutputStream.writeTo(fOutputStream2);
			
			
			bOutputStream.flush();
			bOutputStream.close();
			System.out.println(" sucess ");
		} catch (Exception e) {
			 e. getMessage();
		}
	}

}
