package javaFastTrack3.day3;

public class FindTheError {
	public static void main(String[] args) {
		camel(10);
	}

	// Find the mistake below;
	
	public static int camel(int n) {
		
		if (n > 0) {
			return 1;
		} else if (n == 0) {
			return 0;
		} else {
			return -1;
		}
	}
}
