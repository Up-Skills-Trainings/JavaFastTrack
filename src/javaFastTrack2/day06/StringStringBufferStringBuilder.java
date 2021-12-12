package javaFastTrack2.day06;

public class StringStringBufferStringBuilder {
	public static void main(String[] args) {

		// String is an immutable class
		// Stringbuffer and Stringbuilder are mutable classes
		// But stringbuilder is faster than stringbuffer because, sbuilder is not trying to be syncronized
		String str = "";

		StringBuffer sBuffer = new StringBuffer("");

		StringBuilder sBuilder = new StringBuilder("");

		int limit = 500000;

		long startingTime = System.currentTimeMillis();
		for (int i = 0; i < limit; i++) {
			str += "a";
		}
		long endingTime = System.currentTimeMillis();
		long excetionTime = endingTime - startingTime;
		System.out.println(excetionTime);

		System.out.println("=============================");
		startingTime = System.currentTimeMillis();
		for (int i = 0; i < limit; i++) {
			sBuffer.append("a");
		}
		endingTime = System.currentTimeMillis();
		excetionTime = endingTime - startingTime;
		System.out.println(excetionTime);

		System.out.println("=============================");
		startingTime = System.currentTimeMillis();
		for (int i = 0; i < limit; i++) {
			sBuilder.append("a");
		}
		endingTime = System.currentTimeMillis();
		excetionTime = endingTime - startingTime;
		System.out.println(excetionTime);
	}
}
