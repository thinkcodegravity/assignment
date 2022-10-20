package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
		String filePath = "info/myFile.txt";
		File file = new File(filePath);
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("This is the first line I'm writing.");
		bufferedWriter.write("\n File handling is an important part of any application.");
		bufferedWriter.write("\n Java has several methods for creating, reading, updating, and deleting files.");
		bufferedWriter.close();	
		System.out.println("File has been successfully written at: " +filePath);
	}
}
