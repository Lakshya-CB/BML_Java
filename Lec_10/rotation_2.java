package Lec_10;

public class rotation_2 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80};
		int rot = 3;
		disp(arr);
		//		 Step_1 ;
		swap_2(arr.length-rot, arr.length-1, arr);
		disp(arr);
		//		 Step 2 ;
		swap_2(0, arr.length-1-rot, arr);
		disp(arr);
		//		Step 3 ;
		swap_2(0, arr.length-1, arr);
		disp(arr);
		
		
		
	}
	public static void swap_2(int left, int right, int[] arr) {
		while(left<right) {
//			 swap
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
	}
	public static void disp(int[] arr) {
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
