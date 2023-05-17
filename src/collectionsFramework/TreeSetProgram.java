package collectionsFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetProgram {
	/*
	 * Tree set is a class,it will implements Set interface
	 * Important points
	 * 
	 * unique elements like hashSet
	 * access and retrieval times are quiet faster
	 * doesn't allow null element
	 * maintains ascending order
	 * 
	 */
	
	public static void main(String[] args) {

		
		TreeSet<String> al = new TreeSet<String>();
		al.add("Raghu");
		al.add("kranthi");
		al.add("Govardhan");
		al.add("Bhaskar");
		al.add("Sajida");
		al.add("Pavan");
		al.add("veeralakshmi");
		al.add("siva reddy");
		al.add("Sajida");
		System.out.println(al);
		
	}
}
