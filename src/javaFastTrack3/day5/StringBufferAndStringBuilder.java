package javaFastTrack3.day5;

public class StringBufferAndStringBuilder {
	public static void main(String[] args) {
		// not immutable
		// strbuffer is trying to be synchronized
		// strbuilder is not trying to be synchronized which means, strbuilder is faster
		// than strbuffer
		StringBuffer strbuffer = new StringBuffer("");
		StringBuilder strbuilder = new StringBuilder("");
		int a = 300000;

		// immutable
		String strstring = new String("");
////////////////////////////////////////////////
		long exeStartTime = System.currentTimeMillis();
		for (int i = 0; i < a; i++) {
			strbuffer = strbuffer.append("a");
		}
		long exeEndTime = System.currentTimeMillis();
		long totalExecutionTime = exeEndTime - exeStartTime;
		System.out.println("Stringbuffer: " + totalExecutionTime);
////////////////////////////////////////////////
		exeStartTime = System.currentTimeMillis();
		for (int i = 0; i < a; i++) {
			strbuilder = strbuilder.append("a");
		}
		exeEndTime = System.currentTimeMillis();
		totalExecutionTime = exeEndTime - exeStartTime;
		System.out.println("Stringbuilder: " + totalExecutionTime);
////////////////////////////////////////////////
		exeStartTime = System.currentTimeMillis();
		for (int i = 0; i < a; i++) {
			strstring += "a";
		}
		exeEndTime = System.currentTimeMillis();
		totalExecutionTime = exeEndTime - exeStartTime;
		System.out.println("String: " + totalExecutionTime);
////////////////////////////////////////////////
	}
}
