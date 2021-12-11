package javaFastTrack2.day05;

public class ConstructorPractice {

	// encapsulation is hiding the data, if we need, we can use getters or setters 
	private int number = 10;
	
	// same name with the class name and no return type
	ConstructorPractice(){
	}
	public static void main(String[] args) {
		// constructor is private for SuperClass
		SuperClass inst = new SuperClass();
		SuperClass inst1 = new SuperClass(10);
		
		//The purpose of using the Abstract class is.... we do not want anybody to create any instance from that class 
		AbstractClassPractice inst2 = new AbstractClassPractice();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
