package PracticeTestPrgms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOps {
	public ArrayList<Integer> makeArrayListInt(int n)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
                                   for(int i=0;i<n;i++)
		{
			al.add(0);
		}
		return al;
                     }
	public ArrayList<Integer> reverseList(ArrayList<Integer>list)
	{
		Collections.reverse(list);
		return list;
	}
	public ArrayList<Integer> changeList(ArrayList<Integer>list,int m,int n){
		Collections.replaceAll(list,m,n);
		return list;
	}
}


