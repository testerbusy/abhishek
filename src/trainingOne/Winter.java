package trainingOne;

public class Winter {
	static int j=0; //static variable
	int i = 0;  //Global variable/instance variable, it will declare inside of the class, outsideof the method
	
	public void methodOne() {
		System.out.println("");
		int i=0; //local variable, it will declare inside of the method
		System.out.println(j);
	}

	public void MethodOne() {
		System.out.println(i);
	}

	public void methodOneTest() {
		System.out.println("methodTest");
	}

	public static void main(String[] args) {
		System.out.println(j);
	}
}
