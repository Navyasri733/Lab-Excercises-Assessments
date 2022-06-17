package day11Assessment;

import java.io.File;


public class FileDemo {

	public static void main(String[] args) throws Exception {

		// Creating a file

		File file = new File("sample.txt");// Representing the file
		if (!file.exists()) {

			file.createNewFile();
		}
		
          
	}

}


