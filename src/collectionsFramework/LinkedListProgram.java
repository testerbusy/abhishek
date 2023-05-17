package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram {
	/*
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
		LinkedList<Integer> linklist = new LinkedList<Integer>();
		linklist.add(101);
		linklist.add(201);
		linklist.add(301);
		linklist.add(401);
		linklist.add(501);
		linklist.add(601);
		linklist.add(701);
		System.out.println(linklist);
		Iterator<Integer> itr = linklist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		LinkedList<Integer> linklist2 = new LinkedList<Integer>();
		linklist2.add(102);
		linklist2.add(202);
		linklist2.add(302);
		linklist2.add(402);
		linklist2.add(502);
		linklist2.add(602);
		linklist2.add(702);
		linklist.addAll(linklist2);
		System.out.println(linklist);
		System.out.println("This is method to get value based on index"+linklist.get(4));
		System.out.println("Size of linklist "+linklist.size());
		//linklist.clear();
		linklist.removeAll(linklist2);
		System.out.println(linklist);
		System.out.println("Size of linklist after removing "+linklist.size());
		
	}
	
	/*
	 * Manipulation of Arraylist is slow, Linkedlist is faster than Arraylist
	 * Arraylist class can act as list, linked list can act as a list and queue
	 * Arraylist is better for sorting and accessing data, linked list is better for manipulating data
	 * Arraylist internally uses a dynamic array to store elements, linkedlist uses a double liniked list to store elements.
	 */
	
	public void listsyntax() {
		List<String> list = new ArrayList<String>();
		List<Integer> intlist = new ArrayList<Integer>();
		List<String> linklist = new LinkedList<String>();
	}
}
