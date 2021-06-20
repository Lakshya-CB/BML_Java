package Lec_31;

import java.util.ArrayList;
import java.util.List;

public class _89_GrayCode {
	public static void main(String[] args) {
//		Coin_T2(3, false, "");
//		count_lex(0);
//		jumpin(0);
		part("nitin", "");
	}

	public static void Coin_T2(int n, boolean prev, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		if (prev) {
			Coin_T2(n - 1, false, ans + "T");

		} else {
			Coin_T2(n - 1, true, ans + "H");
			Coin_T2(n - 1, false, ans + "T");
		}
	}

	public static void count_lex(int curr) {
		if (curr > 1000) {
//			System.out.println();
			return;
		}

		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			count_lex(curr * 10 + i);
		}
	}

	public static void jumpin(int curr) {
		if(curr>105) {
			return;
		}
		System.out.println(curr);
		int digit = curr % 10;
		if (curr == 0) {
			for(int i=1;i<=9;i++) {
				jumpin(i);
			}

		}
			
		if(digit==0) {
			jumpin(curr * 10 + (digit + 1));
		}	
		else if(digit==9) {
			jumpin(curr * 10 + (digit - 1));
		}
		else {
			jumpin(curr * 10 + (digit - 1));
			jumpin(curr * 10 + (digit + 1));
		}
	}

	public static void part(String str, String ans ) {
		if(str.isEmpty()) {
			System.out.println(ans);
		}
		for(int i=1;i<=str.length();i++) {
			String chopped = str.substring(0,i);
			String part_rem = str.substring(i);
			
			part(part_rem, ans+chopped + "-");
		}
	}


}
