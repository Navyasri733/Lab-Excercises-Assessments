package Labexc1;

public class  IncreasingNum {

	public static boolean main(String[] args) {
	
     int numblist = 0;
	int inp = numblist;
	boolean increasing = true;
	int n = 0;
	while (n>0) {
		int d1= n%10;
		n/=10;
		int d2= n%10;
		if (d2>d1) {
			increasing= false;
			break;
		}
	}
	return increasing;
	
		
	}

}
