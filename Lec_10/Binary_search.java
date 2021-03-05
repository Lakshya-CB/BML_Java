package Lec_10;

public class Binary_search {
	public static void main(String[] args) {
		int[] Arr = {5,7,11,12,15,20,31,32,33};
		System.out.println(Arr.length);
		System.out.println(B_search(Arr, 38));
	}
	public static int B_search(int[] arr,int target) {
		int left = 0,right = arr.length -1;
		while(left<=right) {
			System.out.println(left + " : " + right);
			int mid = (left + right)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				left = mid+1;
			}
			else if(arr[mid]>target) {
				right = mid -1;
			}
		}
		return -1;
	}
}
