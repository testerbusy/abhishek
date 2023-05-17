package stringAssignemnts;

public class StringBufferExamples {
	public void StringBuffer() {
		String name = "Raghu Vardhan";
		StringBuffer sb = new StringBuffer(name);
		sb.append(" Makam");
		System.out.println(sb);
		sb.insert(13, "Makam ");
		System.out.println(sb);
		sb.replace(13, 18, " ");
		System.out.println(sb);
		sb.delete(0, 5);
		sb.deleteCharAt(0);
		sb.deleteCharAt(0);
		System.out.println(sb);
		//Reverse-->write a code to reverse the string-->Assignment
		//Palindrome--> Write a code to check whether the string is palindrome
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.charAt(2));
		System.out.println(sb.length());
		System.out.println(sb.substring(5));
	}
	
	public static void StringBuilder() {
		String name = "Raghu Vardhan";
		StringBuilder stringbuilder = new StringBuilder(name);
		stringbuilder.append(" Makam");
		System.out.println(stringbuilder);
	}
	public static void main(String[] args) {
		StringBuilder();
	}
	
	//JavaExceptions-->Throw and Throws-->How to handle this exceptions-->types of exceptions
	// final/finally/finalize-->most important question
	//try/catch/finally
}
