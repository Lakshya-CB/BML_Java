package Lec_50;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash_Maps_QPS {
	public static void main(String[] args) {
//		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
//		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
//		intersec_2_arr(arr1, arr2);
		
		int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		Consecutive_Seq(arr);
	}

	public static void intersec_2_arr(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
//			way 1
//			if (map.containsKey(arr1[i])) {
//				map.put(arr1[i], map.get(arr1[i]) + 1);
//			} else {
//				map.put(arr1[i], 1);
//			}

//			way 2

			map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);

		}
		ArrayList<Integer> AL = new ArrayList<>();

		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				AL.add(arr2[i]);
//				Update your map
				map.put(arr2[i], map.get(arr2[i]) - 1);
			}
		}
		System.out.println(AL);
	}

	public static void Consecutive_Seq(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] - 1)) {
//				Never be the starting of the sequence!!
				map.put(arr[i], false);
			} else {
//			arr[i] is the starting of the sequence 
				map.put(arr[i], true);
			}

			if (map.containsKey(arr[i] + 1)) {
				map.put(arr[i] + 1, false);
			}
		}
//		System.out.println(map);
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])) {
//				System.out.println(arr[i]);
				int num = arr[i];
				while(map.containsKey(num)) {
					System.out.print(num + " ");
					num++;
				}
				System.out.println();
			}
		}
		
		
	}
}
