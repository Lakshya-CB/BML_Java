package Lec_28;

import java.util.ArrayList;
import java.util.List;

public class _131_PalindromePartitioning {
	public static void main(String[] args) {
		List<List<String>> All_ans = new ArrayList<List<String>>();
		part("nitin", new ArrayList<>(),All_ans);
		System.out.println(All_ans);
	}

	public static void part(String str, List<String> ans,List<List<String>> All_ans) {
		if (str.isEmpty()) {
//			System.out.println(ans);
			All_ans.add(new ArrayList<>(ans));
		}

		for (int i = 1; i <= str.length(); i++) {
			String part1 = str.substring(0, i);
			if (is_palin(part1)) {
				String part2 = str.substring(i);
				ans.add(part1);
				part(part2, ans,All_ans);
				ans.remove(ans.size()-1);
			}
		}
	}

	public static boolean is_palin(String str) {
		int low = 0;
		int high = str.length() - 1;
		while (low < high) {
			if (str.charAt(high) == str.charAt(low)) {
				low++;
				high--;
			} else {
				return false;
			}
		}
		return true;
	}
}
