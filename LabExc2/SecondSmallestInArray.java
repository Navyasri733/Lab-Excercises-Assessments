package LabExc2;

public class SecondSmallestInArray {
	public static int getSecondSmallest(int a[], int total) {
		int temp;
		for(int i=0;i<total; i++) {
			for (int j=i+1; j<total;j++) {
                if (a[i]>a[j]) {	
                	temp = a[i];
                	a[i] = a[j];
                	a[j] = temp;
                	
                }
             }
          }
		return a[1]; //second element because index starts from zero
	}
	public static void main(String[] args) {
		int a[] = {1,2,3,6,8,9,5};
		int b[] = {22,30,45,76,23,56};
		System.out.println("second smallest: " +getSecondSmallest(a,7));
		System.out.println("second smallest: "  +getSecondSmallest(b,6));
		
	      }
	
	
      }
		
		
		
		
	



