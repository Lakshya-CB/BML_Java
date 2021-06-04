package Lec_27;

import java.util.ArrayList;
import java.util.List;

public class _78_subsets {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };
		List<List<Integer>> All_ans = new ArrayList<List<Integer>>();
//		subset_wrt_ele(arr, 0, "");
//		subset_wrt_ele(arr, 0, new ArrayList<>(), All_ans);
		subset_wrt_user(arr, 0,new ArrayList<>(), All_ans);
		System.out.println(All_ans);
	}

	public static void subset_wrt_ele(int[] arr, int index, List<Integer> ans, List<List<Integer>> All_ans) {
		if (index == arr.length) {
//			System.out.println(ans);
			All_ans.add(new ArrayList<>(ans));
			return;
		}

		// Ex
		subset_wrt_ele(arr, index + 1, ans,All_ans);
		// In
		ans.add(arr[index]);
		subset_wrt_ele(arr, index + 1, ans,All_ans );
		ans.remove(ans.size()-1);
	}
	
	public static void subset_wrt_user(int[] arr, int index,List<Integer> ans, List<List<Integer>> All_ans) {
//		System.out.println(ans);
		All_ans.add(new ArrayList(ans));
		for(int i = index ; i <arr.length;i++) {
			ans.add(arr[i]);
			subset_wrt_user(arr, i+1, ans,All_ans);
			ans.remove(ans.size()-1);
		}
	}
}
