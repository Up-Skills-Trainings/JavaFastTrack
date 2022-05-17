package javaFastTrack3.day6;

import java.util.*;

public class CountingTheWords {
	public static void main(String[] args) {
		String text = "The quick brown fox and the quick blue hare";

		// The quick = 2
		// quick brown = 1
		// brown fox = 1 etc...

		// using the regex here to split the symbols from the text
		String[] str = text.split(" ");

		System.out.println(Arrays.toString(str));

		List<String> list = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			// we are adding the elements of the str to the list
			list.add(str[i]);
		}

		// creating the map structure to count the words and assign them to the key
		Map<String, Integer> map = new LinkedHashMap<>();
		System.out.println(map);
		for (int i = 0; i < list.size(); i++) {
			String key = list.get(i).toLowerCase();

			if (!map.containsKey(list.get(i))) {
				map.put(key, 1);
			} else {
				map.put(key, map.get(key) + 1);
			}
		}
		
		System.out.println(map);
		
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		System.out.println(entryset);
		
		for (Map.Entry<String, Integer> entry : entryset) {
			System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
		}
		
		System.out.println();
		
		

	}
}
