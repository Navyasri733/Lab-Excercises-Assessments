package LabExc2;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	
	
	static void reverse(Integer a[]) {
		
		Collections.reverse(Arrays.asList(a));
	    System.out.println(Arrays.asList(a));
	    
        }
	
    public static void main(String[] args) 
	    {
    	
		Integer[] arr = { 20,30,12,48,65 };
		reverse(arr);
		
	   }
  }
