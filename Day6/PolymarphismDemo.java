package Day6;

public class PolymarphismDemo {

	public static void main(String[] args) {
		
		person p1 = new person();
		person p2 = new person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		//update
		p1.name="Raju";
		p1.age=32;
		
		
		p2.name="syam";
		p2.age=21;
		
		System.out.println(p1.name);
		System.out.println(p2.age);
		 
		//call add method
		int sum = p1.add(10,20);
		System.out.println(sum);
		
		
		System.out.println("hello"+" "+p2.name);
		
		}

}
