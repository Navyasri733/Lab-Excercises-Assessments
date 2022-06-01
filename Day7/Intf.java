package Day7;

public interface Intf {

	int a = 100; //public, static and final
	int b = 200; //public,static and final
	
	//abstract methods
	void m1();
	void m2();
	void m3();
	
	
	//1.8 v - static & default methods
	
	
	static void m4() {
		System.out.println("Intf m4() method implementation");
		
		
	}
	
	//default method
	 default void m5() {
		 System.out.println("Intf m5 methiod implementation");
	 }

	

}
