package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		//Creating arraylist
		ArrayList<String>list = new ArrayList<String>();
		
		
		//Addaing objects to array
		list.add("navya");
		list.add(null);
		list.add("Raju");
		list.add("Sravanthi");
		
		//travelling list through iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			//Access elements from the list
			String str = list.get(1);
			System.out.println("Access Elements: " +str);
			
			
			//Remove elements from the list 
			String removedStr = list.remove(2);
			System.out.println("Removed Element: "+removedStr);
			
			
			
		}
   }

}
