package javaFastTrack1.day06;

import java.util.*;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

		String str = "hello word";
		// {"char":number of usage}
		frequencyTest(str);
	}

	public static void frequencyTest(String str) {

		// we create an insertion ordered map structure
		// and we are doing the polymorphism here
		Map<Character, Integer> map = new LinkedHashMap<>();

		System.out.println(map);
		for (Character key : str.toCharArray()) {

			if (map.containsKey(key)) {
				// update the map, we are updating the value part of the map
				map.put(key, map.get(key) + 1);

				// {'h':1, 'e':1, 'l':2}
			} else {
				// There is no "key(char)" in the map yet, so insert it to the map
				map.put(key, 1);
				// {'h':1, 'e':1, 'l':1}
			}

		}

		System.out.println(map);

	}

}