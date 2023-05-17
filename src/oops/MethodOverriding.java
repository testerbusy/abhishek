package oops;

public class MethodOverriding {
	/*
	 * Usages of method Overriding
	 * 1. Method overriding is used to provide the specific implementation of a method which is already provided by its superclass
	 * 2. Method overriding is used for run polymorphism
	 * 
	 * Rules
	 * 1. Method must have same name as in parent class
	 * 2. method must have same parameter as in the parent class.
	 */
	public static void methodOne() {
		System.out.println("this is parent method");
	}
	public static void main(String[] args) {
		System.out.println("this is main method one");
	}
}
