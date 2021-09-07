package Lec_DP;

import java.util.Arrays;

public class Matrix_Mult {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 5, 1 ,1,5,1,62,37,1,296,1,6,3,1,89,4};
		Integer[][] dp = new Integer[arr.length][arr.length];

		System.out.println(rec(arr, 0, arr.length - 1, dp));
		System.out.println(BU(arr));
	}

	public static int rec(int[] arr, int s, int e, Integer[][] dp) {
		if (e == s + 1) {
			return 0;
		}
		if (dp[s][e] != null) {
			return dp[s][e];
		}
		int ans = Integer.MAX_VALUE;
		for (int chop = s + 1; chop <= e - 1; chop++) {
			int sp_part_1 = rec(arr, s, chop, dp);
			int sp_part_2 = rec(arr, chop, e, dp);

			int mult = arr[s] * arr[e] * arr[chop] + sp_part_1 + sp_part_2;
			ans = Math.min(ans, mult);
		}
		dp[s][e] = ans;
		return ans;
	}

	public static int BU(int[] arr) {
		Integer[][] dp = new Integer[arr.length][arr.length];
		for (int s = arr.length - 1; s >= 0; s--) {
			for (int e = 0; e < arr.length; e++) {
//				Create solution of dp[s][e]
				if (e <= s + 1) {
					dp[s][e] = 0;
				} else {
					int ans = Integer.MAX_VALUE;
					for (int chop = s + 1; chop <= e - 1; chop++) {
						int sp_part_1 = dp[s][chop];
						int sp_part_2 = dp[chop][e];

						int mult = arr[s] * arr[e] * arr[chop] + sp_part_1 + sp_part_2;
						ans = Math.min(ans, mult);
					}
					dp[s][e] = ans;
				}
			}
		}
		return dp[0][arr.length - 1];
	}
}
