package collectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {
	
	/*
	 * Hashset
	 * Linked hashset
	 * 
	 * Difference between list and Set
	 * 1. List will allow duplicate values and Set will not allow duplicates
	 * 2. List will maintain insertion order, Set will not maintain insertion order 
	 */
	
	/*
	 * Important points to remember for Hasset
	 * 1. Hashset contains unique elements only
	 * 2. Hashset allows null value
	 * 3. hashset doesn't maintain the insertion order
	 * 4. Hashset stores elements by using mechanism called hashing
	 * 5. Hashset is the best approach for search operations
	 * 6. it will maintain sorting order 
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
		HashSet<String> set = new HashSet();
		set.add("Bhaskar");
		set.add("Chandu");
		set.add("bindu");
		set.add("Sairam");
		set.add("Akram");
		set.add("bindu");
		set.add("Sairam");
		set.add("Akram");
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		set.clear();
		if(set.isEmpty()==true) {
			System.out.println("Set is Empty");
		}
		set.add("Sampath");
		set.add("Govardhan");
		set.add("Sankar");
		set.add("Kranthi");
		set.add("Pavan");
		set.add("Veeralakshmi");
		set.add("Harish");
		set.add("");
		set.add("");
		if(set.contains("Pavan")) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println(set);
		set.remove("Bindu");
		set.remove("Kranthi");
		System.out.println(set);
		System.out.println(set.size());
		
		HashSet<String> duplicate = new HashSet<String>();
		duplicate = (HashSet<String>) set.clone();
		System.out.println(duplicate);
	}
	
}
