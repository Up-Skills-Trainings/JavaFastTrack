package javaFastTrack2.day06;

public interface InterfaceExample extends java.io.Serializable {
	// interface provides features to the classes
	// interface is using "has a relationship"
	// dependency injection 
	// everything method is abstract and every data field is constant 
	// we can implement as many interfaces as we want
	// we can ony extend one class.
	// if we want to extend another interface from an interface we use "extends" keyword
	int NUMBER = 19;
	final int NUMBER2 = 19;
	
	// we can start our application from the main inside of the interface but, there is no point to do that. 
	public static void main(String[] args) {
		
	}
}
