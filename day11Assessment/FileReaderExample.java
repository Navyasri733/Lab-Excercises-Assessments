package day11Assessment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader f1 = new FileReader("C:\\Users\\NAVNALLA\\Desktop\\sample.txt");
        int i;
        while((i=f1.read())!=-1) {
        	System.out.println((char)i);
        	f1.close();
        }
	}

}
