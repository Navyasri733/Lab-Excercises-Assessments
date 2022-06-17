package BasicProgramme;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner (System.in);
		
		String s1 = "Hello....";
		String s2 = "World..";
		
		int l1 = s1.length();
		int l2  = s2.length();
		
		 int l3 = l1+l2;
		
		System.out.println("sum of the String lengths = "+  l3);
	
		
	}

}
