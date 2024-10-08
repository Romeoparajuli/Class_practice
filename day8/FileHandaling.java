package day8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileHandaling {
	public static void main(String[] args) throws IOException {
//		try {
//			File file = new File(
//					"C:\\Users\\Romeo\\OneDrive - Crimson College of Technology\\Documents\\code\\yahoooooooo.txt");
//			file.createNewFile();
//			// file.mkdir();
//			File absoluteFile = file.getAbsoluteFile();
//			System.out.println(absoluteFile);
//			
//
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.err.println(" got a fucking error ");
//		}
		
		String filepathString="C:\\Users\\Romeo\\OneDrive - Crimson College of Technology\\Documents\\code\\yahoooooooo.txt";
		
//		FileWriter fuFileWriter = new FileWriter(filepathString);
//		String valueString = " sahil is a mutherfucker a big one  ";
//		fuFileWriter.write(valueString);
//		System.out.println(" content is writen");
//		fuFileWriter.close();

		
		FileReader fileReader = new FileReader(filepathString);
		int dataString = fileReader.read();
		while (dataString!= -1) {
			System.out.print((char)dataString);
			dataString = fileReader.read();
			
		}
		
		
	}

}
