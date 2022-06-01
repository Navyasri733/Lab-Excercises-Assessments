package day4;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Good");
		StringBuffer sb2 = new StringBuffer("Good");
		
		System.out.println(sb1);
		System.out.println(sb2); 
		
		// equals - compare  address
		System.out.println(sb1==sb2);
		
		sb1.append(" Evening");
		
		System.out.println(sb1);
		
		sb2.append("!");
		
		System.out.println(sb2);
		
		
		//equals() - compare references
		System.out.println(sb1==sb2);
		System.out.println(sb2==sb1);
		
		System.out.println();
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		// option - using new keyword  
		StringBuffer sb3 = new StringBuffer("HELLO!");
		
		System.out.println(sb2==sb3);
		
		System.out.println(sb1.substring(1));
		System.out.println(sb3.substring(4));
		System.out.println(sb3.substring(1,4));
		
		StringBuffer sb4 = new StringBuffer();
		StringBuffer sb5 = new StringBuffer("NAVYA");
		
		
		System.out.println(sb4.capacity());
		System.out.println(sb5.capacity());
		
		sb4.append("345678223344556789012345673");
		System.out.println(sb4.capacity());
		
		
		//StringBuilder
				StringBuilder sbr3 = new StringBuilder("NALLA");
				System.out.println(sbr3);
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
