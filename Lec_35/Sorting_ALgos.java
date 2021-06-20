package Lec_35;

import java.util.Arrays;

public class Sorting_ALgos {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 4, 15, 25, 665 };
//		System.out.println(Arrays.toString(combine(arr1, arr2)));
		int[] rn = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
//		System.out.println(Arrays.toString(Merge_sort(rn, 0, rn.length - 1)));
		Quick_sort(rn, 0, rn.length - 1);
		System.out.println(Arrays.toString(rn));

	}

	public static int[] Merge_sort(int[] arr, int start, int end) {
		if (start == end) {
			int[] sp = new int[1];
			sp[0] = arr[start];
			return sp;
		}
		int mid = (start + end) / 2;
		int[] sp1 = Merge_sort(arr, start, mid);
		int[] sp2 = Merge_sort(arr, mid + 1, end);

		return combine(sp1, sp2);
	}

	public static int[] combine(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int p1 = 0;
		int p2 = 0;
		int ans_p = 0;
		while (p1 < arr1.length && p2 < arr2.length) {
			if (arr1[p1] < arr2[p2]) {
				ans[ans_p] = arr1[p1];
				ans_p++;
				p1++;
			} else {
				ans[ans_p] = arr2[p2];
				ans_p++;
				p2++;
			}
		}
		while (p1 < arr1.length) {
			ans[ans_p] = arr1[p1];
			ans_p++;
			p1++;
		}
		while (p2 < arr2.length) {
			ans[ans_p] = arr2[p2];
			ans_p++;
			p2++;
		}
		return ans;

	}

	public static void Quick_sort(int[] arr, int low, int high) {
//		{50,40,60,30,70,80,90,80,120};
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		int piv = arr[mid];
		int left = low;
		int right = high;
		while (left <= right) {
			// find left
			while (arr[left] < piv) {
				left++;
			}

			// find right
			while (arr[right] > piv) {
				right--;
			}

			// Swap ;
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		Quick_sort(arr, low, right);
		Quick_sort(arr, left, high);

	}
}
