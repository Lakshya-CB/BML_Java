package Lec_10;

public class Inv_arr {
	public static void main(String[] args) {
		int[] arr = { 2 , 4, 3, 1, 0};
		int[] ans = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			ans[arr[i]] = i;
		}
		
		for(int val : arr) {
			System.out.print(val+ " ");
		}
		System.out.println();
		
	}
}
