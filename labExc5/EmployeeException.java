package labExc5;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeException {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the employee Salary");
		int salary = s.nextInt();

		try {
			if (salary > 3000)
				System.out.println("valid");
			else
				System.out.println("Not reached");
		} catch (Exception a) {
			System.out.println(a);
		}

	}

	}


