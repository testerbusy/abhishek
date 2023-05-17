package oops;

public class MethodOverloading {
	/*
	 * Polymorphism --> Method Overriding, Method overridding
	 * 
	 * Advantage of Method Overloading Method overloading increases the readability
	 * of the program Different ways to overload the method 
	 * 1. By changing number of argument 
	 * 2. By changing the data types
	 */

	public static int add(int a, int b) {  //void is return type--> it does't written any thing
		return a+b;
	}

	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public void m1() {
		
	}
	public static String name(String fn, String ln) {
		String names = fn+" "+ln;
		return names;
	}
	
//	public static void main(String[] args) {
//		int x = add(2,4,8);
//		String fullname = name("Raghu", "Vardhan");
//		System.out.println("My fuill Name is "+fullname);
//		System.out.println(x);
//	}
	
	public static int mult(int x, int y) {
		int z = x*y;
		return z;
	}
	public static double mult(double x, double y) {
		double z = x*y;
		return z;
	}

	public static void main(String[] args) {
		System.out.println(mult(3,8));
	}
	
}
