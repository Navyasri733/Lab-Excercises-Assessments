package day5;

public class WrapperDemo {

	public static void main(String[] args) {
		// Convert primitive to object

		int i = 100;
		// i.getClass().getName();

		Integer i1 = new Integer(20);
		System.out.println(i1.getClass().getName());
		System.out.println(i1);

		int j = 200; // valueOf()
		Integer j1 = Integer.valueOf(j);
		System.out.println(j1.getClass().getName());
		System.out.println(j);

		float f = 20.78f;
		Float f1 = Float.valueOf(f);
		System.out.println(f1.getClass().getName());
		System.out.println(f);

		float f2 = 35.7869f;
		Float f3 = Float.valueOf(f);
		System.out.println(f3.getClass().getName());
		System.out.println(f2);

		Integer k = 300;// Autoboxing
		System.out.println(k.getClass().getName());
		System.out.println(k + k.getClass().getName());

		Integer h = 250;
		System.out.println(h.getClass().getName());
		System.out.println(h);

		Double d = 40.4578;
		System.out.println(d.getClass().getName());
		System.out.println(d);

		Integer i21 = 335;
		System.out.println(i21.getClass().getName());
		int i22 = i21.intValue();
		System.out.print(i22 + " | " + i21);

		Double d21 = 11.11;
		System.out.println(d21.getClass().getName());
		double d22 = d21.doubleValue();
		System.out.print(d22 + " | " + d21);

		Integer i26 = 222;
		System.out.println(i26.getClass().getName());
		System.out.println(i26);

		// AutoUnboxing
		// int x =32;
		// System.out.println(x.getClass().getName());
		System.out.println();

		// Convert wrapper object to string object
		// to string()
		System.out.println(d21.getClass().getName());
		String str1 = d21.toString();
		System.out.println(str1.getClass().getName());

		System.out.println(i21.getClass().getName());
		String str2 = i21.toString();
		System.out.println(str2.getClass().getName());

		// Convert string to integer
		System.out.println(str1.getClass().getName());
		// int = str1.toInteger();
		// System.out.println(int.getClass().getName());

	}

}
