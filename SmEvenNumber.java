package day10;
@FunctionalInterface
interface Intf2  {
	int sum(int [] a);
}

public class SmEvenNumber {

	public static void main(String[] args) {
		//Find even numbers from array
		int[] arr = {11,29,31,5,34,42,64};
	     
	
		Intf2 intf2 =(int [] a) ->{
			int sum=0;
			for(int i=0;i<arr.length;i++) {
			if(arr[i]%2  == 0) {			
				 sum =sum+arr[i];
			}
		
		}
		  return sum;
		
	};
	System.out.println("Even number is: "+intf2.sum(arr));
   }
}
