package day10Assessment;

import java.util.Arrays;

@FunctionalInterface
interface Intf {
	void second(int [] a);
}

public class SecondHighestDemo {

	public static void main(String[] args) {
		//Find Second highest number 
		int[] arr = { 10,20,30,40,50};
		
		Intf intf = (int [] a) ->{
			Arrays.sort(arr);
			System.out.println("Second highest number in a given array = "+ arr[arr.length-2]);
			};
			intf.second(arr);
			
	}

}
