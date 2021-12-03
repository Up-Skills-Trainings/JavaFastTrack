package day5;

public class SubClass extends SuperClass {
	// encapsulation is just hiding the date
	private int num = 0;

	// we create getters and setters if we need them 
	// getter reads the data
	public int getNum() {
		return num;
	}

	// setter sets the new data to the varible
	public void setNum(int num) {
		this.num = num;
	}
}
