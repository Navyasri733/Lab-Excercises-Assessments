package CollectionFrameWork;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		
		// Create Tree Object
		//Set<Employee> employees = new TreeSet(new SortByEmpId);
		SortEmpName sortByName = new SortEmpName();
		Set<employee> employee= new TreeSet<>(sortEmpName);
		
	}

}
