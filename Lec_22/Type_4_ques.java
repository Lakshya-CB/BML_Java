package Lec_22;

import java.util.ArrayList;

public class Type_4_ques {
	public static void main(String[] args) {
//		lexico_count(0, 1000);
//		parenthesis(0, 0, 3, "");
//		Partitioning("nitin", "");
//		System.out.println(is_palin("l"));
		System.out.println(diff_add_paren("2*3-4*5"));
	}

	public static void lexico_count(int curr, int final_1) {
		if (curr > final_1) {// -ve BC
			return;
		}
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		System.out.println(curr);
		for (; i <= 9; i++) {
			lexico_count(curr * 10 + i, final_1);
		}
	}

	public static void parenthesis(int open, int close, int n, String ans) {
		if (open > n || close > n || close > open) { // -ve BC
			return;
		}
		if (open == n && close == n) { // +ve BC
			System.out.println(ans);
			return;
		}
		parenthesis(open, close + 1, n, ans + ')');
		parenthesis(open + 1, close, n, ans + '(');
	}

	public static void Partitioning(String str, String ans) {
		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= str.length(); i++) {
			String part1 = str.substring(0, i); // chopped one is palindrome ??
			if (is_palin(part1)) {
				String part2 = str.substring(i); // remaining
				String new_ans = ans + "-" + part1;

//			ans = ans + "-" + part1;
//			System.out.println();
				Partitioning(part2, new_ans);
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

	public static ArrayList<Integer> diff_add_paren(String eq) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		if(eq.indexOf('+')==-1 &&eq.indexOf('*')==-1&&eq.indexOf('-')==-1) {
			ans.add(Integer.parseInt(eq));
			return ans;
		}
		
		
		for (int i = 0; i < eq.length(); i++) {
			char ch = eq.charAt(i);
			if (ch == '+' || ch == '*' | ch == '-') {
				String part1 = eq.substring(0, i);
				String part2 = eq.substring(i + 1); // skip operator
				ArrayList<Integer> Al1 = diff_add_paren(part1);
				ArrayList<Integer> Al2 = diff_add_paren(part2);
				for(int val1 : Al1) {
					for(int val2:Al2) {
						if(ch=='-') {
							ans.add(val1-val2);
						}
						if(ch=='*') {
							ans.add(val1*val2);
						}
						if(ch=='+') {
							ans.add(val1+val2);
						}
					}
				}
			}

		}
		return ans;
	}

}
