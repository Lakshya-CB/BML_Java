package QPS_3;

public class K_swaps_Max {
	public static void main(String[] args) {
		String SS = "129814999";
		char[] arr = SS.toCharArray();
//		System.out.println(String.valueOf(arr));
//		System.out.println(new String(arr));
		solve(arr, 4, "");
		System.out.println(ans);
	}

	static Long ans = Long.MIN_VALUE;

	public static void solve(char[] num, int K, String str) {
		String num_string = new String(num);
		long LL = Long.parseLong(num_string);
		ans = Math.max(ans, LL);
//		if (LL == 999984211) {
//			System.out.println(LL + " ---- " + str);
//		}
		
		if (K == 0) {
			return;
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
//					Swap
					Swap(i, j, num);
					solve(num, K - 1, str + "{" + i + "," + j + "}" + " ");

//					BackTrack ?! 
					Swap(j, i, num);
				}
			}
		}
	}

	public static void Swap(int i, int j, char[] arr) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
