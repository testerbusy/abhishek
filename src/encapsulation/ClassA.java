package encapsulation;

public class ClassA {

	
	//Encapsulation--> Package, Access modifiers and encapsulation
	// Binding the data into single unit
	//wrapping code and data together in a single unit
	//Encapsulation having two topics , setter method and getter method
	
	private String name;
	
	//getter method and used for getting the value
	public String getName() {
		return name;
	}
	//Setter method and used to set value for private variable
	public void setValueForName(String name) {
		this.name = name;
	}
}
