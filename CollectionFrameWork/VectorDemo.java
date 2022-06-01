package CollectionFrameWork;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		 
		Vector<String>v = new Vector<String>();
		Vector<String>v1 = new Vector<String>();
		
		 v.add("Swarupa");
		 v.add("Uma");
	 	 v1.add(null);
		 v1.add("Amit");
		 v.add("Rishi");
		
		
		Iterator<String>itr = v.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		Iterator<String>itr1 = v1.iterator();
		while(itr1.hasNext()) {
		System.out.println(itr1.next());	
			
			
		}
	}	

}

}
