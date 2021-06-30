package Lec_38;

public class C extends P {

// Inherited Parent or Base Class P
	// Class C is called , Derived Class or Child class of Parent P
	int data = 20;
	int data2 = 200;

	// Override
	public void fun() {
		System.out.println("C is having fun");
	}

	public void fun2() {
		System.out.println("C is having fun2");
	}
	public String toString() {
		return "data : "+data+"data2 : "+data2;
	}
}
