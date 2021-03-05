package Lec_10;

public class Kadence_algo {
	public static void main(String[] args) {
		int[] arr  = { 10, 20, -20, 40 };
		int max_sum = Integer.MIN_VALUE;
		int curr_sum = 0;
		for(int i=0;i<arr.length;i++) {
			curr_sum =curr_sum + arr[i];
			if(curr_sum>max_sum) {
				max_sum = curr_sum;
			}
			if(curr_sum<0) {
				curr_sum = 0;
			}
		}
		System.out.println(max_sum);
		
	}

}
