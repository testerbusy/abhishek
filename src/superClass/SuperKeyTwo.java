package superClass;

public class SuperKeyTwo extends SuperKeyOne{
	String name = "Company";
	
	public void methondOne() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void department() {
		System.out.println("We are automation engineers");
	}
	public void manualtest() {
		super.department();
		department();
	}
	
	public static void main(String[] args) {
		SuperKeyTwo superkeytwo = new SuperKeyTwo();
		superkeytwo.manualtest();
	}
}
