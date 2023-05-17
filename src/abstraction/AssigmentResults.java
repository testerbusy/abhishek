package abstraction;

public class AssigmentResults extends ExampleForAbstract implements GmailInterface,YahooINterface{

	@Override
	void m1() {
		System.out.println("this is abstract method");
		
	}
	public static void main(String[] args) {
		AssigmentResults assign = new AssigmentResults();
		assign.m1();
	}
	@Override
	public void m5(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
