package day9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer>set = new TreeSet<>();
		set.add(10);
		set.add(30);
		set.add(120);
		set.add(102);
		set.add(103);
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		
		

	}

}
