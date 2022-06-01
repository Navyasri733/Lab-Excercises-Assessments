package day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		
		
		

		String contactNo = "613 701 98270 (toll Number)";
		System.out.println(Pattern.matches("(\\d{3}\\s\\d{3}\\s\\d{5}\\s.*)",contactNo));
	    System.out.println();
	    
	   
	   
		Pattern pattern1 = Pattern.compile("(\\d{3})\\s(\\d{3})\\s(\\d{5})\\s.*");
	    Matcher matcher1 = pattern1.matcher(contactNo);
	    System.out.println(matcher1.matches());
		
	    System.out.println(matcher1.group());
		System.out.println(matcher1.group(1));
		System.out.println(matcher1.group(2));
		System.out.println(matcher1.group(3));

		
		
		String contactNo1 = "91 123 2641407 (International call rates applicable)";
		System.out.println(Pattern.matches("(\\d{2}\\s\\d{3}\\s\\d{7}\\s.*)",contactNo1));
	    System.out.println();
	    
	   
	   
		Pattern pattern2 = Pattern.compile("(\\d{2})\\s(\\d{3})\\s(\\d{7})\\s.*");
	    Matcher matcher2 = pattern2.matcher(contactNo1);
	    System.out.println(matcher2.matches());
		
	    System.out.println(matcher2.group());
		System.out.println(matcher2.group(1));
		System.out.println(matcher2.group(2));
		System.out.println(matcher2.group(3));
		
		
		

		String contactNo3 = "011 24667473 (Monday to Friday ,0930 hrs - 1730 hrs IST)";
		System.out.println(Pattern.matches("(\\d{3}\\s\\d{8}\\s.*)",contactNo3));
	    System.out.println();
	    
	   
	   
		Pattern pattern3 = Pattern.compile("(\\d{3})\\s(\\d{8})\\s.*");
	    Matcher matcher3 = pattern3.matcher(contactNo3);
	    System.out.println(matcher3.matches());
		
	    System.out.println(matcher3.group());
		System.out.println(matcher3.group(1));
		System.out.println(matcher3.group(2));
		
		
		// golden.edge@airindia.in
		String mail = "golden.edge@airindia.in";
		System.out.println(Pattern.matches("\\w{6}.\\w{4}.\\w{8}.\\w{2}",mail));
		System.out.println();
		
		
		Pattern pattern4 = pattern1.compile("(\\w{6}).(\\w{4}).(\\w{8}).(\\w{2})");
		Matcher matcher4 = pattern4.matcher(mail);
		System.out.println(matcher4.matches());
		
		
		System.out.println(matcher4.group());
		System.out.println(matcher4.group(1));
		System.out.println(matcher4.group(2));
		System.out.println(matcher4.group(3));
		
		
		
		//Mr.
		String str = "Mr";
		System.out.println(Pattern.matches("\\w{2}",str));
		System.out.println();
		
		Pattern pattern5 = pattern2.compile("(\\w{2})");
		Matcher matcher5 = pattern5.matcher(str);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}

}
