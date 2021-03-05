package Lec_10;

public class Bar_graph_p {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 6, 1 };
		int max = max_element(arr);
		for (int row = 0; row < max; row++) {
			for (int i = 0; i < arr.length; i++) {
				if(max-row<= arr[i]) {
					System.out.print("| ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static int max_element(int[] arr) {
//		int max = Integer.MIN_VALUE;
		int max = arr[0];

		for (int val : arr) {
			if (val > max) {
				max = val;
			}
		}
		return max;
	}
}
