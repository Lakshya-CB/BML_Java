package Lec_31;

import java.util.Scanner;

public class Vivek_arr {
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
			game(arr, 0, arr.length - 1, 0);
			System.out.println(max_score);
//		game(arr, 0, 1);
		}
	}

	public static void game(int[] arr, int start, int end, int Score) {
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
				game(arr, start, p_index, Score + 1); // sp1
				game(arr, p_index + 1, end, Score + 1); // sp2
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
}
