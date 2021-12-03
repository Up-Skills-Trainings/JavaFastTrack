package day6;

import java.util.LinkedHashMap;
import java.util.Map;

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

		for (Character each : str.toCharArray()) {

			if (map.containsKey(each)) {
				// update the map, we are updating the value part of the map
				map.put(each, map.get(each) + 1);

				// {'h':1, 'e':1, 'l':2}
			} else {
				// There is no "key(char)" in the map yet, so insert it to the map
				map.put(each, 1);
				// {'h':1, 'e':1, 'l':1}
			}

		}

		System.out.println(map);

	}

}