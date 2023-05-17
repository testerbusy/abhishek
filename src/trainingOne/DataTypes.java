package trainingOne;

public class DataTypes {

	//Data types are two type
	/*
	 * Premitive data type --> Boolean, Byte, char, short, long, int, float and double
	 * Non-Primitive data type --> interfaces, array, classes
	 * 
	 */
	public static void main(String[] args) {
		
		longDataType();
		floatDataType();
		doubleDatatype();
		stringAndChar();
	}
	public static void booleanDataType() {
		boolean name = true;
		System.out.println(name);
	}
	
	public static void byteDataType() {
		byte a =-128;  //-128 to 127
		System.out.println(a);
	}
	
	public static void shortDatatype() {
		short s = -32768; //-32768  to 32767
		System.out.println(s);
	}
	
	public static void intDataType() {
		int a= 2147483647;  //-2147483648 to 2147483647
		System.out.println(a);
	}
	
	public static void longDataType() {
		long a = 3242342332423423L; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		System.out.println(a);
		
	}
	
	public static void floatDataType() {
		float f = 23.4f; //
		System.out.println(f);
	}
	
	public static void doubleDatatype() {
		double d = 23.4;
		System.out.println(d);
	}
	
	public static void stringAndChar() {
		char c='d';
		String name = "Raghu";
		System.out.println(c);
		System.out.println(name);
	}
}
