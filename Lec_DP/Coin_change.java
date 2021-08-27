package Lec_DP;

import java.util.Scanner;

public class Coin_change {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int S = scn.nextInt();
		int[] arr = new int[S];
		for (int i = 0; i < S; i++) {
			arr[i] = scn.nextInt();
		}
//		int[][] dp = new int[S][A + 1];

//		System.out.println(coinChange_TD(arr, 0, A, "", dp));
		System.out.println(BU(arr, A));
	}

	public static int coinChange(int coins[], int index, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return 1;
		}
		if (amount < 0 || index == coins.length) {
			return 0;
		}

		int sp1 = coinChange(coins, index, amount - coins[index], ans + " " + coins[index]);
		int sp2 = coinChange(coins, index + 1, amount, ans);

		return sp1 + sp2;
	}

	public static int coinChange_TD(int coins[], int index, int amount, String ans, int[][] dp) {
		if (amount == 0) {
//			System.out.println(ans);
			return 1;
		}
		if (amount < 0 || index == coins.length) {
			return 0;
		}
		if (dp[index][amount] != 0) {
			return dp[index][amount];
		}

		int sp1 = coinChange_TD(coins, index, amount - coins[index], ans + " " + coins[index], dp);
		int sp2 = coinChange_TD(coins, index + 1, amount, ans, dp);

		dp[index][amount] = sp1 + sp2;

		return sp1 + sp2;
	}

	public static int BU(int[] coins, int amount) {
		int[][] dp = new int[coins.length][amount + 1];
		for(int idx = coins.length-1;idx>=0;idx--) {
			for(int A = 0;A<=amount;A++) {
				if(A==0) {
					dp[idx][A] =1;
				}
				else {
					int sp1 = 0;
					if(A-coins[idx]>=0) {
						sp1 = dp[idx][A-coins[idx]];
					}
					int sp2 = 0;
					if(idx+1<coins.length) {
						sp2 = dp[idx+1][A];
					}
					dp[idx][A] = sp1 + sp2;
				}
			}
		}
		return dp[0][amount];
	}
}
