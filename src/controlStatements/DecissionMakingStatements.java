package controlStatements;

public class DecissionMakingStatements {
	
	public static void main(String[] args) {
		/*
		int a = 2;
		if(a > 5) {
			System.out.println("A is greater than 5");
		}
		else {
			System.out.println("A is less than 5");
		}
		
		String animal = "Snake";
		switch (animal) {
		case "Dog":
			System.out.println("THis is Domestic animal");
			break;
		case "Tiger":
			System.out.println("THis is Wild animal");
			break;
		case "Snake":
			System.out.println("THis is Reptile");
			break;
		default:
			System.out.println("There is no animal");
			break;
		}
		*/
		String browser = "Chrome";
		switch (browser) {
		case "Chrome":
			System.out.println("Chrome Browser is initialized");
			break;
		case "FireFox":
			System.out.println("Firefox Browser is initialized");
			break;
		case "Edge":
			System.out.println("Edge Browser is initialized");
			break;
		default:
			System.out.println("No Browser is selected");
			break;
		}
	}
}
