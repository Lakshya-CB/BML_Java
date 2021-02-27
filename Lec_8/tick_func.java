package Lec_8;

public class tick_func {
	public static void main(String[] args) {
		int a =1;
		int b = 20;
		System.out.println(a+" : "+ b);
		swap(a,b);
		System.out.println(a+" : "+ b);
	}
	public static void swap(int a, int b) {
		System.out.println(a+" : "+ b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a+" : "+ b);
	}
}
