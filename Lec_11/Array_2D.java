package Lec_11;

public class Array_2D {
	public static void main(String[] args) {
//		int[][] arrn = null;
//		System.out.println(arrn);
//		int [][] arr = new int[3][5];
//		System.out.println(arr);
//		int [] arr1 = new int[3];
//		System.out.println(arr1);

		// rows
//		int [][] arr = new int[300][5];
//		System.out.println(arr.length);
////		Col	
//		System.out.println(arr[0].length);
//		
//		System.out.println("----------");
//		int[] temp=arr[0];
//		System.out.println(temp);
//		System.out.println(arr[0]);
//		System.out.println("----------");
//		temp=arr[1];
//		System.out.println(temp);
//		System.out.println(arr[1]);
//		System.out.println("----------");
//		temp=arr[2];
//		System.out.println(temp);
//		System.out.println(arr[2]);

//		int[][] arr2 = new int[3][]; 
//		System.out.println(arr2);
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr2[2]);
//		arr2[0] = new int [5];
//		arr2[1] = new int [5];
//		arr2[2] = new int [5];
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr2[2]);

		int[][] arr2 = new int[3][5];

//		for (int i = 0; i < arr2.length; i++) {
//			int[] row = arr2[i];
//			for (int j = 0; j < row.length; j++) {
//				System.out.print(row[j] + " ");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//		}
//		for (int row = 0; row < arr2.length; row++) {
//			for (int col = 0; col < arr2[row].length; col++) {
//				arr2[row][col] = col;
//				System.out.print(arr2[row][col] + " ");
//			}
//			System.out.println();
//		}		
//		for(int[] row : arr2) {
////			System.out.println(row);
//			for(int element : row) {
//				System.out.print(element + " ");
//			}
//			System.out.println();
//		}

		int[][] jagg = new int[3][];
//		for(int[] row : jagg) {
//			System.out.println(row);
//		}
		jagg[0] = new int[1];
		jagg[1] = new int[2];
		jagg[2] = new int[3];
		for (int[] row : jagg) {
//			System.out.println(row);
			for (int el : row) {
				System.out.print(el + " ");
			}
			System.out.println();
		}
		
//		int[][] arr4 = {{1,2,3},{4,5,6},{7,8,9}};
//		for (int[] row : arr4) {
////			System.out.println(row);
//			for (int el : row) {
//				System.out.print(el + " ");
//			}
//			System.out.println();
//		}
			
	}
}
