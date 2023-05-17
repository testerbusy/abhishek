package constructor;

public class ParameterizedConstructor {
	
	protected ParameterizedConstructor(int a, String name) {
		System.out.println(" my name is "+name+" and my age is "+a);
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor parameterizedconstructor = new ParameterizedConstructor(4, "marolix");
	}
}
