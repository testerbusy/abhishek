package thisKeyword;

public class AssignmentFive {

	public void m1(AssignmentFive obj) {
		System.out.println("Method is invoked");
	}
	
	public void m2() {
		m1(this);
	}
	public static void main(String[] args) {
		AssignmentFive s = new AssignmentFive();
		s.m2();
	}
}
