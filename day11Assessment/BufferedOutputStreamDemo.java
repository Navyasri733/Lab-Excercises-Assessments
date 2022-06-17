package day11Assessment;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		 FileOutputStream fout = new FileOutputStream("C:\\Users\\NAVNALLA\\Desktop\\sample.txt");
		 BufferedOutputStream bout = new BufferedOutputStream(fout);
		 String s = "Hello World!";
		 byte b[]= s.getBytes();
		 bout.write(b);
		 bout.flush();
		 bout.close();
		 fout.close();
		 System.out.println("success");
		 

	}

}
