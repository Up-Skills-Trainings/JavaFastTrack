package javaFastTrack3.day6;

import java.util.*;

public class TestCollectionMap {
	public static void main(String[] args) {
		/*
		 * Key/value pairs, it stores ("string": 10) (10: "string")("string": "string")
		 * 
		 * HashMap, LinkedHashMap, TreeMap
		 * 
		 * HashMap >> not insertion ordered or sorted (just hashing algorithm without being linked), accept "null" value
		 * 
		 * LinkedHashMap >> insertion ordered (using the hashing algorithm but it is linked), accept "null" value
		 * 
		 * TreeMap >> sorted (it is using a tree algorithm, please check what tree algorithm is), does not accept "null" value
		 * 
		 * */
		
		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("city", "Paris");
		map.put("animal", "horse");
		map.put("country", "Sweden");
		map.put("team", "Cowboys");
		map.put(null, "Cowboys");
		
		map.remove("city");
		
		System.out.println(map);
		
		System.out.println(map.containsKey("team"));
		
		System.out.println(map.size());
		
		System.out.println(map.get("team"));
	}
}
