package Lec_12;

import java.util.Iterator;

public class Spiral_Ques {
	public static void main(String[] args) {
//		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		int[][] arr = { { 1, 2, 3, 4,5 }};
		int min_row = 0;
		int min_col =0;
		int max_row = arr.length-1;
		int max_col =arr[0].length-1;
		int count =0;
		while(count<arr[0].length*arr.length) {
			for(int r1 = min_row;r1<=max_row;r1++) {
				System.out.print(arr[r1][min_col]+ " ");
				count++;
			}
			System.out.println();
			System.out.println("Edge ---");
			
			for(int c1=min_col+1;c1<=max_col&&count<arr[0].length*arr.length;c1++) {
				System.out.print(arr[max_row][c1]+ " ");
				count++;
			}
	
			System.out.println();
			System.out.println("Edge ---");
			
			for(int r2=max_row-1 ;r2>=min_row&&count<arr[0].length*arr.length;r2--) {
				count++;
				System.out.print(arr[r2][max_col]+" ");
			}
	
			System.out.println();
			
			System.out.println("Edge ---");
			for(int c2=max_col-1 ; c2>=min_col+1&&count<arr[0].length*arr.length;c2--) {
				count++;
				System.out.print(arr[min_row][c2]+" ");
			}
			System.out.println();
			System.out.println("Edge ---");
			
			min_row++;
			min_col++;
			max_row--;
			max_col--; 
			
		}

	}
}
