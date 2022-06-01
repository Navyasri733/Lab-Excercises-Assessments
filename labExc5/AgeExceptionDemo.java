package labExc5;

import java.util.Scanner;

public class AgeExceptionDemo  {
	
	public AgeExceptionDemo(String str) {
	  System.out.println(str);
	}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur age");
		int age = s.nextInt();
		
		
		try {
			if (age< 15) 
			  System.out.println("Invalid age");
		    else
				System.out.println("Valid age");
		}
		 catch (Exception a) {
			System.out.println(a);
		}		
		
		
 }

}
