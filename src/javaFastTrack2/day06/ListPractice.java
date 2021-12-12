package javaFastTrack2.day06;

import java.util.*;

// Collection is framework in Java, it keeps the data structures, 
// and it has interfaces, abstract classes and concrete/regular class
// List, Set, Map

// Collections is a class and it keeps the methods for Collection Framework 
public class ListPractice {
	public static void main(String[] args) {

		/*
		 * ArrayList and LinkedList are defined under the List interface. The List
		 * interface extends Collection to define an insertion ordered collection with duplicates
		 * allowed.
		 * 
		 * ArrayList is a resizable-array implementation of the List interface.
		 * 
		 * 
		 * The dif between Array and Arraylist Arrays have fixed length, ArrayList does
		 * not have fixed size. 
		 * Arrays accept primitive types and object, 
		 * ArrayList stores only objects. A print statement we can print the ArrayList without
		 * using to string or loop.
		 * 
		 * list.add() list.contains() list.remove() list.set() list.get() list.size()
		 * list.indexOf() list.lastIndexOf() Collections.sort(list)
		 * Collections.frequency(list, object)
		 */

		List<String> list = new ArrayList<>();
		
		// adding the new data
		list.add("Dallas");
		list.add("Chicago");
		list.add("New York");
		list.add("Denver");
		list.set(0, "Austin");
		list.add(0, "San Antonio");

		System.out.println(list);
		
		// returns if the given data is in the list or not. 
		System.out.println(list.contains("Dallas"));
		
		// remove the element
		System.out.println(list.remove("DC"));
		
		// returns the size of the list
		System.out.println(list.size());

		// it will return the index of given object (first index)
		System.out.println(list.indexOf("Denver"));

		// it will return the last index of given object
		System.out.println(list.lastIndexOf("Denver"));

		// sorts the list 
		Collections.sort(list);
		System.out.println(list);

		System.out.println(Collections.frequency(list, "Dallas"));
	}
}
