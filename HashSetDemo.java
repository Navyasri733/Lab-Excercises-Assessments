package day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
	
		Set<Student> hashSet = new HashSet<>();
		Student stu1 = new Student(1, "Raju", "CR");
		Student stu2 = new Student(2, "Navya", "Leader");
		Student stu3 = new Student(3, "Sravs", "Dancer");
		Student stu4 = new Student(4, "Harsha", "Topper");
		Student stu5 = new Student(5, "Ramu", null);
		Student stu6 = stu2;
		
		hashSet.add(stu1);
		hashSet.add(stu2);
		hashSet.add(stu3);
		hashSet.add(stu4);
		hashSet.add(stu5);
		hashSet.add(stu6);
	
	    Iterator itr = hashSet.iterator(); 
		 while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
			
		}
		

	}

}
