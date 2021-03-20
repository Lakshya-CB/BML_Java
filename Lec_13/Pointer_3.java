package Lec_13;

import java.util.Arrays;
import java.util.Scanner;

public class Pointer_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int[] arr = new int[row];
		for (int i = 0; i < row; i++) {
			arr[i] = scn.nextInt();
		}
//		meth(arr);
//		for (int val : arr) {
//			System.out.print(val + " ");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	public static void meth(int[] arr) {
		int low = 0;
		int mid = 0;
		int hi = arr.length - 1;
		while (mid <= hi) {
			if (arr[mid] == 0) {
//				 swap mid with lo
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;

				mid++;
				low++;
			} else if (arr[mid] == 2) {
//				 put that 2 on the right 
				int temp = arr[hi];
				arr[hi] = arr[mid];
				arr[mid] = temp;

				hi--;
			} else {
				mid++;
			}
		}
	}
}
