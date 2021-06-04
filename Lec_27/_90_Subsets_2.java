package Lec_27;

import java.util.ArrayList;
import java.util.List;

public class _90_Subsets_2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };
		List<List<Integer>> All_ans = new ArrayList<List<Integer>>();

		subset_wrt_ele(arr, 0, true,new ArrayList<>(), All_ans);
//		subset_wrt_user(arr, 0, new ArrayList<>(), All_ans);
		System.out.println(All_ans);
	}

	public static void subset_wrt_ele(int[] arr, int index, boolean call, List<Integer> ans,
			List<List<Integer>> All_ans) {
		if (index == arr.length) {
//			System.out.println(ans);
			All_ans.add(new ArrayList<>(ans));
			return;
		}

		if (call == false && arr[index] == arr[index - 1]) {
			subset_wrt_ele(arr, index + 1, false, ans, All_ans);

		} else {
			// Ex
			subset_wrt_ele(arr, index + 1, false, ans, All_ans);

			// In
			ans.add(arr[index]);
			subset_wrt_ele(arr, index + 1, true, ans, All_ans);
			ans.remove(ans.size() - 1);
		}
	}

	public static void subset_wrt_user(int[] arr, int index, List<Integer> ans, List<List<Integer>> All_ans) {
//		System.out.println(ans);
		All_ans.add(new ArrayList(ans));
		for (int i = index; i < arr.length; i++) {
			if (i > index && arr[i] == arr[i - 1]) {
				continue;
			}
			ans.add(arr[i]);
			subset_wrt_user(arr, i + 1, ans, All_ans);
			ans.remove(ans.size() - 1);
		}
	}
}
