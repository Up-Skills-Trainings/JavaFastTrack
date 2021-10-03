package day6;

// In Java we can only extend one class, 
// But Java has interfaces that we can implement as much as we want. 

// Interfaces give us more has a relationship structure
// which means it gives your class a feature

// Every data field is constant and static by default
// We can not create an instance from the interface
// Every method is a abstract method by default
public interface InterfacePractice {
	// we do not have to say final, by default it is final 
	final static int number = 10;
	int number1 = 10;
	
	void method();
	abstract void method1();
	
	// we can add the main method inside of the interface
	// but there is not point to do that
	public static void main(String[] args) {
		int number = 10;
		System.out.println("hello");
	}
	
}
