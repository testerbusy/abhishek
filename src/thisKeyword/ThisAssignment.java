package thisKeyword;

public class ThisAssignment {
	//This is a java keyword
	//reference variable that refers to current object.
	
	//Usages
	/*
	 * This can be used to refer current class instance variable
	 * This can be used to invoke current class method
	 * this can be used to invoke current constructor
	 * this can be passed as n argument in the method call
	 * this can be passed as argument in the constructor call
	 * this can be used to return the current class instance from the method. 
	 */
	
	int rollNo ;
	String name;
	public ThisAssignment(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public void display() {
		System.out.println("Roll no :"+rollNo+" Name is "+name);
	}
	public static void main(String[] args) {
		ThisAssignment thisassignment = new ThisAssignment(2343, "Raghu");
		thisassignment.display();
		
	}
}
