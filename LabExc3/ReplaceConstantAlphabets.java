package LabExc3;

import java.util.Scanner;

public class ReplaceConstantAlphabets {
	public String alterString(String str) {
		StringBuffer sbr = new StringBuffer(str);
		for (int i=0;i<str.length();i++) {
			char c= sbr.charAt(i);
			if(!(c =='A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')) {
	        	sbr.replace(i, i+1, String.valueOf((char)(c+1)));
	        	
			}
			
		}
		return sbr.toString();
	}
    public static void main(String[] args) {
    	ReplaceConstantAlphabets r = new ReplaceConstantAlphabets();
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter a String");
    	String str = scan.next();
    	System.out.println(r.alterString(str));
    	
    }

}
