package Lec_38;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		// case 1
		C obj = new C();

		//
		System.out.println(obj);
//		ArrayList<Integer> AL = new ArrayList<>();
//		AL.add(999);

//		System.out.println(AL);
		//
		System.out.println(obj.data);
		// Variables are resolved from LHS
		System.out.println(((P) obj).data);
		// By type Casting you can get the data member of Parent Class

		System.out.println(obj.data2);
		System.out.println(obj.data1);

		obj.fun(); // Called The function from C

		((P) obj).fun();
		// Resolve Functions using RHS, of where u typed new

		// Compiler is checking LHS= Writing and JVM is checking RHS = RUN TIME
		obj.fun1();

		//
		System.out.println("----------");
		// Case 2

		P obj2 = new C();

		System.out.println(obj2.data);
		System.out.println(obj2.data1);

		System.out.println(((C) obj2).data2);
		System.out.println(((C) obj2).data);

		obj2.fun();
		obj2.fun1();

		((P) obj2).fun();

		// Case 3
		// C obj3 = new P(); // this is not possible in any language!
//		Case 4
		P obj4 = new P();

	}

}
