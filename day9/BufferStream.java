package day9;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferStream {
	
	public static void main(String[] args)throws IOException {
		try {
			String filepathString="C:\\Users\\Romeo\\OneDrive - Crimson College of Technology\\Documents\\code\\yahoooooooo.txt";
			
			File file = new File(filepathString);
			FileOutputStream fOutputStream = new FileOutputStream(file);
			BufferedOutputStream bOutputStream= new BufferedOutputStream(fOutputStream);
			String string = "buffer stream practice gare ko ";
			
			byte b []= string.getBytes();
			bOutputStream.write(b);
			bOutputStream.flush();
			bOutputStream.close();
			fOutputStream.close();
			System.out.println(" sucess");
			
		
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
