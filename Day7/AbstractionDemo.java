package Day7;

public class AbstractionDemo {

	public static void main(String[] args) {
//		A a = new A();
//		B b = new B();
//		a.m1();
//		a.m2();
//		b.m5();
		  
		
		
		//tight coupling
		C c = new C();
		System.out.println(c.x);
		System.out.println(c.y);
		
		
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m6();
		
		System.out.println();
		D d = new D();
        d.m5();
		 
		
		System.out.println();
		F f = new F();
		f.m1();
		f.m2();
		f.m3();
		f.m4();
		
		
		System.out.println();
		//Loose coupling - easy to test application
		C c1 = new C();
		//A c1 = new J();
		
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		//c1.m6();
		
		
		//access both child class and parent class method
		C c2 = new C();
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m4();
		c2.m6();
	
		
		
		System.out.println();
	  //Interface - loose coupling 
		//Intf aa = new AA();
		Intf aa = new BB();
		System.out.println(aa.a);
		System.out.println(aa.b);
		aa.m1();
		aa.m2();
		aa.m3();
		
		
		System.out.println();
		//Access interface static members
		System.out.println(Intf.a);
		System.out.println(Intf.b);
		Intf.m4();
		
		
		//Access default method
		aa.m5();
		
		}

}
