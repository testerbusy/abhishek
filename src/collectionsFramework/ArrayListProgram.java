package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListProgram {
	
	/*
	 * List-->ArrayList, LinkedList, Vector and stack
	 * 
	 * it contains duplicate elements
	 * it maintain insertion order
	 * it allows random access, because the array works on an index basis
	 * manupulation is a little bit slower than linkedlist, because a lot of shifting needs to 
	 * occur if any element is removed from the list
	 * 
	 * add
	 * addall
	 * get
	 * clear
	 * isEmpty
	 * lastindexof 
	 * remove
	 * removeall
	 * size
	 * 
	 */
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bindu");
		list.add("Sneha");
		list.add("Ankitha");
		list.add("chandu local");
		list.add("Ankitha");
		list.add("Ankitha");
		list.add("Ankitha");
		list.add("Bindu");
		System.out.println(list.lastIndexOf("chandu local"));
		
	}
	
	public void method() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bindu");
		list.add("Sneha");
		list.add("Ankitha");
		list.add("vaishali");
		list.add("shajida");
		list.add("veeralakshmi");
		list.add("Bindu");
		System.out.println(list);  //Printing list 
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Sankar");
		list2.add("govardhan");
		list2.add("pavan");
		list2.add("chandu local");
		list2.add("shiva reddy");
		list2.add("kranthi");
		list2.add("Bhaskar");
		System.out.println(list2);  //printing list2
		list.addAll(list2);         // adding list2 data to list
		System.out.println(list);   // printing list
		list.remove(0);             //removing particular item from list
		System.out.println(list.size()); 
		list.removeAll(list2);
		System.out.println(list.size());
		
		
		/*
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		System.out.println(list.get(2));
		Collections.sort(list);  //Sorting an array
		System.out.println(list);
		list.clear();
		System.out.println(list.isEmpty());
		
		//Assignment --> write a program to sort an array list without using predefined function
		//practice creating 2list with name vegetable and fruits try to use this methods
		//create linked list and try using this methods.
		
	}
}
