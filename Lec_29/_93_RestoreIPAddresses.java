package Lec_29;

import java.util.ArrayList;
import java.util.List;

public class _93_RestoreIPAddresses {
	public static void main(String[] args) {
		List<String> All_ans = new ArrayList<>();
		solve("101023", "", 0,All_ans);
		System.out.println(All_ans);
	}

	public static void solve(String str, String ans, int dots,List<String> All_ans) {
		if(str.length()>(4-dots)*3) {
			return;
		}

		if (str.isEmpty() && dots == 4) {
//			System.out.println(ans.substring(0, ans.length() - 1));
			All_ans.add(ans.substring(0, ans.length() - 1));
		}
		for (int i = 1; i <= str.length() && i<=3 ; i++) {
			String part1 = str.substring(0, i); // partition
			String part2 = str.substring(i); // remaining part

			if (inRange(part1) && isNotZero(part1)) {
				solve(part2, ans + part1 + ".", dots + 1,All_ans);
			}
		}
	}
	public static boolean isNotZero(String str) {
		if (str.length() == 1) {
			return true;
		}
		return str.charAt(0) != '0';
	}

	public static boolean inRange(String num) {
		if (num.length() > 10) {
			return false;
		}
		int n1 = Integer.parseInt(num);
		return n1 <= 255;
	}
}
