package collectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	/*
	 * map contains Key and value
	 * key and value pair
	 * we can retrieve the data using key
	 * map will maintain unique keys
	 * it maintaining insertion order
	 * 
	 * map-->hashmap, linkedhashmap and treemap
	 * 
	 *put
	 *putall
	 *putif
	 *remove
	 *clear
	 *containsValue
	 *containsKey
	 *equals
	 *get
	 *isempty
	 *replace
	 *replaceall
	 *size
	 */
	
	/*
	 * Hashmap contains values based on the Key
	 * Hashmap contains only unique keys
	 * hashmap may have one null key and multiple null values
	 * hashmap maintains no order
	 * 
	 */
	/*
	 * LinkedHashMap contains values based on Key
	 * LinkedHashmap contains unique elements
	 * LinkedHashMap may have one null key and mutliple null values
	 * LinkedHashMap maintains insertion order
	 */
	
	/*
	 * TreeMap contains values based on the key
	 * TreeMap contains only unique elements
	 * TreeMap Cannot have a null key, but can have mutliple null values
	 * TreeMap maintains ascending order.
	 */
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(103, "Kranthi");
		map.put(101, "Sankar");
		map.put(102, "Bindu");
		//map.remove(103);
		map.putIfAbsent(104, "Chandu");
		//map.clear();
		if(map.containsKey(105)) {
			System.out.println("Key present in records");
		}
		else {
			System.out.println("Key is absent");
		}
		System.out.println(map.get(104));
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		map1.put(103, "Kranthi");
		map1.put(101, "Sankar");
		map1.put(102, "Bindu");
		map1.put(104, "Chandu");
		
		System.out.println(map.equals(map1));
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	public static void mapintr() {
		Map map = new HashMap();
		map.put(101, "Sankar");
		map.put(102, "Bindu");
		map.put(103, "Kranthi");
		map.put(104, "Sampath");
		map.put(105, "Govardhan");
		map.put(106, "Sairam");
		map.put(107, "pavan");
		map.put(108, "Siva");
		map.put(109, "vishali");
		map.put(110, "Sneha");
		System.out.println(map);
		Set set =map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	public static void HashMapExsmp() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Sankar");
		map.put(102, "Bindu");
		map.put(103, "Kranthi");
		map.put(108, "Siva");
		map.put(109, "vishali");
		map.put(110, "Sneha");
		map.put(null, null);

		HashMap<Integer, String> maps = new HashMap<Integer, String>();
		maps.put(104, "Sankar");
		maps.put(105, "Govardhan");
		maps.put(106, "Sairam");
		maps.put(107, "pavan");
		map.putAll(maps);
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
