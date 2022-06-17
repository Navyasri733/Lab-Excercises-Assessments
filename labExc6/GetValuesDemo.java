package labExc6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetValuesDemo {
	
	static HashMap<Integer,String>map = new HashMap<Integer,String>();
	public static void main(String[] args) {
		
		HashMap Map= new HashMap();
		map.put(1,"Navya");
		map.put(2,"Sree");
		map.put(3,"Sravs");
		map.put(4,"Raju");
		map.put(5,"Uday");
		
	
		
		List<Integer>keyList = new ArrayList(map.keySet());
		List<Integer> valueList = new ArrayList(map.values());
		
	    System.out.println("key List:" +keyList);
	    System.out.println("Value List" +valueList);
      
		
		
	}

}
