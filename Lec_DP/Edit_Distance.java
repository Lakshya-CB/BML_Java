package Lec_DP;

import java.util.Arrays;

public class Edit_Distance {
	public static void main(String[] args) {
		String word1 = "horse";
		String word2 = "ros";

//		int[][] dp = new int[word1.length()][word2.length()];
//		for (int i = 0; i < word1.length(); i++) {
////			for(int j=0;i<word2.length();j++) {
////				dp[i][j] = -1;
////			}
//			Arrays.fill(dp[i], -1);
//		}

//		System.out.println(min_rec_2("adfasfctrsdfc", "asdfxchvtresdfghvhgdhbt",0,0));
//		System.out.println(min_rec_2TD(word1, word2, 0, 0, dp));
		BU(word1, word2);
	}

	public int min_rec(String word1, String word2) {
//		A1
//			if (word1.isEmpty() &&! word2.isEmpty()) {
//				return word2.length();
//			}
//			if (!word1.isEmpty() && word2.isEmpty()) {
//				return word1.length();
//			}
//			if(word1.isEmpty() && word2.isEmpty()) {
//				return 0;
//			}
//			A2
		if (word1.isEmpty() || word2.isEmpty()) {
			return Math.max(word1.length(), word2.length());
		}

		if (word1.charAt(0) == word2.charAt(0)) {
			return min_rec(word1.substring(1), word2.substring(1));
		} else {
//			3 cases!! for an operation 
			int I = min_rec(word1, word2.substring(1));
			int D = min_rec(word1.substring(1), word2);
			int R = min_rec(word1.substring(1), word2.substring(1));

			return Math.min(D, Math.min(I, R)) + 1;
		}
	}

	public static int min_rec_2(String word1, String word2, int w1, int w2) {
		if (word1.length() == w1 || word2.length() == w2) {
			return Math.max(word1.length() - w1, word2.length() - w2);
		}

		if (word1.charAt(w1) == word2.charAt(w2)) {
			return min_rec_2(word1, word2, w1 + 1, w2 + 1);
		} else {
//			3 cases!! for an operation 
			int I = min_rec_2(word1, word2, w1, w2 + 1);
			int D = min_rec_2(word1, word2, w1 + 1, w2);
			int R = min_rec_2(word1, word2, w1 + 1, w2 + 1);

			return Math.min(D, Math.min(I, R)) + 1;
		}
	}

	public static int min_rec_2TD(String word1, String word2, int w1, int w2, int[][] dp) {
		if (word1.length() == w1 || word2.length() == w2) {
			return Math.max(word1.length() - w1, word2.length() - w2);
		}
		if (dp[w1][w2] != -1) {
//			Its already stored!! and derived!! 
			return dp[w1][w2];
		}

		if (word1.charAt(w1) == word2.charAt(w2)) {
			dp[w1][w2] = min_rec_2TD(word1, word2, w1 + 1, w2 + 1, dp); // memorized!!
			return dp[w1][w2];
		} else {
//			3 cases!! for an operation 
			int I = min_rec_2TD(word1, word2, w1, w2 + 1, dp);
			int D = min_rec_2TD(word1, word2, w1 + 1, w2, dp);
			int R = min_rec_2TD(word1, word2, w1 + 1, w2 + 1, dp);

			dp[w1][w2] = Math.min(D, Math.min(I, R)) + 1; // memorized!!

			return dp[w1][w2];
		}
	}

	public static int BU(String word1, String word2) {

		int[][] dp = new int[word1.length() + 1][word2.length() + 1];

		for (int w2 = word2.length(); w2 >= 0; w2--) {
			for (int w1 = word1.length(); w1 >= 0; w1--) {
				if (word1.length() == w1 || word2.length() == w2) {
					dp[w1][w2] = Math.max(word1.length() - w1, word2.length() - w2);
				} else {
					if (word1.charAt(w1) == word2.charAt(w2)) {
						dp[w1][w2] = dp[w1 + 1][w2 + 1];
					} else {
//						3 cases!! for an operation 
						int I = dp[w1][w2 + 1];
						int D = dp[w1 + 1][w2];
						int R = dp[w1 + 1][w2 + 1];

						dp[w1][w2] = Math.min(D, Math.min(I, R)) + 1; // memorized!!

					}

				}
			}
		}
//		System.out.println("Asdfasdf");

		for (int[] row : dp) {
			System.out.println(Arrays.toString(row));
		}
		return dp[0][0];
	}

	public static int minDistance(String word1, String word2) {
		int dp[][] = new int[word1.length() + 1][word2.length() + 1];
		return minDistance(word1, word2, dp);
	}

	private static int minDistance(String word1, String word2, int dp[][]) {
		for (int i = word1.length() ; i >= 0; i--) {
			for (int j = word2.length(); j >= 0; j--) {
				if (i == word1.length() || j == word2.length()) {
					dp[i][j] = Math.max(word1.length() - i, word2.length() - j);
				} else if (word1.charAt(i) == word2.charAt(j)) {
					dp[i][j] = dp[i + 1][j + 1];
				} else {
					dp[i][j] = Math.min(dp[i][j + 1], Math.min(dp[i + 1][j], dp[i + 1][j + 1])) + 1;
				}
			}
		}
		for (int[] row : dp) {
			System.out.println(Arrays.toString(row));
		}
		return dp[0][0];
	}

}
