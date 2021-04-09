package Lec_19;

import java.util.ArrayList;
import java.util.Arrays;

public class Rec_type2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 50, 60 };
//		print_rev_arr(arr, 0);
//		System.out.println(First_Occ_of(arr,0,50));
//		System.out.println(Arrays.toString(All_Occ_Of(arr, 99, 0, 0)));
		System.out.println(Subsequence("ab"));
	}

	public static void print_arr(int[] arr, int index) { // BP
		if (index == arr.length) {
			// Base case
			return;
		}
		System.out.println(arr[index]); // element at index
		// SB
		print_arr(arr, index + 1);
	}

	public static void print_rev_arr(int[] arr, int index) { // BP
		if (index == arr.length) {
			// Base case
			return;
		}
		// SB
		print_rev_arr(arr, index + 1);
		System.out.println(arr[index]); // element at index

	}

	public static int arr_max(int[] arr, int i) {
		if (i == arr.length) {
			return Integer.MIN_VALUE;
		}
		int sb = arr_max(arr, i + 1);
		int ans = Math.max(sb, arr[i]);
		return ans;
	}

	public static int First_Occ_of(int[] arr, int i, int item) {
		if (i == arr.length) {
			return -1;
		}
//		int sp = First_Occ_of(arr,i+1,item);
		if (arr[i] == item) {
			return i;
		} 
			return First_Occ_of(arr, i + 1, item);
	}
	public static int Last_Occ_of(int[] arr, int i, int item) {
		if (i == arr.length) {
			return -1;
		}
		int sp = Last_Occ_of(arr, i + 1, item);
		if (arr[i] == item && sp==-1) {
			return i;
		} 
			return sp;
	}
	public static int[] All_Occ_Of(int[] arr, int item,int i,int count) {
		if(i==arr.length) {
			return new int[count];
		}
		
		if(arr[i]==item) { // Case 1
			int[] ans = All_Occ_Of (arr,item,i+1,count+1);
			ans[count] = i;
			return ans;
		}
		else {
			return All_Occ_Of (arr,item,i+1,count);
		}
	}
	
	
	public static  ArrayList<String> Subsequence (String str){
		if (str.isEmpty()) {
			ArrayList<String> All_ss = new ArrayList<>();
			All_ss.add("");
			return All_ss;
		}
		ArrayList<String> prev_ss = Subsequence(str.substring(1)); 
		ArrayList<String> All_ss = new ArrayList<>();
		char ch = str.charAt(0);
		for(String small_ss : prev_ss) {
			All_ss.add(small_ss);
			All_ss.add(ch+small_ss);
			All_ss.add((int)ch+small_ss);
			
			
		}
		return All_ss;
	}
}
