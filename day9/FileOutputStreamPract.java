package day9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamPract {
	public static void main(String[] args) throws IOException {
		
//		try {
//			
//			String filepathString="C:\\Users\\Romeo\\OneDrive - Crimson College of Technology\\Documents\\code\\yahoooooooo.txt";
//			
//			File file = new File (filepathString);
//			FileOutputStream outputStream = new FileOutputStream(file,true);
//			String valuestr = " but this is not java file ";
//			
//			byte[] content =  valuestr.getBytes();
//			outputStream.write(content);
//			outputStream.close();
//			
//			System.out.println("sucess>>");
//			
//		} catch (Exception e) {
//			e.getMessage();
//			
//		}
		
		
		
		try {
			String filepathString="C:\\Users\\Romeo\\OneDrive - Crimson College of Technology\\Documents\\code\\yahoooooooo.txt";
			File file = new File(filepathString);
			FileInputStream fileInputStream = new FileInputStream(file);
			int data = fileInputStream.read();
			while(data  !=-1) {
				System.out.print((char)data);
				data = fileInputStream.read();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
