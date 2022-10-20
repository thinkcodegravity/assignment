package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataFile {

	public static void main(String[] args) throws IOException {
		
		String filePath = "info/test.properties";
		Properties properties = new Properties();
		FileInputStream fileInput = new FileInputStream(filePath);
		properties.load(fileInput);

		System.out.println(properties.get("username"));
		System.out.println(properties.get("password"));

	}

}
