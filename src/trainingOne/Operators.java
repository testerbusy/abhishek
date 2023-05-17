package trainingOne;

public class Operators {
	
	public static void postFixAndPreFix() {
		int x=10;
		System.out.println(x++); //10 (11)
		System.out.println(++x);  //12
		System.out.println(x--);
		System.out.println(--x);
	}
	public static void main(String[] args) {
		logicalOperator();
	}
	
	public static void comparision() {
		System.out.println(5!=6);
	}
	
	public static void logicalOperator() {
		System.out.println(5>6 || 6<7);
	}
}
