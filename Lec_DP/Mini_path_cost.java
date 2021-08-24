package Lec_DP;

import java.util.Arrays;

public class Mini_path_cost {
	public static void main(String[] args) {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		minPathSum_BUSE(grid);
//				[[1,2,3],[4,5,6]]
	}

	public int minPathSum_rec(int x, int y, int[][] grid) {
//		+ve BS?!
		if (x == grid.length || y == grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if (x == grid.length - 1 && y == grid[0].length - 1) {
			return grid[x][y];
		}
//		SP?!!
		int c1 = minPathSum_rec(x + 1, y, grid);
		int c2 = minPathSum_rec(x, y + 1, grid);

		return grid[x][y] + Math.min(c1, c2);
	}

	public int minPathSum_TD(int x, int y, int[][] grid, int[][] dp) {
//		+ve BS?!
		if (x == grid.length || y == grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if (x == grid.length - 1 && y == grid[0].length - 1) {
			return grid[x][y];
		}
		if (dp[x][y] != 0) {
			return dp[x][y];
		}

//		SP?!!
		int c1 = minPathSum_TD(x + 1, y, grid, dp);
		int c2 = minPathSum_TD(x, y + 1, grid, dp);

		dp[x][y] = grid[x][y] + Math.min(c1, c2);

		return dp[x][y];
	}

	public int minPathSum_BU(int[][] grid) {
		int[][] dp = new int[grid.length + 1][grid[0].length + 1];
//		handle the BC or initialize your dp array!!
		for (int r = 0; r < grid.length + 1; r++) {
			dp[r][grid[0].length] = Integer.MAX_VALUE;
		}
		for (int c = 0; c < grid[0].length + 1; c++) {
			dp[grid.length][c] = Integer.MAX_VALUE;
		}

		for (int c = grid[0].length - 1; c >= 0; c--) {
			for (int r = grid.length - 1; r >= 0; r--) {
				if (c == grid[0].length - 1 && r == grid.length - 1) {
					dp[r][c] = grid[r][c];
				} else {
					dp[r][c] = grid[r][c] + Math.min(dp[r + 1][c], dp[r][c + 1]);
				}
			}
		}
		return dp[0][0];

	}

	public static int minPathSum_BUSE(int[][] grid) {
		int[] dp = new int[grid.length + 1];
//		handle the BC or initialize your dp array!!
		for (int i = 0; i < grid.length + 1; i++) {
			dp[i] = Integer.MAX_VALUE;
		}

		for (int c = grid[0].length - 1; c >= 0; c--) {
			for (int r = grid.length - 1; r >= 0; r--) {
				if (c == grid[0].length - 1 && r == grid.length - 1) {
					dp[r] = grid[r][c];
				} else {
					dp[r] = grid[r][c] + Math.min(dp[r], dp[r + 1]);
				}
			}
			System.out.println(Arrays.toString(dp));
		}
		return dp[0];
	}
}
