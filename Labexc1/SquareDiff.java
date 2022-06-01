package Labexc1;

public class SquareDiff {
	static int squarediff(int n) {
	
	 int x,y,z ;
	 //sum of the squares of the
	 //first n natural numbers
	 x=(n*(n+1)*(2*n+1))/6;
	 
	 
	 //sum of n naturals numbers
	 y=(n*(n+1))/2;
	 
	 //square of y
	 y=y*y;
	 //differences between x and y
	 z= Math.abs(x-y);
	 return z;
  }
  public static void main(String[] args) {
	  
	  int n=30;
	  System.out.println(squarediff(n));
	  
		

	}

}
