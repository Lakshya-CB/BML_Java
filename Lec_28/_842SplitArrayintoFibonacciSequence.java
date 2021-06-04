package Lec_28;

import java.util.ArrayList;
import java.util.List;

public class _842SplitArrayintoFibonacciSequence {
	public static void main(String[] args) {

		solve("1234", new ArrayList<>());
	}

	public static void solve(String str, List<String> ans) {
		if (str.isEmpty()) {
			if (ans.size() >= 3) {
				System.out.println(ans);
			}
			return;
		}
		for (int i = 1; i <= str.length(); i++) {
			String part1 = str.substring(0, i);
			String part2 = str.substring(i);
			ans.add(part1);
			solve(part2, ans);
			ans.remove(ans.size() - 1);
		}

	}
}
