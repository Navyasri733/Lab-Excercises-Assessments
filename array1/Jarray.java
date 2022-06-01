package array1;

public class Jarray {

	public static void main(String[] args) {
		//Jagged Array
		int[][] jArray = new int[3][];
		jArray[0] = new int[3];
		jArray[1] = new int[3];
		jArray[2] = new int[3];
		
		
		//1st row elements
		jArray[0][0]=10;
		jArray[0][1]=20;
		jArray[0][2]=30;
		
		
		//2nd row
		jArray[1][0]=35;
		jArray[1][1]=45;
		jArray[1][2]=55;
		
         //3rd row
		jArray[2][0]=25;
		jArray[2][1]=65;
		jArray[2][2]=75;
		
		
		
		System.out.println();
		//iterate jagged array
		for(int i=0;i<jArray.length;i++){ // iteratr rows
			for(int j=0; j<jArray[i].length;j++) { // iterate columns
				System.out.print(jArray[i][j]+" ");
				
			}
				System.out.println();
			}
	
	}

}
