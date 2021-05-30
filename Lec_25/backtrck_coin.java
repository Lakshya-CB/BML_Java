package Lec_25;

public class backtrck_coin {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 2, 4 };
		// case 2
//		Coin_wrt_user_C2(10, coins, -1, "");
//		Coin_wrt_coin_C2(10, coins, 0, "");

		// case 3
		Coin_wrt_user_C3(7, coins, -1, "");
		System.out.println("--------");
		Coin_wrt_coin_C3(7, coins, 0, true, "");

	}
	// case1 : Infinite coins, distinct Coins, 
	public static void Coin_wrt_coin_comb_C1(int Amount, int[] Coins, int index, String str) {
		if (Amount == 0) { // +ve BC
			System.out.println(str);
			return;
		}
		if (Amount < 0 || index == Coins.length) {
			return;
		}

		Coin_wrt_coin_comb_C1(Amount - Coins[index], Coins, index, str + Coins[index]); // In
		Coin_wrt_coin_comb_C1(Amount, Coins, index + 1, str); // Ex
	}
	// case2 : Finite Coins, distinct Coins

	public static void Coin_wrt_user_C2(int Amount, int[] Coins, int index, String ans) {
		if (Amount == 0) {
			System.err.println(ans);
			return;
		}
		if (Amount < 0) {
			return;
		}

		for (int i = index + 1; i < Coins.length; i++) {
			Coin_wrt_user_C2(Amount - Coins[i], Coins, i, ans + Coins[i]);
		}
	}

	public static void Coin_wrt_coin_C2(int Amount, int[] Coins, int index, String ans) {
		if (Amount == 0) {
			System.out.println(ans);
			return;
		}
		if (Amount < 0 || index == Coins.length) { // -ve BC ??
			return;
		}

		// inc
		Coin_wrt_coin_C2(Amount - Coins[index], Coins, index + 1, ans + Coins[index]);
		// ex
		Coin_wrt_coin_C2(Amount, Coins, index + 1, ans);
	}

	// case 3 : Finite Coins, may or  may bot be distinct Coins , Output combination should be UNIQUE
	public static void Coin_wrt_user_C3(int Amount, int[] Coins, int index, String ans) {
		if (Amount == 0) {
			System.err.println(ans);
			return;
		}
		if (Amount < 0) {
			return;
		}

		for (int i = index + 1; i < Coins.length; i++) {
			if (i >= index + 2 && Coins[i] == Coins[i - 1]) {
				continue;
			}
			Coin_wrt_user_C3(Amount - Coins[i], Coins, i, ans + Coins[i]);

		}
	}

	public static void Coin_wrt_coin_C3(int Amount, int[] Coins, int index, boolean call, String ans) {
		if (Amount == 0) {
			System.out.println(ans);
			return;
		}
		if (Amount < 0 || index == Coins.length) { // -ve BC ??
			return;
		}
		if (call==false && Coins[index] == Coins[index - 1]) {
			// simply exclude 
			Coin_wrt_coin_C3(Amount, Coins, index + 1, false, ans);
		} else {
			// inc
			Coin_wrt_coin_C3(Amount - Coins[index], Coins, index + 1, true, ans + Coins[index]);
			// ex
			Coin_wrt_coin_C3(Amount, Coins, index + 1, false, ans);

		}
	}
}
