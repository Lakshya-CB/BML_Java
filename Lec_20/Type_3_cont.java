package Lec_20;

import java.util.ArrayList;
import java.util.List;

public class Type_3_cont {
	public static void main(String[] args) {
//		System.out.println(Mobile_comb(""));
//		System.out.println(All_perms("abc"));
//		All_perms("abc");
		System.out.println(Coin_Toss(3));
	}

	public static ArrayList<String> Coin_Toss(int n){
		if(n==0) {
			ArrayList<String> bp = new ArrayList<>();
			bp.add("");
			return bp;
		}
		ArrayList<String> sp = Coin_Toss(n-1);
		ArrayList<String> bp = new ArrayList<>();
		for(String prev_coin : sp) {
			bp.add('H'+prev_coin);
			bp.add('T'+prev_coin);
		}
		return bp;
		
	}
	public static ArrayList<String> All_perms(String str) {
		// base case ?
		if (str.isEmpty()) {
			ArrayList<String> bp = new ArrayList<>();
			bp.add("");
			return bp;
		}
		ArrayList<String> sp = All_perms(str.substring(1));
		ArrayList<String> bp = new ArrayList<>();
		char ch = str.charAt(0);

		for (String small_perm : sp) { // selected my small perm
			// which splits and adds my first char
			for (int i = 0; i <= small_perm.length(); i++) {
				bp.add(small_perm.substring(0, i) + ch + small_perm.substring(i));
			}
		}
		System.out.println(str+" : " + bp);
		return bp;
	}

	public static List<String> Mobile_comb(String str) { // 232
		if (str.isEmpty()) {
			List<String> bp = new ArrayList<>();
//			bp.add("");
			return bp;
		}
		List<String> sp = Mobile_comb(str.substring(1));// 32
		if (sp.isEmpty()) {
			sp.add("");
		}
		List<String> bp = new ArrayList<>();
		String mapped = Mapping_func(str.charAt(0));
		for (int i = 0; i < mapped.length(); i++) {
			for (String small_comb : sp) {
				bp.add(mapped.charAt(i) + small_comb);
			}
		}
		return bp;
	}

	public static String Mapping_func(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {
			return "def";
		} else if (ch == '4') {
			return "ghi";
		} else if (ch == '5') {
			return "jkl";
		} else if (ch == '6') {
			return "mno";
		} else if (ch == '7') {
			return "pqrs";
		} else if (ch == '8') {
			return "tuv";
		} else {
			return "wxyz";
		}
	}
}
