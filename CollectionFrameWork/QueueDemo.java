package CollectionFrameWork;

import java.util.*;



public class QueueDemo {

	public static void main(String[] args) {
		Queue<String>q = new PriorityQueue<String>();
		
		q.add("Navya");
		q.add("Raju");
		q.add("Uma");
		q.add("Upender");
		
		
         System.out.println("head:"+q.element());
         System.out.println("head:"+q.peek());
         System.out.println("iterator the q elements:");
         Iterator itr = q .iterator();
         while(itr.hasNext()){
         System.out.println(itr.next());		
         }

	}

}
