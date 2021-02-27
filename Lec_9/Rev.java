package Lec_9;

public class Rev {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80};
		int rot1 = 8000000;

		rot1=rot1%arr.length;
		if(rot1<0) {
			rot1 = rot1+arr.length;
		}
		for(int i=1;i<=rot1;i++) {
			rot(arr);
		}
		disp(arr);
		
	}
	public static void rot(int[] arr) {
		int last = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = last;
	}
	public static void disp(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
