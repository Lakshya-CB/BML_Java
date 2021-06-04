package Lec_28;

import java.util.ArrayList;
import java.util.List;

public class _1239_MaximumLengthofaConcatenatedStringwithUniqueCharacters {
	static int max = 0;

	public static void main(String[] args) {
		List<String> AL = new ArrayList<String>();
		AL.add("un");
		AL.add("iq");
		AL.add("ue");
		System.out.println(AL);
		max = 0;
		solve_user(AL, 0, "");
		System.out.println(max);
	}

	public static void solve_user(List<String> AL, int index, String ans) {

//		if(isSol(ans)) {
//			if(max<ans.length()) {
//				max = ans.length();
//			}
		System.out.println(ans);
//		}

//		if(index==AL.size()) { // -ve BC
//			return;
//		}
		for (int i = index; i < AL.size(); i++) {
			if (isSol(ans + AL.get(i))) {
				solve_user(AL, i + 1, ans + AL.get(i));
			}
		}
	}

	public static boolean isSol(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i) - 'a'] > 0) {
				return false;
			}
			freq[s.charAt(i) - 'a']++; // at that wallet just put that element
		}
		return true;
	}
}
