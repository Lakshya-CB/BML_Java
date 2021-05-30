package Lec_23_24;

public class back_tracking {
	static int count = 0;

	public static void main(String[] args) {
//		Queen_perm(2, 0, new boolean[4], "");
//		Queen_comb(2, 0, new boolean[4], "", -1);
//		int[] coins = {2,3,5,6};
//		coin_comb_wrt_user(10,coins, 0, "");
//		coin_perm_wrt_user(10,coins, "");
////		Queen_comb_wrt_box(2, 0, "", 0, 4);
//		System.out.println("---------");
//		coin_comb_wrt_coin(10, coins, 0, "");

//		Queen_comb_2D(new boolean[2][2], 0, 0, 0, 2, "");
	
		Queen_2D_Kill_Chess(new boolean[4][3], 0, 0, 0, 3, "");
	}

	public static void Queen_perm(int total_queens, int curr_queen, boolean[] board, String ans) {
		// base case??
		if (curr_queen == total_queens) {
			count++;
			System.out.println(count + " : " + ans);

			return;
		}

		for (int i = 0; i < board.length; i++) {
//			empty seat , Queen Sit
			if (board[i] == false) {
				// Queen Sits
				board[i] = true; // Prep to reach your food stall ?? restaurant
				Queen_perm(total_queens, curr_queen + 1, board, ans + "q" + curr_queen + "b" + i);
				board[i] = false;// undo??? Backtracking??
			}
		}
	}

	public static void Queen_comb(int total_queens, int curr_queen, boolean[] board, String ans, int last_loc_queen) {
		// base case??
		if (curr_queen == total_queens) {
			count++;
			System.out.println(count + " : " + ans);
			return;
		}
		for (int i = last_loc_queen + 1; i < board.length; i++) {
//			empty seat , Queen Sit
			// Queen Sits
			board[i] = true; // Prep to reach your food stall ?? restaurant
			Queen_comb(total_queens, curr_queen + 1, board, ans + "q" + curr_queen + "b" + i, i);
			System.out.println();
			board[i] = false;// undo??? Backtracking??
		}
	}

	public static void coin_perm_wrt_user(int amount, int[] coins, String ans) {

		if (amount < 0) {// -ve case
			return;
		}

		if (amount == 0) {// +ve case
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < coins.length; i++) {
			coin_perm_wrt_user(amount - coins[i], coins, ans + coins[i]);
		}
	}

	public static void Queen_comb_wrt_box(int total_Queens, int curr_queens, String ans, int curr_box,
			int total_boxes) {
		if (total_Queens == curr_queens) {// pos BC
			System.out.println(ans);
			return;
		}
		if (curr_box == total_boxes) {// -ve BC
			return;
		}

		// Select Queen
		Queen_comb_wrt_box(total_Queens, curr_queens + 1, ans + "b" + curr_box, curr_box + 1, total_boxes);
		// Dont select Queen
		Queen_comb_wrt_box(total_Queens, curr_queens, ans, curr_box + 1, total_boxes);

	}

	public static void coin_comb_wrt_coin(int amount, int[] Coins, int i_coin, String ans) {
		if (amount == 0) { // +ve BC
			System.out.println(ans);
			return;
		}
		if (amount < 0 || i_coin == Coins.length) { // -ve BC
			return;
		}
		coin_comb_wrt_coin(amount - Coins[i_coin], Coins, i_coin + 1, ans + Coins[i_coin]); // selected your coin
		coin_comb_wrt_coin(amount, Coins, i_coin + 1, ans); // dont selected your coin
	}

	public static void coin_comb_wrt_user(int amount, int[] coins, int index, String ans) {
		if (amount == 0) {// +ve case
			System.out.println(ans);
			return;
		}

		if (amount < 0) {// -ve case
			return;
		}
		for (int i = index; i < coins.length; i++) {
			coin_comb_wrt_user(amount - coins[i], coins, i, ans + coins[i]);
		}
	}

	public static void Queen_comb_2D(boolean[][] board, int box_r, int box_c, int curr_Q, int total_Q, String ans) {

		if (curr_Q == total_Q) {// Pos BS
			System.out.println(ans);
			return;
		}
		// To move right or in the Col directon
		if (box_c == board[0].length) {
			// Way1
//			box_c=0;
//			box_r++;
			// Way2
			Queen_comb_2D(board, box_r + 1, box_c = 0, curr_Q, total_Q, ans);
			return;
		}
		// -ve BC
		if (box_r == board.length) {
			return;
		}

		// Palce the queen

		board[box_r][box_c] = true;
		Queen_comb_2D(board, box_r, box_c + 1, curr_Q + 1, total_Q, ans + "(" + box_r + "," + box_c + ")");
		board[box_r][box_c] = false;

		// Dont place the queen
		Queen_comb_2D(board, box_r, box_c + 1, curr_Q, total_Q, ans);

	}

	public static void Queen_2D_Kill_Chess(boolean[][] board, int box_r, int box_c, int curr_Q, int total_Q,
			String ans) {

		if (curr_Q == total_Q) {// Pos BS
			System.out.println(ans);
			return;
		}
		// To move right or in the Col directon
		if (box_c == board[0].length) {
			// Way1
//			box_c=0;
//			box_r++;
			// Way2
			Queen_2D_Kill_Chess(board, box_r + 1, 0, curr_Q, total_Q, ans);
			return;
		}
		// -ve BC
		if (box_r == board.length) {
			return;
		}

		// Palce the queen
//		System.out.println(isSafeQueen(board, box_r, box_c) + "(" + box_r + "," + box_c + ")" );
		if (isSafeQueen(board, box_r, box_c)) {
			board[box_r][box_c] = true;
			Queen_2D_Kill_Chess(board, box_r, box_c + 1, curr_Q + 1, total_Q, ans + "(" + box_r + "," + box_c + ")");
			board[box_r][box_c] = false;
		}

		// Dont place the queen
		Queen_2D_Kill_Chess(board, box_r, box_c + 1, curr_Q, total_Q, ans);
	}

	public static boolean isSafeQueen(boolean[][] board, int row, int col) {
		// up
		for (int i = 0; i < row; i++) {
			if (board[i][col]) {
				return false;
			}
		}
		// left
		for (int j = 0; j < col; j++) {
			if (board[row][j]) {
				return false;
			}
		}
		// diagonal left

		int r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		// diagonal right

		r = row;
		c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;

		}

		return true;
	}
}
