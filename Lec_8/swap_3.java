package Lec_8;

public class swap_3 {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 23, 12, 14, 7 };
		int c = 1;
		System.out.println(a1[c] + " : " + a2[c]);
		swap_arr(a1, a2);
		System.out.println(a1[c] + " : " + a2[c]);
	}
	public static void swap_arr(int[] a, int[] b) {
		int c=1;
		System.out.println(a[c] + " : " + b[c]);
		int[] d = a;
		a = b;
		b = d;
		System.out.println(a[c] + " : " + b[c]);
	}

}
