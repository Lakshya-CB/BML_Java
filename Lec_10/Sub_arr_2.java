package Lec_10;

public class Sub_arr_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, -20, 40 };
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int sum =0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
//				System.out.println(sum);
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
	}

}
