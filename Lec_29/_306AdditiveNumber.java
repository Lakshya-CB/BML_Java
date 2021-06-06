package Lec_29;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class _306AdditiveNumber {
	static boolean bol_ans=false;
	public static void main(String[] args) {
		bol_ans=false;
		solve("1101111", new ArrayList<>());
//		System.out.println(final_ans);
	}

	public static void solve(String str, List<BigInteger> ans) {
		if (str.isEmpty() && ans.size() > 2) {
			System.out.println(ans);
			bol_ans=true;
			return;
		}

		for (int i = 1; i <= str.length() && bol_ans ==false; i++) {
			String part1 = str.substring(0, i); // partition
			String part2 = str.substring(i); // remaining
			if (isNotZero(part1)) {
//				int partition = Integer.parseInt(part1);
				BigInteger partition = new BigInteger (part1);
				if (isAdditive(ans, partition)) {
					ans.add(partition);
					solve(part2, ans);
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

	public static boolean isAdditive(List<BigInteger> ans, BigInteger part) {
		if (ans.size() < 2) {
			return true;
		}
		BigInteger num1 = ans.get(ans.size() - 1);
		BigInteger num2 = ans.get(ans.size() - 2);
		
		BigInteger sum = num1.add(num2);
		
		return sum.equals(part);
	}
	
	

	public static boolean inRange(String num) {
		if (num.length() > 10) {
			return false;
		}
		long n1 = Long.parseLong(num);
		return n1 <= Integer.MAX_VALUE;
	}

}
