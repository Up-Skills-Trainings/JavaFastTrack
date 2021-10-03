package day6;

// We do not want anybody to create any instance from that class.
// We use this abstract class during the inheritance
// It behaves like a regular class but we also have abstract methods that regular class can not have
public abstract class AbstractPractice {

	// we want this method to have a body in the sub class
	// if I extend AbstractPractice class, I have to implement this method. 
	// if I extend AbstractPractice class, and if subclass is also abstract then we do not have to implement this method.
	abstract void method();

	
	void print() {
		System.out.println("This is from Abstract practice class");
	}
}

// Regular or abstract class have "is a relationship"