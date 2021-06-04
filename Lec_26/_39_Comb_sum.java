package Lec_26;

import java.util.ArrayList;
import java.util.List;

public class _39_Comb_sum {
	public static void main(String[] args) {
		int[] coins = {2,3,6,7};
//		List<String>All_ans = new ArrayList<>();
//		coin_comb_wrt_user_c1(4, coins, 0, "", All_ans);
		List<List<Integer>>All_ans = new ArrayList<List<Integer>>();
		coin_comb_wrt_coin(7, coins, 0, new ArrayList<>(), All_ans);
		System.out.println(All_ans);

	}

//	public static void coin_comb_wrt_user_c1(int amount, int[] coins, int index, String ans,List<String> All_ans) {
//		if (amount == 0) {// +ve case
////			System.out.println(ans);
//			All_ans.add(ans);
//			return;
//		}
//
//		if (amount < 0) {// -ve case
//			return;
//		}
//		for (int i = index; i < coins.length; i++) {
//			
//			coin_comb_wrt_user_c1(amount - coins[i], coins, i, ans + coins[i],All_ans);
//			
//		}
//	}
//	public static void coin_comb_wrt_user_c1(int amount, int[] coins, int index, List<Integer> ans,List<List<Integer>> All_ans) {
//		if (amount == 0) {// +ve case
//			System.out.println(ans);
//			All_ans.add(new ArrayList<>(ans));
//			return;
//		}
//
//		if (amount < 0) {// -ve case
//			return;
//		}
//		for (int i = index; i < coins.length; i++) {
//			ans.add(coins[i]);
//			coin_comb_wrt_user_c1(amount - coins[i], coins, i,ans,All_ans);
//			ans.remove(ans.size()-1);
//		}
//	}
	
	public static void coin_comb_wrt_coin(int amount, int[] Coins, int i_coin,  List<Integer> ans,List<List<Integer>> All_ans) {
		if (amount == 0) { // +ve BC
//			System.out.println(ans);
			All_ans.add(new ArrayList<>(ans));
			return;
		}
		if (amount < 0 || i_coin == Coins.length) { // -ve BC
			return;
		}
		// selected my coin
		
		ans.add(Coins[i_coin]);
		coin_comb_wrt_coin(amount - Coins[i_coin], Coins, i_coin , ans,All_ans); // selected your coin
		// undo my coin
		ans.remove(ans.size()-1);
		
		coin_comb_wrt_coin(amount, Coins, i_coin + 1, ans,All_ans); // dont selected your coin
		
		
	}
}
