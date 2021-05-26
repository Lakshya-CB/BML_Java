package Lec_23;

public class back_tracking {
	static int count = 0;

	public static void main(String[] args) {
//		Queen_perm(2, 0, new boolean[4], "");
//		Queen_comb(2, 0, new boolean[4], "", -1);
		int[] coins = {2,3,5,6};
//		coin_comb(10,coins, 0, "");
//		coin_perm(10,coins, "");
		Queen_comb_wrt_box(2, 0, "", 0, 4);
		
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
	
	public static void coin_comb(int amount, int[] coins,int index,String ans) {
		if(amount==0) {// +ve case
			System.out.println(ans);
			return;
		}
		
		if(amount<0) {// -ve case 
			return;
		}
		for(int i=index;i<coins.length;i++) {
			coin_comb(amount-coins[i], coins, i,ans+coins[i]);
		}
	}
	public static void coin_perm(int amount, int[] coins,String ans) {
		
		if(amount<0) {// -ve case 
			return;
		}
		
		if(amount==0) {// +ve case
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<coins.length;i++) {
			coin_perm(amount-coins[i], coins, ans+coins[i]);
		}
	}
	
	public static void Queen_comb_wrt_box(int total_Queens , int curr_queens,String ans,int curr_box,int total_boxes) {
		if(total_Queens==curr_queens) {//pos BC
			System.out.println(ans);
			return;
		}
		if(curr_box==total_boxes) {// -ve BC
			return;
		}
		
		// Select Queen
		Queen_comb_wrt_box(total_Queens, curr_queens+1, ans+"b"+curr_box, curr_box+1, total_boxes);
		// Dont select Queen
		Queen_comb_wrt_box(total_Queens, curr_queens, ans, curr_box+1, total_boxes);
		
		
	}
}

