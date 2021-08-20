package Lec_DP;

import java.util.Arrays;

public class Maze_ {
	public static void main(String[] args) {
		int r = 2;
		int c = 2;
//		System.out.println(rec(0, 0, r, c));
		System.out.println(recTD(0, 0, r, c, new int[r + 1][c + 1]));
		System.out.println(recBU(r, c));
		System.out.println(recBUSE(r,c));
	}

//	T=O(2^(r+c)) , S= O(2^(r+c))
	public static int rec(int cr, int cc, int row, int col) {
		if (cr == row && cc == col) {
			return 1;
		}
		if (cr > row || cc > col) {
			return 0;
		}

		int sp1 = rec(cr + 1, cc, row, col);
		int sp2 = rec(cr, cc + 1, row, col);

		return sp1 + sp2;
	}

//	T = O(r*c) and S = O(r*c)
	public static int recTD(int cr, int cc, int row, int col, int[][] dp) {
		if (cr == row && cc == col) {
			return 1;
		}
		if (cr > row || cc > col) {
			return 0;
		}
		if (dp[cr][cc] != 0) {
			return dp[cr][cc];
		}

		int sp1 = recTD(cr + 1, cc, row, col, dp);
		int sp2 = recTD(cr, cc + 1, row, col, dp);

		dp[cr][cc] = sp1 + sp2; // memory!!

		return sp1 + sp2;
	}

	public static int recBU(int row, int col) {
		int[][] dp = new int[row + 1 + 1][col + 1 + 1];
		for (int r = row; r >= 0; r--) {
			for (int c = col; c >= 0; c--) {
				if (r == row && col == c) {
					dp[r][c] = 1;
				} else {
					dp[r][c] = dp[r + 1][c] + dp[r][c + 1];

				}
			}
		}
		return dp[0][0];
	}
	public static int recBUSE(int row, int col) {
//		Storing each row!! each ro was 0 to col elements +1 boundary
		int[] dp = new int[col+1];
		
		for (int r = row; r >= 0; r--) {
			for (int c = col; c >= 0; c--) {
				if (col == c) {
					dp[c] = 1;
				} else {
					dp[c] = dp[c]+dp[c+1];
				}
			}
			

			System.out.println(Arrays.toString(dp));
		}
		return dp[0];
	}
}
