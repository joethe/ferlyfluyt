//
// Team: Ferly Fluyt
// Programming Competition Java Templates
// Main template
//

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
	String inputFile = "inputTest.txt";
	String outputFile = "outputTest.txt";

	ReadFromFile(inputFile);
	WriteToFile(outputFile, "Bippity Boppity Boo!");

	}

public static void WriteToFile(String filePath, String content)
throws IOException {
	try {
		File file = new File(filePath);

		// create the file if it doesn't exist
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static void ReadFromFile(String filePath) throws IOException {
	// Read from the file!

	File inputFile = new File(filePath);
	try(
	BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
		for (String line; (line = br.readLine()) != null;) {
			System.out.println("Line: " + line);
		}
	}
}

}
