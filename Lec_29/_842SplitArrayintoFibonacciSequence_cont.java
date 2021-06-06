package Lec_29;

import java.util.ArrayList;
import java.util.List;

public class _842SplitArrayintoFibonacciSequence_cont {
	public static void main(String[] args) {
		List<Integer> final_ans = new ArrayList<>();
		solve("1101111", new ArrayList<>(), final_ans);
		System.out.println(final_ans);
	}

	public static void solve(String str, List<Integer> ans, List<Integer> final_ans) {
		if (str.isEmpty()) {
			if (ans.size() >= 3 ) {
//				System.out.println(ans);
//				final_ans = new ArrayList<>(ans);
				final_ans.addAll(ans);
			}
			return;
		}
		if(final_ans.size() > 0) { // -ve BC
			return;
		}
		for (int i = 1; i <= str.length() && i <= 10; i++) {

			String part1 = str.substring(0, i); // partition
			String part2 = str.substring(i); // remaining
			if (inRange(part1) && isNotZero(part1)) {
				int partition = Integer.parseInt(part1);
				if (isFib(ans, partition)) {
					ans.add(partition);
					solve(part2, ans, final_ans);
					ans.remove(ans.size() - 1);
				}
			}
		}

	}

	public static boolean isNotZero(String str) {
		if (str.length() == 1) {
			return true;
		}
		return str.charAt(0) != '0';
	}

	public static boolean isFib(List<Integer> ans, int part) {
		if (ans.size() < 2) {
			return true;
		}
		int num1 = ans.get(ans.size() - 1);
		int num2 = ans.get(ans.size() - 2);
		return num1 + num2 == part;
	}

	public static boolean inRange(String num) {
		if (num.length() > 10) {
			return false;
		}
		long n1 = Long.parseLong(num);
		return n1 <= Integer.MAX_VALUE;
	}

}
