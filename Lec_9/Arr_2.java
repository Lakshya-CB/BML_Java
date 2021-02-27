package Lec_9;

import java.util.Scanner;

public class Arr_2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println(takeIn());
//		int[] a = takeIn();
//		disp(takeIn());
//		disp(a);

//		int [] a =  {-1,-234,-1,-3421,-5613};
//		System.out.println(Max(a));
		int [] a =  {1,7,3,5,11,4};
		rev2(a);
		disp(a);

	}
	public static void rev2(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
//			swap
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
	}
	
	
	public static void rev(int[] arr) {
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo<hi) {
//			swap
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}
	public static int Find_in(int[] arr, int num) {
		int ans = -1;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				ans = i;
//				break;
			}
		}
		
		return ans;
	}
	
	
	
	public static int Max(int[] arr) {
//		int max = arr[0];
		int max = Integer.MIN_VALUE;
//		System.out.println(max);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
		
	}
	
	
	public static void disp(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static int[] takeIn() {
		System.out.println("Size bro ?");
		int size = scn.nextInt();

		int[] ans = new int[size];

		for (int i = 0; i < ans.length; i++) {
			ans[i] = scn.nextInt();
		}
		return ans;
	}

}
