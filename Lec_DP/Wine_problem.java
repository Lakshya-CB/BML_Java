package Lec_DP;

public class Wine_problem {
	public static void main(String[] args) {
		int[] wine = { 2, 3, 5, 1, 4 };
//		System.out.println(rec(wine, 0, wine.length-1));
//		int[][]dp = new int[wine.length][wine.length];
//		System.out.println(rec_TD(wine, 0, wine.length-1, dp));
		System.out.println(BU(wine));
	}

	public static int rec(int[] wine, int s, int e, int day) {
		if (s == e) {
			return day * wine[s];
		}
		int C1 = rec(wine, s + 1, e, day + 1) + wine[s] * day;
		int C2 = rec(wine, s, e - 1, day + 1) + wine[e] * day;
		return Math.max(C1, C2);
	}

	public static int rec(int[] wine, int s, int e) {
//		Day = number of bottles sold +1
//		Bottles sold in from = s and sold at last = (wine.len - (e+1));

		int day = 1 + (s + (wine.length - (e + 1)));
		if (s == e) {
			return day * wine[s];
		}
		int C1 = rec(wine, s + 1, e, day + 1) + wine[s] * day;
		int C2 = rec(wine, s, e - 1, day + 1) + wine[e] * day;
		return Math.max(C1, C2);
	}

	public static int rec_TD(int[] wine, int s, int e, int[][] dp) {
//		Day = number of bottles sold +1
//		Bottles sold in from = s and sold at last = (wine.len - (e+1));
		int day = 1 + (s + (wine.length - (e + 1)));
		day = s - e + wine.length;
		if (s == e) {
			return day * wine[s];
		}
		if (dp[s][e] != 0) {
			return dp[s][e];
		}
		int C1 = rec_TD(wine, s + 1, e, dp) + wine[s] * day;
		int C2 = rec_TD(wine, s, e - 1, dp) + wine[e] * day;
		dp[s][e] = Math.max(C1, C2);
		return Math.max(C1, C2);
	}

	public static int BU(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
		for (int dia = 0; dia < wine.length; dia++) {
			int s = 0;
			int e = dia;
			while (s < wine.length && e < wine.length) {
//				System.out.println(s + " "+e);
//				Just create your solution from Smallest Prob
				int day = 1 + (s + (wine.length - (e + 1)));
				day = s - e + wine.length;
				if (s == e) {
					dp[s][e] = day * wine[s];
				} else {
					int C1 = dp[s + 1][e] + wine[s] * day;
					int C2 = dp[s][e - 1]+ wine[e] * day;
					dp[s][e] = Math.max(C1, C2);
				}
				s++;
				e++;
			}
//			System.out.println("------------");
		}
		return dp[0][wine.length-1];
	}
}
