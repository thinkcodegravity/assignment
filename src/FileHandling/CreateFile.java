package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {

//		String filePath = "D:/Filehandling/myfile.txt";  	// This is a static way for creating a file
		String filePath = "info/myFile.txt";   				// This is a dynamic way for creating a file
		File createFile = new File(filePath);
		if (createFile.exists() == false) { 	// check if file does not exist
				createFile.createNewFile(); 	// creates a file if file does not exists.
				System.out.println("File created at: " + filePath);
		} else {
			System.out.println("File already exists.");
		}
	}

}
