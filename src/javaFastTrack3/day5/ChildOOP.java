package javaFastTrack3.day5;

/* Inheritance (is a relationship), parent class and child class and we use extends keyword, we only extend one class
 * Encapsulation >> hiding the data (singleton design patter example)
 * Polymorphism >> showing a type with its super type is called Polymorphism, showing the ArrayList with its super type.  
 * Abstraction >> Abstract class, we do not want anybody to create any instance from that class. 
 * Interfaces (has a relationship), adding more or new feature to the classes. (it is also called dependency injection)
 * */
public class ChildOOP extends OOP {

	String str1 = "hello";
	
	// this is the constractor
	private ChildOOP() {

	}

	public static void main(String[] args) {
		
		// Polymorphism happens here. 
		OOP obj = new ChildOOP();

		System.out.println(obj.getStr());
		obj.setStr("world");
		System.out.println(obj.getStr());
		System.out.println(obj.toString());
	}
	
	public String toString() {
		return "this is from ChildOOP class" + str1;
	}

	// What are the differences between the abstract classes and interfaces?
	// the purpose of that question is not to hear syntax differences.
	// we do not anybody to create any instance from abstract class >> ONLY PURPOSE
	
}
