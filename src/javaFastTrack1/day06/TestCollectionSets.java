package javaFastTrack1.day06;

import java.util.*;

public class TestCollectionSets {

	public static void main(String[] args) {
		/*
		 * No duplicate elements.
		 * 
		 * Three concrete classes of Set are HashSet, LinkedHashSet, and TreeSet 
		 * 
		 * HashSet >> Just a regular class that we can use >> not ordered >> not even insertion
		 * ordered >> it is faster than other two Set structure
		 * 
		 * LinkedHashSet >> insertion ordered.
		 * 
		 * TreeSet >> sorted, asc
		 * 
		 * The elements in a HashSet are not ORDERED, but the elements in a
		 * LinkedHashSet can be retrieved in the order in which they were inserted into
		 * the set
		 * 
		 * In TreeSet, which guarantees that the elements in the set are sorted.
		 */
		Set<String> set = new LinkedHashSet<String>();
		
		// adding the new data
		set.add("Dallas");
		set.add("Dallas");
		set.add("Chicago");
		set.add("Houston");
		set.add("LA");
		
		System.out.println(set);

		set.add("New York");
		
		// returns a boolean
		set.isEmpty();
		
		// returns a boolean when it finds the given the object
		set.contains("Dallas");
	}

}
