package day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	private static final String International = null;

	public static void main(String[] args) {
		
		
		//option1 1: compile() matcher()
		Pattern pattern = Pattern.compile(".[a-z]");
		Matcher matcher = pattern.matcher("as");
		System.out.println( matcher.matches());
		
		
		
		
		//option 2: pattern.matches()
		System.out.println(pattern.matches(".a","ds"));
		System.out.println(pattern.matches(".a","%a"));
		System.out.println(pattern.matches(".a", "as"));
		System.out.println();
		
		
		String contactNo = "1233 345 1234 (toll Free)";
		System.out.println(pattern.matches("(\\d{4}\\s\\d{3}\\s\\d{4}\\s.*)",contactNo));
	    System.out.println();
	    
	    
	    Pattern pattern1 = pattern.compile("(\\d{4})\\s(\\d{3})\\s(\\d{4})\\s.*");
	    Matcher matcher1 = pattern1.matcher(contactNo);
	    System.out.println(matcher1.matches());
		
	    
		System.out.println(matcher1.group());
		System.out.println(matcher1.group(1));
		System.out.println(matcher1.group(2));
		System.out.println(matcher1.group(3));
		
		
 
		
		String mail = "contactus@airindia.in";
		System.out.println(Pattern.matches("\\w{9}.\\w{8}.\\w{2}",mail));
		System.out.println();
		
		
		Pattern pattern2 = pattern.compile("(\\w{9}).(\\w{8}).(\\w{2})");
		Matcher matcher2 = pattern2.matcher(mail);
		System.out.println(matcher2.matches());
		
		
		System.out.println(matcher2.group());
		System.out.println(matcher2.group(1));
		System.out.println(matcher2.group(2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
