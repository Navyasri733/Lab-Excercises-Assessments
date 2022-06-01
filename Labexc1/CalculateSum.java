package Labexc1;

public class CalculateSum {
	
	 static int sum( int N,int X,int Y )
	
	 {
		
	  
       int S1,S2,S3;
       S1=((N/3)) * (2*3+(N/3-1)*3)/2;
       S2=((N/5))*(2*5+(N/5-1)*5)/2;
       S3=((N/(3*5)))*(2*(3*5)+(N/(3*5)-1))/2;
       
       return S1+S2-S3;
	 }  
	 public static void main(String []args)
	
       {
           
    	   
    	   int N= 22;
		   int  x = 3, y = 5 ;
    	   System.out.println(sum(N,x,y));
       }
       
}
    	   
