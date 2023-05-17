package finalKeyword;

public class FinalExamp {
	/*
	 * final is the keyword
	 * it is used to restrict the user to update any value
	 * 
	 * Final can be
	 * 1. Variable
	 * 2. Method
	 * 3. class
	 * 
	 * we cannot override final variable value
	 * we cannot override final method
	 * We can create constructor for final class
	 */
	
	// this is final variable example
	final int climate = 18;
	
	public void displayClimate() {
		System.out.println(climate);
	}
	
	public final void displayvalues() {
		System.out.println("This is final climate");
	}
	
	
	public static void main(String[] args) {
		FinalExamp finalexamp = new FinalExamp();
		finalexamp.displayClimate();
	}
}
