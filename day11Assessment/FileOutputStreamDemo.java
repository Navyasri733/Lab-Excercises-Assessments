package day11Assessment;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try {
		
		//writing the text into the above created file
		
		  FileOutputStream fout = new FileOutputStream("C:\\Users\\NAVNALLA\\Desktop\\sample.txt");
		  
		  String textToBeWritten = " Hello World!";
		  
		  byte b[]=(textToBeWritten.getBytes());
		  
		  fout.close(); 
		  System.out.println("Here....");

	}catch(Exception e) {System.out.println(e);}

}

}