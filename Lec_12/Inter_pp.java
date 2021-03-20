package Lec_12;

import java.util.ArrayList;

public class Inter_pp {
	public static void main(String[] args) {
		int [] arr1 = {10,10,20,30,35,35,40,50,60,120,130};
		int [] arr2 = {20,32,35,50,55,64,70};
		System.out.println(inter(arr1, arr2));
		
	}
	public static ArrayList<Integer> inter(int[] arr1,int[] arr2){
		ArrayList<Integer> ans = new ArrayList<>();
//		Logic
		int p1 = 0;
		int p2 = 0;
		while(p1<arr1.length && p2<arr2.length) {
			if(arr1[p1]==arr2[p2]) {
//				System.out.print(arr1[p1]+ " ");
				ans.add(arr1[p1]);
				p1++;
				p2++;
			}
			else if(arr1[p1]>arr2[p2]) {
				p2++;
			}
			else {
				p1++;
			}	
		}
		return ans;
	}
}
