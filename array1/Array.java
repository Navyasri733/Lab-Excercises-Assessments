package array1;

public class Array {

	public static void main(String[] args) {
		//int[][] intArr = {{row1},{row2},{row3}};
		//int[][] intArr =new int[3][3];
		//int[][] intArr =new int[][]{{5,7,9},{8,4,6},{1,3,7}};
		int[][] intArr = {{5,7,9},{8,4,6},{1,3,7}};
		
		System.out.println(intArr[1][2]);
		System.out.println(intArr[0][2]);
		
		System.out.println(intArr[0][1]);
		System.out.println(intArr[2][0]);
		
		System.out.println();
		//Iterate multidimentional array
		for(int i=0; i<intArr.length; i++) { //iterate rows
			for(int j=0; j<intArr[i].length;j++) { //iterate columns
				System.out.print(intArr[i][j]+" ");
				
			}
			
		}
		
	}

}
