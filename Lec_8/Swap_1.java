package Lec_8;

public class Swap_1 {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 23, 12, 14, 7 };
		int c = 1;
		System.out.println(a1[c] + " : "+a2[c]);
		swap_in(a1, a2, c);
		System.out.println(a1[c] + " : "+a2[c]);
	}

	public static void swap_in(int[] a, int[] b, int c) {
		System.out.println(a[c] + " : "+b[c]);
		int d = a[c];
		a[c] = b[c];
		b[c] = d;
		System.out.println(a[c] + " : "+b[c]);

	}

}
