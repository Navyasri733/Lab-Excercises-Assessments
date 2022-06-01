package Labexc1;

import java.util.Scanner;

public class TraficLights {
	 
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int ch=0;
		do {
			System.out.println("Enter the choice:");
			System.out.println("1.Red\2.Yellow\3.Green");
			ch=sc.nextInt();
			switch(ch) 
			{
			case 1:System.out.println("stop");
			break;
			case 2:System.out.println("Ready");
			break;
			case 3:System.out.println("Go");
			break;
			default: System.out.println("Invalid Choice");
		    }
		} 
		 
		while(ch!=3);
		
	}
}
