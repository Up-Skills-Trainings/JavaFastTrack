package javaFastTrack3.day6;

import java.util.*;

public class TestCollectionList {
	public static void main(String[] args) {
		/*
		 * ArrayList and LinkedList are defined under the List interface.
		 * 
		 * insertion ordered, you can have duplicates.
		 * 
		 * What is the difference between the ArrayList and Arrays.
		 * 
		 * Arrays >> must have a size, it keeps primitive types and object, to print use
		 * loops, or convert to toString, arr[i] ArrayList >> you do not have to give a
		 * size, only object type, we can print the arraylist without converting to the
		 * string or using a loop, list.get(i)
		 * 
		 * list.get(), list.contains(), list.remove(), list.add(), list.size(), list.indexOf()
		 * Collections.sort(list)
		 * 
		 */

		List<String> list = new ArrayList<>();

		// add the new data
		list.add("Denver");
		list.add(0, "Sabir");
		list.add("Denver");
		list.add("Houston");
		list.add("LA");
		list.add("New York");
		list.add("New York");
		list.add("New York");
		list.add("New York");
		list.add("San Antonio");

		// swap the data
		list.set(0, "Robinson");

		// remove the data
		list.remove("Denver");

		// remove all the elements you do not want to have
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("Denver")) {
				list.remove(i);
			}
			// do not remove the index while working on for loops, because the size is
			// getting smaller
			// list.remove(list.indexOf("Denver"));
		}

		// checks if you have that element, returns boolean
		System.out.println(list.contains("New "));

		// create a logic that removes the duplicate elements from the list
		// how to do that?
		List<String> list1 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!list1.contains(list.get(i))) {
				list1.add(list.get(i));
			}
		}

		System.out.println(list);
		System.out.println(list1);
		
		// returns the last index of given element, returns an integer
		System.out.println(list.lastIndexOf("New York"));
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, "New York"));

	}
}
