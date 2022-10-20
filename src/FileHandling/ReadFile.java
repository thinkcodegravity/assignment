package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		String filePath = "info/myFile.txt";
		File file = new File(filePath);

		if (file.exists()) {
			FileReader fileReader = new FileReader(filePath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine(); // the first line is copied in a string
			while (line != null) { // if the line is not null enter the loop and print
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} else {
			System.out.println("File not found. Please check the file path.");
		}

	}
}
