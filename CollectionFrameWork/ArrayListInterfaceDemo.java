package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInterfaceDemo {

	public static void main(String[] args) {
		//Creating list using the ArrayList class
		List al = new ArrayList();
		
		
		
		//Add elements to the list
		al.add(22);
		al.add(32);
		al.add(null);
		al.add(true);
		
		//update
		al.set(2, "Navya");
		
		
		
		System.out.println( al);
		
		
		//Access element from the list
		
		System.out.println( al);
		
		
		//Remove elements from the list
		int removedNumber = al.remove(3);
		System.out.println( removedNumber);
		
		
		
		
			
	}

}
