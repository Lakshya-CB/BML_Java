package Lec_12;

public class wave_print {
	public static void main(String[] args) {
		int[][] arr = {{11,12,13,14} ,{21 ,22 ,23, 24}, {31, 32 ,33 ,34} ,{41 ,42, 43, 44}};
		for (int col=0;col<arr[0].length;col++) {
			for(int row =0;row<arr.length;row++) {
				int col_to_print = col;
				if (col%2!=0) {
//					??
					col_to_print = arr[0].length-1-col;
				}
				System.out.print(arr[row][col_to_print]+ " ");
			}
			System.out.println();
		}
	}
}
