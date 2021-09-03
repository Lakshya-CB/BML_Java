package Lec_DP;

import java.util.Arrays;

public class LIS {
	public static void main(String[] args) {
		int nums[] = { 0, 1, 4, 2, 5, 1, 6, 8 };
		int[][] dp = new int[nums.length][nums.length + 1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println(rec(nums, 0, -1, dp));
	}

	public static int rec(int[] nums, int idx, int prev, int[][] dp) {
		if (idx == nums.length) {
			return 0;
		}
		if (dp[idx][prev + 1] != -1) {
			return dp[idx][prev + 1];
		}
		int sp1 = 0;
		if (prev == -1 || nums[prev] < nums[idx]) {
			sp1 = 1 + rec(nums, idx + 1, idx, dp);
		}
		int sp2 = rec(nums, idx + 1, prev, dp);
		dp[idx][prev + 1] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public static int BU(int[] nums) {
		int[][] dp = new int[nums.length + 1][nums.length + 1];
		for (int idx = nums.length - 1; idx >= 0; idx--) {
			for (int prev = nums.length - 1; prev >= -1; prev--) {
//				Create dp[idx][prev+1]

				int sp1 = 0;
				if (prev == -1 || nums[prev] < nums[idx]) {
					sp1 = 1 + dp[idx + 1][idx + 1];
				}
				int sp2 = dp[idx + 1][prev+1];
				dp[idx][prev + 1] = Math.max(sp1, sp2);
			}
		}
		return dp[0][-1+1];
	}
}
