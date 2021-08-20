package Lec_DP;

public class Fibo_ {
	public static void main(String[] args) {
		int n = 1591;
		System.out.println(fib_recTD(n, new int[n + 1]));
		System.out.println(fib_recBU(n));
	}

//	T = O(2^n) S = O(n) 
	public static int fib_rec(int n) {
//		BS 
		if (n <= 1) {
			return n;
		}

//		S.P
		int f1 = fib_rec(n - 1);
		int f2 = fib_rec(n - 2);
//		Self Work
		int bs = f1 + f2;

		return bs;
	}

//	T O(n), S O(n)
	public static int fib_recTD(int n, int[] dp) {
//		BS

		if (n <= 1) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n];
		}

//		S.P
		int f1 = fib_recTD(n - 1, dp);
		int f2 = fib_recTD(n - 2, dp);
//		Self Work
		int bs = f1 + f2;

		dp[n] = bs; // Memorization!!

		return bs;
	}
//O(n) 
	public static int fib_recBU(int n) {
		int[] dp = new int[n+1];
//		Initialize by array!?! 
//		The base cases
		dp[0]=0;
		dp[1]=1;
		
		
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}
	
//	T = O(n) ; S = O(1)
	public static int fib_recBUSE(int n) {
		int[] dp = new int[2];
//		Initialize by array!?! 
//		The base cases
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			int bs = dp[0]+dp[1];
//			Update your array of size 2,
			dp[0]=dp[1];
			dp[1]= bs;
		}
		
		return dp[1];
	}

}
