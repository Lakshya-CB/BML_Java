package Lec_DP;

public class Longest_Comm_subseq {
	public static void main(String[] args) {
//		System.out.println(rec("abcd", "abfd"));
		int[][] dp = new int[40][40];
		for(int i=0;i<40;i++) {
			for(int j=0;j<40;j++) {
			dp[i][j]=-1;
			}
		}
		System.out.println(recTD("aasdfasdffasfasbcd", "AKGLASDGHSALJKDBNASASD",0,0,new int[40][40]));
	}

	public static int rec(String text1, String text2) {
		if (text1.isEmpty() || text2.isEmpty()) {
			return 0;
		}

		if (text1.charAt(0) == text2.charAt(0)) {
			return 1 + rec(text1.substring(1), text2.substring(1));
		} else {
			int sp1 = rec(text1.substring(1), text2);
			int sp2 = rec(text1, text2.substring(1));
			return Math.max(sp1, sp2);
		}
	}

	public static int rec(String text1, String text2, int i1, int i2) {
		if (i1 == text1.length() || i2 == text2.length()) {
			return 0;
		}

		if (text1.charAt(i1) == text2.charAt(i2)) {
			return 1 + rec(text1, text2, i1 + 1, i2 + 1);
		} else {
			int sp1 = rec(text1, text2, i1 + 1, i2);
			int sp2 = rec(text1, text2, i1, i2 + 1);
			return Math.max(sp1, sp2);
		}
	}

	public static int recTD(String text1, String text2, int i1, int i2, int[][] dp) {
		if (i1 == text1.length() || i2 == text2.length()) {
			return 0;
		}
//		This will not work because 0 is a possible answer (10A,10Z)
		if (dp[i1][i2] != -1) {
			return dp[i1][i2];
		}
		
		if (text1.charAt(i1) == text2.charAt(i2)) {
			dp[i1][i2] = 1 + recTD(text1, text2, i1 + 1, i2 + 1,dp);
			return dp[i1][i2];
		} else {
			int sp1 = recTD(text1, text2, i1 + 1, i2,dp);
			int sp2 = recTD(text1, text2, i1, i2 + 1,dp);
			dp[i1][i2]= Math.max(sp1, sp2);
			return dp[i1][i2];
		}
	}

	  public int longestCommonSubsequence(String text1, String text2) {
		  int[][] dp = new int[text2.length()+1][text1.length()+1];
	        for(int r = text2.length()-1;r>=0;r--) {
	        	for(int c = text1.length()-1;c>=0;c--) {
	        		if(text1.charAt(c)==text2.charAt(r)) {
	        			dp[r][c] = 1 + dp[r+1][c+1];
	        		}
	        		else {
	        			dp[r][c] = Math.max(dp[r+1][c], dp[r][c+1]);
	        		}
	        	}
	        }
	        return dp[0][0];
	    }
}
