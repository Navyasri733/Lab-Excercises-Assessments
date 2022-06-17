package day11Assessment;

import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\NAVNALLA\\Desktop\\sample.txt");
			fw.write("Hello World!");
			fw.close();
		}catch(Exception e) {System.out.println(e);}
		System.out.println("Done.");

	}

}
