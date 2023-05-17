package constructor;

public class ConstructorExamp  {
	/*
	 * Constructor is a block of code similar to the method.
	 * 
	 * types of constructor
	 * 1. Default constructor(No parameter)
	 * 2. Parameterized constructor
	 * 
	 * rules of constructor
	 * 1. Constructor name must be same as its class name
	 * 2. Constructor must have no explicit return type
	 * 3. Constructor cannot be abstract, static and final 
	 * 
	 * 
	 * points to remember
	 * MethodOverloading is possible in constructor
	 * MethodOverrirding is not possible in constructor
	 * 
	 * Accessmodifier
	 * private is not allowing.
	 * default is allowing.
	 * protected is also allowing.
	 */
	public ConstructorExamp() {
		System.out.println("this is constructor");
	}
	
	public ConstructorExamp(int a) {
		
	}
	
	public void danger() {
		System.out.println("danger");
	}
	public static void main(String[] args) {
		ConstructorExamp constructorexamp = new ConstructorExamp();
		constructorexamp.danger();
	}
}
