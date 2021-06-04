package Lec_27;

import java.util.ArrayList;
import java.util.List;

public class _77_Comb {
	public static void main(String[] args) {
		List<List<Integer>> All_ans = new ArrayList<List<Integer>>();

		comb_ele(4, 2, 1, new ArrayList<Integer>(),All_ans);
		System.out.println(All_ans);
//		comb_ele(4, 2, 1, "");
	}

	public static void comb_user(int n, int k, int index, List<Integer> ans, List<List<Integer>> All_ans) {

		// BC +ve
		if (k == 0) {
//			System.out.println(ans);
			All_ans.add(new ArrayList<>(ans));
			return;
		}

		for (int i = index; i <= n; i++) {
			ans.add(i);
			comb_user(n, k - 1, i + 1, ans, All_ans);
			ans.remove(ans.size() - 1);
		}
	}

		public static void comb_ele(int n, int k, int index,  List<Integer> ans, List<List<Integer>> All_ans) {
			if (k == 0) {
				// +ve BC
	//			System.out.println(ans);
				All_ans.add(new ArrayList<>(ans));
				return;
			}
			if (index > n) { // -ve BC
				return;
			}
			// IN
			ans.add(index);
			comb_ele(n, k - 1, index + 1, ans,All_ans);
			ans.remove(ans.size()-1);
			
			// Ex
			comb_ele(n, k, index + 1, ans,All_ans);
	
		}
}
