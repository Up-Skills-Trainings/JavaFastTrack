package javaFastTrack3.day6;

import java.util.*;

public class TestCollectionSet {
	public static void main(String[] args) {
		/*
		 * No duplicates allowed
		 * 
		 * HashSet, LinkedHashSet, TreeSet
		 * 
		 * HashSet >> not insertion ordered or sorted (just hashing algorithm without
		 * being linked), accept "null" value
		 * 
		 * LinkedHashSet >> insertion ordered (using the hashing algorithm but it is
		 * linked), accept "null" value
		 * 
		 * TreeSet >> sorted (it is using a tree algorithm, please check what tree
		 * algorithm is), does not accept "null" value
		 */

		Set<String> set = new HashSet<>();

		// add the new data
		set.add("New York");
		set.add("Denver");
		set.add("Houston");
		set.add("LA");
		set.add("Denver");
		set.add("San Antonio");
		set.add(null);

		System.out.println(set);

		System.out.println(set.contains("Denver"));

		// returns a boolean
		set.isEmpty();
	}
}
