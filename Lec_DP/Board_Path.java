package Lec_DP;

public class Board_Path {
	public static void main(String[] args) {
//		System.out.println(num_Path(0,30));
		int end = 3000;
		System.out.println(num_Path_TD(0,end,new int[end+5]));
		System.out.println(num_Path_BU(end));
	}
//	O(6^n) S=O(6^n)
	public static int num_Path(int Curr, int end) {
//		BS
		if(Curr>end) {
			return 0;
		}
		if(Curr==end) {
			return 1;
		}
//		S.P and Self work
		int bs=0;
		for(int i=1;i<=6;i++) {
			bs=bs+num_Path(Curr+i, end);
		}
		return bs;
	}
	public static int num_Path_TD(int Curr, int end,int[] dp) {
//		BS
		if(Curr>end) {
			return 0;
		}
		if(Curr==end) {
			return 1;
		}
		if(dp[Curr]!=0) {
			return dp[Curr];
		}
//		S.P and Self work
		int bs=0;
		for(int i=1;i<=6;i++) {
			bs=bs+num_Path_TD(Curr+i, end,dp);
		}
		
		dp[Curr] =bs;//memorization
		
		return bs;
	}

	public static int num_Path_BU(int end) {
		int[] dp = new int[end+6];
		
//		Initializing array
		dp[end]=1;
		
//		Fill our array from some index to 0
		for(int i=end-1;i>=0;i--) {
			dp[i]= dp[i+1]+dp[i+2]+dp[i+3]+dp[i+4]+dp[i+5]+dp[i+6];
		}
		return dp[0];
	}
}
