package Lec_31;

import java.util.ArrayList;
import java.util.Scanner;

public class Sorting_array {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();

		int[] arr1 = new int[N];
		int[] arr2 = new int[M];

		for (int i = 0; i < N; i++) {
			arr1[i] = scn.nextInt();
		}
		
		for (int i = 0; i < M; i++) {
			arr2[i] = scn.nextInt();
		}
		ArrayList<Integer> Al = new ArrayList<>();
		game(arr1, arr2, 0, 0, Al, true);

	}

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
