package day10Assessment;

public class SwapNumbers {
	 private static final int N = 10;
	 private static char[] flags = new char[] {'N','A','V','Y','A','S','R','I','N','A'};
	 public static void main(String... argv) {
		 new String(flags).chars().mapToObj(i ->(char)i).forEach(System.out::println);
		 int m=0,k=0;
		 while(m != N) {
			 if(flags[m] =='N') {
		      } else {
			     swap(flags, k, m);
			       k = k + 1 ;
			 
		 }
			 m = m + 1;
		 }
		 new String(flags).chars().mapToObj(i -> (char)i).forEach(System.out::println);
	 }
	private static void swap(char[] flags, int k, int m) {
		char temp = flags[k];
		flags[k] = flags[m];
		flags[m] = temp;		

	}

}
