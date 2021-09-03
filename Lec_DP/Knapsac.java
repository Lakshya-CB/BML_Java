package Lec_DP;

import java.util.Arrays;
import java.util.Scanner;

public class Knapsac {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int S = scn.nextInt();
		int[] cost = new int[S];
		int[] wt = new int[S];
		for (int i = 0; i < S; i++) {
			cost[i] = scn.nextInt();
		}
		for (int i = 0; i < S; i++) {
			wt[i] = scn.nextInt();
		}
		int cap = scn.nextInt();
		int[][] dp = new int[wt.length][cap + 1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println(rec(wt, cost, 0, cap, dp));
	}

	public static int rec(int[] wt, int[] cost, int idx, int cap) {
		if (idx == wt.length || cap == 0) {
			return 0;
		}
		int sp1 = 0;
		if (cap >= wt[idx]) {
			sp1 = cost[idx] + rec(wt, cost, idx + 1, cap - wt[idx]);
		}
		int sp2 = rec(wt, cost, idx + 1, cap);

		return Math.max(sp1, sp2);
	}

	public static int rec(int[] wt, int[] cost, int idx, int cap, int[][] dp) {
		if (idx == wt.length || cap == 0) {
			return 0;
		}
		if (dp[idx][cap] != -1) {
			return dp[idx][cap];
		}
		int sp1 = 0;
		if (cap >= wt[idx]) {
			sp1 = cost[idx] + rec(wt, cost, idx + 1, cap - wt[idx], dp);
		}
		int sp2 = rec(wt, cost, idx + 1, cap, dp);
		dp[idx][cap] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

		public static int BU(int[] wt, int[] cost, int Initial_cap) {
			int[][] dp = new int[wt.length + 1][Initial_cap + 1];
			for (int idx = wt.length - 1; idx >= 0; idx--) {
				for (int cap = 1; cap <= Initial_cap; cap++) {
	//				Create the solution of dp[idx][cap]
					int sp1 = 0;
					if (cap >= wt[idx]) {
						sp1 = cost[idx] + dp[idx + 1][cap - wt[idx]];
					}
					int sp2 = dp[idx + 1][cap];
					dp[idx][cap] = Math.max(sp1, sp2);
				}
			}
			return dp[0][Initial_cap];
		}

}
