package CollectionFrameWork;

import java.util.*;

public class LinkedListDemo {

	private static final Iterator<String> String = null;

	public static void main(String[] args) {
		LinkedList<String>al = new LinkedList<String>();
		 
		
	     al.add("Navya");
	     al.add("Raju");
	     al.add("Sravanthi");
	     al.add(null);
	     al.add(null);
	     
	     
	     Iterator<String>itr=al.iterator();
	     while(itr.hasNext()) {
	     System.out.println(itr.next());
	     
	     
	     String RemovedStr = al.remove(0);
	     System.out.println("Removed  Elements "+ RemovedStr);
	     
	     
	      String Str = al.get(2);
	      System.out.println("Access "+ Str);
	    	 
	     
	   	 
	     }
	     
	     
	}

}
