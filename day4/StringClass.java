package day4;

public class StringClass {

	public static void main(java.lang.String[] args) {
		String str1 = " Hello";
		String str2 = " Sravanthi";
		String str3 = " Srikanth";
		
	    System.out.println(str1);
	    System.out.println(str2);
      	System.out.println(str3);
      	
      	
      	str1.concat(" Fellow"); 
      	System.out.println(str1);
	
      	str1 =str1.concat(" Fellow");
      	System.out.println(str1);
      	
		//equals - campare values
      	System.out.println(str1==str2);
      	
      	// option 2 - using new keyword
      	String str4 = new String("java");
      	String str5 = new String("core");
      	
      	
      	System.out.println();
      	System.out.println(str1.hashCode());
      	System.out.println(str2.hashCode());
      	System.out.println(str3.hashCode());
      	System.out.println(str4.hashCode());
		
		
	}

}
