package Lec_DP;

public class Wine_problem {
	public static void main(String[] args) {
		int[] wine = {2,3,5,1,4};
//		System.out.println(rec(wine, 0, wine.length-1));
		int[][]dp = new int[wine.length][wine.length];
		System.out.println(rec_TD(wine, 0, wine.length-1, dp));
	}
	public static int rec(int[] wine,int s, int e, int day) {
		if(s==e) {
			return day*wine[s];
		}
		int C1 = rec(wine, s+1, e, day+1) + wine[s]*day;
		int C2 = rec(wine, s, e-1, day+1) + wine[e]*day;
		return Math.max(C1, C2);
	}
	public static int rec(int[] wine,int s, int e) {
//		Day = number of bottles sold +1
//		Bottles sold in from = s and sold at last = (wine.len - (e+1));
		
		
		int day = 1+(s + (wine.length-(e+1)));
		if(s==e) {
			return day*wine[s];
		}
		int C1 = rec(wine, s+1, e, day+1) + wine[s]*day;
		int C2 = rec(wine, s, e-1, day+1) + wine[e]*day;
		return Math.max(C1, C2);
	}
	public static int rec_TD(int[] wine,int s, int e,int[][]dp) {
//		Day = number of bottles sold +1
//		Bottles sold in from = s and sold at last = (wine.len - (e+1));
		int day = 1+(s + (wine.length-(e+1)));
		day = s-e+wine.length;
		if(s==e) {
			return day*wine[s];
		}
		if(dp[s][e]!=0) {
			return dp[s][e];
		}
		int C1 = rec_TD(wine, s+1, e, dp) + wine[s]*day;
		int C2 = rec_TD(wine, s, e-1, dp) + wine[e]*day;
		dp[s][e] = Math.max(C1, C2);
		return Math.max(C1, C2);
	}
}
