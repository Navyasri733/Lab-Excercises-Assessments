package CollectionFrameWork;

import java.util.Iterator;
import java.util.Stack;



public class StackDemo {

	public static void main(String[] args) {
		Stack<String>stack = new Stack<String>();
		
		stack.push("Uday");
		stack.push("Raju");
		stack.push("nalla");
		stack.push("sri");
		stack.pop();
		
		Iterator<String>itr =stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
