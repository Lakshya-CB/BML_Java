package Lec_DP;

import java.util.Arrays;

public class House_Robbersss {
	public static void main(String[] args) {
		int[] nums = {1,2,1,5,1};
		int[]dp = new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(robTD(0,nums,dp));
	}

	public int rob(int idx, int[] nums) {
		if (idx == nums.length) {
			return 0;
		}
		int sp1 = nums[idx] + rob(idx + 2, nums);
		int sp2 = rob(idx + 1, nums);

		return Math.max(sp1, sp2);
	}
	public static int robTD(int idx, int[] nums,int[] dp) {
		if (idx >= nums.length) {
			return 0;
		}
		if(dp[idx]!=-1) {
			return dp[idx];
		}
		int sp1 = nums[idx] + robTD(idx + 2, nums,dp);
		int sp2 = robTD(idx + 1, nums,dp);
		dp[idx] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}
	public static int BU(int[] nums) {

		int[]dp = new int[nums.length+2];
		for(int idx = nums.length-1;idx>=0;idx--) {
//			Create the solution of dp[idx]
			int sp1 = nums[idx] + dp[idx + 2];
			int sp2 = dp[idx + 1];
			dp[idx] = Math.max(sp1, sp2);
		}
		return dp[0];
	}
	public static int BU_2(int[] nums) {
// Case 1: exclude house 1
		int[]dp = new int[nums.length+2];
		for(int idx = nums.length-1;idx>=1;idx--) {
//			Create the solution of dp[idx]
			int sp1 = nums[idx] + dp[idx + 2];
			int sp2 = dp[idx + 1];
			dp[idx] = Math.max(sp1, sp2);
		}
		int C1 = dp[1];
//		Case 2 :
		dp = new int[nums.length+2];
		for(int idx = nums.length-2;idx>=0;idx--) {
//			Create the solution of dp[idx]
			int sp1 = nums[idx] + dp[idx + 2];
			int sp2 = dp[idx + 1];
			dp[idx] = Math.max(sp1, sp2);
		}
		int C2 = dp[0];
		
		return Math.max(C1, C2);
	}
}
