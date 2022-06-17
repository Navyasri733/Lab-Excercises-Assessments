package day11Assessment;
import java.io.*;
import java.io.BufferedInputStream;

public class BufferdInputStreamDemo {

	public static void main(String[] args)  {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\NAVNALLA\\Desktop\\sample.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while((i = bin.read())!=-1) {
				System.out.print((char)i);
			}
			bin.close();
			fin.close();
			
		}catch(Exception e) {System.out.println(e);}

	}

}
