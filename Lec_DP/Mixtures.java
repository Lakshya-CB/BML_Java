package Lec_DP;

public class Mixtures {
	public static void main(String[] args) {
		int[] arr = { 40, 60, 20 };
		System.out.println(rec(arr, 0, arr.length-1));
	}

	public static int rec(int[] mix, int s, int e) {
		if (s == e) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for (int chop = s + 1; chop <= e; chop++) {
			int sp_1 = rec(mix, s, chop - 1);
			int sp_2 = rec(mix, chop, e);
			int smoke = color(mix, s, chop - 1) * color(mix, chop, e) + sp_1 + sp_2;
//			System.out.println(smoke);
			ans = Math.min(ans, smoke);
		}
		return ans;
	}

	public static int color(int[] arr, int s, int e) {
		int sum = 0;
		for (int i = s; i <= e; i++) {
			sum = sum + arr[i];
		}
		return sum % 100;
	}
}
