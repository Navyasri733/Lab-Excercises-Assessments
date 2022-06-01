package LabExc3;

import java.util.*;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a line of numbers: ");
		
		String input = sc.next();
		StringTokenizer st = new StringTokenizer(input, " ,");
		int sum = 0;
		while(st.hasMoreTokens()) 
		{
			int n = 0;
			n = Integer.parseInt(st.nextToken());
			System.out.println("Number is: "+n);
			sum += n;
			}
		System.out.println("sum of the number is: "+sum);
		
	}

}
