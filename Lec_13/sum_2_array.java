package Lec_13;

import java.util.ArrayList;

public class sum_2_array {
	public static void main(String[] args) {
		int[] arr1 = {0};
		int[] arr2 = {0};
		System.out.println(solve(arr1, arr2));
	}
	public static ArrayList<Integer> solve(int[] arr1,int[] arr2){
		ArrayList<Integer> ans = new ArrayList<>();
		int p1 = arr1.length-1;
		int p2 = arr2.length-1;
		int carry =0;
		while(p1 >=0 || p2>=0) {
//			int sum = arr1[p1]+arr2[p2]+carry;
			int sum = carry;
			if(p1>=0) {
				sum=sum+arr1[p1];
			}
			if(p2>=0) {
				sum=sum+arr2[p2];
			}
			int digit  =sum%10;
			carry = sum/10;
			ans.add(0,digit);
			p1--;
			p2--;
		}
		if(carry>0) {
			ans.add(0,carry);
		}
		return ans;
	}

}
