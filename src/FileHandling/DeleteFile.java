package FileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {

		String filePath = "info/myFile.txt";
		File file = new File(filePath);

		if (file.exists()) {
			file.delete();
			System.out.println("File has been successfully deleted from: " + filePath);
		}

	}

}
