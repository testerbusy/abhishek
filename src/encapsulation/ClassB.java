package encapsulation;

public class ClassB {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.setValueForName("Raghu");
		System.out.println(classA.getName());
	}
}
