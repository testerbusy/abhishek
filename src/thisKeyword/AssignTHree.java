package thisKeyword;

public class AssignTHree {
	
	public void m1() {
		System.out.println("this is my program");
	}
	public void n1() {
		System.out.println("this is this program");
		this.m1();
	}
	public static void main(String[] args) {
		AssignTHree assignthree = new AssignTHree();
		assignthree.n1();
	}
}
