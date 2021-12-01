package day6;

import java.util.*;

public class TestCollectionMap {
	public static void main(String[] args) {
		/*
		 * key/value pairs A map is a container object that stores a collection of
		 * key/value pairs. It enables fast retrieval, deletion, and updating of the
		 * pair through the key. A map stores the values along with the keys. The keys
		 * are like indexes. In List, the indexes are integers. In Map, the keys can be
		 * any objects. A map cannot contain duplicate keys. Each key maps to one value.
		 * 
		 * HashMap >> not insertion ordered
		 * 
		 * LinkedHashMap >> insertion ordered
		 * 
		 * TreeMap >> sorted
		 * 
		 * map.put(K key, V value) map.remove(Object key) map.containsKey(Object key)
		 * map.containsValue(Object value) map.isEmpty() map.size()
		 * 
		 * The java.util.HashMap.entrySet() method in Java is used to create a set out
		 * of the same elements contained in the hash map. It basically returns a set
		 * view of the hash map or we can create a new set and store the map elements
		 * into them.
		 */

		Map<String, String> map = new HashMap<>();

		map.put("city", "paris");
		map.put("animal", "cat");
		map.put("country", "UK");
		map.put("team", "cowboys");

		System.out.println(map);

		map.remove("animal");
		System.out.println(map);
		
		if(map.containsKey("team")) {
			System.out.println("smth here");
		}
		
		System.out.println(map.size());
		
		Map<String, String> map2 = new HashMap<>();

		map2.put("city", "paris");
		map2.put("animal", "cat");
		map2.put("country", "UK");
		map2.put("team", "cowboys");

		System.out.println(map2);

		map2.remove("animal");
		
		map2.put("country", map.get("country") + " France");
		
		System.out.println(map2);
		
		if(map2.containsKey("team")) {
			System.out.println("smth here");
		}
		
		System.out.println(map2.size());
	}
}
