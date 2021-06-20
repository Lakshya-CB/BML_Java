package Lec_30;

import java.util.Scanner;

public class Sudoku {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] arr = new int[9][9];
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		solve(arr, 0, 0);
	}

	public static void disp(int[][] arr) {
		for (int[] a1 : arr) {
			for (int a2 : a1) {
				System.out.print(a2 + " ");
			}
			System.out.println();
		}

	}

	public static void solve(int[][] arr, int row, int col) {

		if (col == arr[0].length) { // to move in the next row
			// way 1
			row++;
			col = 0;
			// way2
//			solve(arr, row+1, 0);
//			return;
		}

		if (row == arr.length) { // +ve BC
			// disply
			System.out.println("--------------------");
			disp(arr);
			System.out.println("--------------------");
			return;
		}

		if (arr[row][col] != 0) { // to skip the digits already present
			solve(arr, row, col + 1);
			return;
		}

		// 9 choices for each box
		for (int i = 1; i <= 9; i++) {
			// condition
			if (isSafe(arr,row,col,i)) {
				arr[row][col] = i; //
				solve(arr, row, col + 1);
				arr[row][col] = 0; //
			}
		}
	}

	public static boolean isSafe(int[][] arr, int row, int col, int num) {
		// Check row
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][col] == num) {
				return false;
			}
		}
		// Check col
		for (int i = 0; i < arr[0].length; i++) {
			if (arr[row][i] == num) {
				return false;
			}
		}
		// check the 3x3 box?
		int box_r = row / 3; // which Row box?
		int box_c = col / 3; // which Col box?
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i + box_r * 3][j + box_c * 3] == num) {
					return false;
				}
			}
		}

		return true;

	}
}
