package interfaces;

public interface MyfunctionalInterface<T> {
	//single abstract method called “mycompare” that takes two parameters of type T and returns a value of type T
	T mycompare(T x,T y);
	
	public static void mystatic1() {
		System.out.println("in my static m1");
	}
	public static void mystatic2() {
		System.out.println("in my static m22");	
	}

	default void mym1() {
		System.out.println("in my static mym1");
	}
	default void mym2() {
		System.out.println("in my static mym2");
	}

}
