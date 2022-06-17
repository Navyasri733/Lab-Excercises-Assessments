package day11Assessment;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		try {
          //Reading the text from the file
		FileInputStream fin = new FileInputStream("C:\\Users\\NAVNALLA\\Desktop\\sample.txt");
		
		int i = fin.read();
		char c = (char)i;
		System.out.println(c);
		fin.close();
		
		}catch(Exception e) {System.out.println(e);}
		
	}

}