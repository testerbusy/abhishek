package collectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetProgram {
	
	/*
	 * it is a class contains unique elements only like hashSet
	 * it will permit null elements
	 * linkedHashset maintains insertion order
	 */
	
	/*
	 * add
	 * clear
	 * contains-->Boolean
	 * isempty-->Boolean
	 * remove
	 * iterator
	 * size-->int
	 * spliterator-->Ignore
	 * clone
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Akram");
		list.add("Harish");
		list.add("sankar");
		list.add("sai");
		list.add("");
		list.add(null);
		list.add("Harish");
		list.add("Harish");
		list.add("bindu");
		list.add("ankitha");
		list.add("vishali");
		list.add("chandu");
		System.out.println(list);
		HashSet<String> set = new HashSet<String>(list);
		set.add("Raghu");
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void linkedHashSetss() {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Akram");
		set.add("Harish");
		set.add("sankar");
		set.add("sai");
		set.add("");
		set.add(null);
		set.add("Harish");
		set.add("Harish");
		set.add("bindu");
		set.add("ankitha");
		set.add("vishali");
		set.add("chandu");
		
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
