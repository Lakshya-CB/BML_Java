package Lec_37;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_3_Qs {
	static int max_score = 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ttt = scn.nextInt();
		while (ttt-- > 0) {
			max_score = 0;
			int N = scn.nextInt();
			
			int[] arr = new int[N] ;
			for(int i=0;i<N;i++) {
				arr[i]= scn.nextInt();
			}
			game1(arr, 0, arr.length - 1, 0);
			System.out.println(max_score);
//		game(arr, 0, 1);
		}
	}

	public static void game1(int[] arr, int start, int end, int Score) {
		if (Score > max_score) {
			max_score = Score;
		}
		
		if (start == end) {
//			System.out.println(Score);	
			
			
			// We are used to seeing this?!?!?!?
//			if (Score > max_score) {
//				max_score = Score;
//			}
			
			return;
		}

		for (int p_index = start; p_index < end; p_index++) { // from0 to arr.length-2. such that each subArray is
																// non empty
//			System.out.println("asdf");
			int sum1 = sum(arr, start, p_index);
			int sum2 = sum(arr, p_index + 1, end);
			if (sum1 == sum2) {
//				System.out.println(start+" : "+ p_index+" : " + end);
				game1(arr, start, p_index, Score + 1); // sp1
				game1(arr, p_index + 1, end, Score + 1); // sp2
				return;
			}
		}
	}

	public static int sum(int arr[], int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}


// Main of Sorted Array Generate
	
	
//	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int N = scn.nextInt();
//		int M = scn.nextInt();
//
//		int[] arr1 = new int[N];
//		int[] arr2 = new int[M];
//
//		for (int i = 0; i < N; i++) {
//			arr1[i] = scn.nextInt();
//		}
//		
//		for (int i = 0; i < M; i++) {
//			arr2[i] = scn.nextInt();
//		}
//		ArrayList<Integer> Al = new ArrayList<>();
//		game(arr1, arr2, 0, 0, Al, true);
//
//	}

	public static void game(int[] arr1, int[] arr2, int p1, int p2, ArrayList<Integer> ans, boolean flag) {
		if (flag && ans.size() > 1) {
//			System.out.println(ans);
			for (int i = 0; i < ans.size(); i++) {
				System.out.print(ans.get(i) + " ");
			}
			System.out.println();
		}

		if (flag) {
			for (int i = p1; i < arr1.length; i++) {
				// Selected this element from arra 1
				if (isSafe(ans, arr1[i])) {
					ans.add(arr1[i]);
					game(arr1, arr2, i + 1, p2, ans, false);
					ans.remove(ans.size() - 1);
				}
			}
		} else {
			for (int i = p2; i < arr2.length; i++) {
				// Selected this element from arra 2
				if (isSafe(ans, arr2[i])) {
					ans.add(arr2[i]);
					game(arr1, arr2, p1, i + 1, ans, true);
					ans.remove(ans.size() - 1);
				}
			}
		}

	}

	public static boolean isSafe(ArrayList<Integer> ans, int item) {
		if (ans.size() >= 1) {
			return ans.get(ans.size() - 1) < item;
		} else {
			return true;
		}
	}
}


