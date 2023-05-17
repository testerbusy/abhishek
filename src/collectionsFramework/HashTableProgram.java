package collectionsFramework;

import java.util.Hashtable;

public class HashTableProgram {
	/*
	 * HashTable class
	 * Hashtable is an array of a list, each list is known as a bucket, the position of teh bucket is identified by calling hashcode() method
	 * Hashtable contains values based on the key
	 * contains unique values
	 * doesn't allow null key or null value
	 * 
	 */
	/*
	 * HashMap is fast, Hashtable is slow
	 * Hashmap maintian null key and multiple null values, hashtable willnot allow null key or null value
	 */
	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(101, "Ankitha");
		hm.put(102, null);
		System.out.println(hm);
	}
}
