package labExc5;

import java.util.Scanner;

public class NameExceptionDemo {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the firstname");
		String firstname = s.next();
		System.out.println("Enter the lastname");
		String lastname = s.next();

		if (firstname.length() == 0 && lastname.length() == 0) {
			System.out.println("Invalid");
		} else {
			System.out.println("valid");
		}

	}

}					
	
	 	
