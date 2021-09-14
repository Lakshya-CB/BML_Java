package Bit_Masking;

public class Magic_number {
	public static void main(String[] args) {
		int n = 9;
		int mask = 1;
		int mult = 1;
		int ans = 0;
		while (mask <= n) {
//			System.out.println(n&mask);
			if ((n & mask) > 0) {
//				ith bit is 1!!
				ans = ans + mult;
			}
			mult=mult*5;
			mask = mask << 1;
		}
		System.out.println(ans);
	}
}
