package day5;

public class StaticPractice {
	public static void main(String[] args) {
		// if a member is static, we can reach them out with ClassName.
		// if a member is a non-static, we have to create an instance to reach them out.
		
		StaticKeyword.method();
		
		// without creating an object I can not access the non-static members of anyclass
		StaticKeyword inst = new StaticKeyword();
		inst.method1();
		
		// examples for the static method and data
		Math.addExact(2, 3);
		double num = Math.PI;
		
		
		// constructor is private
		ConstructorPrac obj = new ConstructorPrac();
	}
	}
}
