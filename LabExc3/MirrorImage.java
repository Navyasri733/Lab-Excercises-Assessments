package LabExc3;

import java.util.Scanner;

public class MirrorImage {

	public String getImage(String str) {
		StringBuffer sbr = new StringBuffer(str);
		sbr.append('|');
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		sbr.append(sb);
		return sbr.toString();
	}
	public static void main(String[] args) {
		MirrorImage mi = new MirrorImage();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.next();
		System.out.println(mi.getImage(str));
		
		
		

	}

}
