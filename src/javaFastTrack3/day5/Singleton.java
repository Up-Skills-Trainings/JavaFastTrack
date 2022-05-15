package javaFastTrack3.day5;

public class Singleton {

	// The purpose of the singleton is to create one instance from that class
	// how do we achieve that
	// use encapsulation

	private final Singleton obj = new Singleton();

	// private final Singleton obj = null;

	// if we do not make the constractor private, it will allow users to create
	// instance from that.
	private Singleton() {

	}

	public Singleton getInstance() {
		return obj;
	}

//	public Singleton getInstance() {
//		if(this.obj == null) {
//			return new Singleton();
//		}else {
//			return obj;
//		}
//	}

}
