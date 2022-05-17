package javaFastTrack3.day6;

import java.util.*;

public class CropTheString {
	public static void main(String[] args) {
		// given a string, crop the string without cropping a word based on the given
		// index
		// Today is Sunday, a sunny Sunday. (Index 10)
		//
		String str = "Today is Sunday a sunny Sunday";
		System.out.println(cropTheString(str, 30));
	}

	static String cropTheString(String str1, int A) {

		// almost every string manipulation during the interview you are supposed to use
		// the split() method

		// to get the every word of that given string as an array, use the split method
		String[] str = str1.split(" ");

		System.out.println(Arrays.toString(str));

		// join method is important
		List<String> list = new ArrayList<>();
		Collections.addAll(list, str);
		System.out.println(list);

		int len = str1.length();
		System.out.println(len);
		if (len <= A) {
			return str1;
		} else {
			for (int i = list.size() - 1; i >= 0; i--) {
				list.remove(i);
				// join method did solve problem
				if (String.join(" ", list).length() <= A) {
					return String.join(" ", list);
				}
			}
		}

		return String.join(" ", list);
	}
}
