package PracticeTestPrgms;

import java.util.ArrayList;

public class ArrayListSource {

	public static void main(String[] args) {
	
			ArrayList<Integer>list = new ArrayList<Integer>();
	                             ArrayListOps alo = new ArrayListOps();
	                             list.add(14);
			list.add(13);
			list.add(10);
			System.out.println(list);
			System.out.println(alo.reverseList(list));
	                             System.out.println(alo.changeList(list,10,21));
		}

	}


