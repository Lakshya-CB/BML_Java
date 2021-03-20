package Lec_13;

import java.util.Scanner;

public class Mat_search {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();
		int[][] arr= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int num = scn.nextInt();
		search(arr, num);
	}
	public static void search(int[][]arr,int num) {
		int x = 0;
		int y = arr[0].length-1;
		while(x<arr.length&& y>=0) {
//			System.out.println(x+ " : "+y);
			
			if(arr[x][y]==num) {
				System.out.println(1);
				return;
			}
			else if (arr[x][y]>num) {
				y--;
			}
			else {
				x++;
			}
		}
		System.out.println(0);
		return;
	}
	
	

}
