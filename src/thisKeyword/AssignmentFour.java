package thisKeyword;

public class AssignmentFour {
	public AssignmentFour() {
		System.out.println("this is constructor");
	}
	public AssignmentFour(int a, int b) {
		this();
		System.out.println(a+"this is constructor"+b);
	}
	public AssignmentFour(int a) {
		this(3,9);
		System.out.println("this is my constructor two");
	}
	
	public static void main(String[] args) {
		AssignmentFour four = new AssignmentFour(6);
	}
}
