package Lec_31;

public class N_Knights {
	static int count = 0;

	public static void main(String[] args) {
		place_Knight(new boolean[3][3], 0, 0, 0, "");

	}

	public static void place_Knight(boolean[][] board, int row, int col, int total_k, String ans) {
		if (total_k == board.length) {
			System.out.println(++count + " : " + ans);
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}

		if (row == board.length) {
			return;
		}
		if (isSafe(board, row, col)) {
			board[row][col] = true;
			place_Knight(board, row, col + 1, total_k + 1, ans + "{" + row + "," + col + "}");
			board[row][col] = false;
		}
		place_Knight(board, row, col + 1, total_k, ans);

	}

	public static boolean isSafe(boolean[][] board, int row, int col) {
		int[] arr_r = { -1, -2, -2, -1 };
		int[] arr_c = { 2, +1, -1, -2 };
		for (int i = 0; i < 4; i++) {
			int r = row + arr_r[i];
			int c = col + arr_c[i];
			if (r >= 0 && r < board.length && c >= 0 && c < board[0].length) {
				if (board[r][c]) {
					return false;
				}
			}
		}
		return true;
	}
}
