package array1;

public class LargestNumber {

	public static void main(String[] args) 
	{
		 int arr[] = {5,1,105,70,225,230,135};
		 
		 int max = arr[0];
		 
		 for(int i=0;i<arr.length; i++)
		 {
			if(max < arr[i])
			 {
				 max = arr[i];
			 }
			 
	      }
				 
				
		 
		
		System.out.print(max);
		

	}

}
