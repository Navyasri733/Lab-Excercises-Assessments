package day10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList();
		list.add(60);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(70);
		
		int[] intArr = {15,25,35,45,55};
		//convert Array into List
		List lst1 = Arrays.asList(intArr);
		
		
		//	filter number greater than 10 - filter()
		System.out.println("filter number greater than 10 - filter()");
		List<Integer> lst2 =  list.stream().filter(num->num>10).collect(Collectors.toList());
		System.out.println(lst2);
				
		System.out.println("filter number less than 40 - filter()");
		List<Integer>lst3 = list.stream().filter(num->num<40).collect(Collectors.toList());
		System.out.println(lst3);
		
		
		System.out.println("print all the values except 10");
		List<Integer>lst4 = list.stream().filter(num->num!=10).collect(Collectors.toList());
		System.out.println(lst4);
		
		System.out.println("Print all even numbers");
		List<Integer> lst5 =  list.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(lst5);
	
				
				

	}

}
