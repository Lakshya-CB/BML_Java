package Lec_10;

public class Sub_arr_1 {
	public static void main(String[] args) {
		int[] arr =  {10,20,30,40};
		for(int i=0;i<arr.length; i++) {
			for(int j=i;j<arr.length;j++) {
//				System.out.println(i + " : " + j);
//				int sum =0;
				for(int curr = i;curr<=j;curr++) {
					System.out.print(arr[curr] + " ");
//					sum= sum + arr[curr];
				}
				System.out.println();
//				System.out.println(sum);
			}
			
		}
	}
}
