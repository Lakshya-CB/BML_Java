package Lec_13;

import java.util.Arrays;

public class product_except {
	public static void main(String[] args) {
		int[] arr = {200,300,400,500,600};
		meth1(arr);
		meth2(arr);
	}
	public static void meth1(int[] arr) {
//		 create left product 
		int[] left = new int[arr.length];
		left[0]=1;
		for(int i=1;i<arr.length;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
//		System.out.println(Arrays.toString(left));
		int[] right = new int[arr.length];
		right[arr.length-1]=1;
		for(int i=arr.length-2;i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
//		System.out.println(Arrays.toString(right));
		int[] ans = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			ans[i] = left[i]*right[i];
		}
		System.out.println(Arrays.toString(ans));
	}
	public static void meth2(int[] arr) {
//		 create left product 
		long[] left = new long[arr.length];
		left[0]=1;
		for(int i=1;i<arr.length;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		long right_pro = 1;
		for(int i=arr.length-2;i>=0;i--) {
			right_pro = right_pro * arr[i+1];
			left[i] = left[i] *right_pro;
		}
		System.out.println(Arrays.toString(left));
				
	}

}
