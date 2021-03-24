package Lec_14;

import java.util.Arrays;
import java.util.Scanner;

public class Rain_water {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] wall = new int[size];
		for (int i = 0; i < size; i++) {
			wall[i] = scn.nextInt();
		}

//		int[] left_wall = new int[size];
//		for (int i = 1; i < size; i++) {
//			int max = 0;
//			for (int j = 0; j <= i - 1; j++) {
//				max = Math.max(max, wall[j]);
//			}
//			left_wall[i] = max;
//		}
//		System.out.println(Arrays.toString(left_wall));
		
		int [] left_wall = new int[size];
		for (int i = 1; i < size; i++) {
			left_wall[i] = Math.max(left_wall[i - 1], wall[i - 1]);
		}
		
		System.out.println(Arrays.toString(left_wall));
		int [] right_wall = new int[size];
		for (int i = size-2; i >=0 ; i--) {
			right_wall[i] = Math.max(right_wall[i + 1], wall[i + 1]);
		}
		System.out.println(Arrays.toString(right_wall));
		
		int [] water_level = new int[size];
		for (int i = 0; i <size ; i++) {
			water_level[i] = Math.min(right_wall[i], left_wall[i])-wall[i];
			water_level[i] = Math.max(water_level[i],0);
		}
		System.out.println(Arrays.toString(water_level));
		
	}
}
