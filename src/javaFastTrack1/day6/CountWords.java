package day6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountWords {

	public void count(String text) {
		// The purpose of that quesiton is counting the pair of words.
		// String text = "The quick brown fox and the quick blue hare.";
		// "The quick" : 2
		// "quick brown" : 1
		// "brown fox" : 1

		// I am using the regex here to split the symbols from the text
		String[] arr = text.split("[ \n\t\r.,:;!?(){]");

		// Creating another list only with non-empty elements from the arr array.
		List<String> list0 = new ArrayList<>();
		for (String string : arr) {
			if (!string.isEmpty()) {
				list0.add(string);
			}
		}

		// We are creating list here to get the structure of this>> {(The quick),
		// (quick brown), (brown fox) etc..}
		// list should be like this>> {(The quick), (quick brown), (brown fox) etc..}
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < list0.size(); i++) {
			// now I am combining the words here
			String stringToAdd = list0.get(i - 1) + " " + list0.get(i);
			list.add(stringToAdd);
		}

		// map structure should be like this {(The quick : 2), (quick brown : 1), (brown
		// fox : 1) etc..}
		// the purpose of using linkedhashmap is to keep it "insertion-ordered"
		Map<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < list.size(); i++) {
			String key = list.get(i).toLowerCase();

			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				} else {
					int value = map.get(key);
					value++;
					map.put(key, value);
					// map.put(key, map.get(key) + 1);

				}
			}
		}
		// System.out.println(map);

		// Get all entries into a set
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// System.out.println(entrySet);

		// Get key and value from each entry
		for (Map.Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() + "  " + e.getValue());
		}
	}

	public static void main(String[] args) {
		CountWords cw = new CountWords();
		String text = "The quick ? { , ; brown fox and the quick blue hare.";
		cw.count(text);
	}

}
