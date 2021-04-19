package Lec_21;

public class Rec_4_print {
	public static void main(String[] args) {
//		print_SubSeq("abc", "");
//		perm_print("abc", "");
//		CT_print(21, "");
		Climb_s_print(0, 5, "");
	}

	public static void Climb_s_print(int curr_lvl, int dest, String ans) {
		if (dest == curr_lvl) {
			System.out.println(ans);
			return;
		}
//		if(curr_lvl>dest) {
//			return;
//		}
		for (int jump = 1; jump <= 3 && curr_lvl + jump <=dest; jump++) {
			Climb_s_print(curr_lvl + jump, dest, ans + jump);
		}
	}

	public static void CT_print(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);

			return;
		}
		CT_print(n - 1, ans + 'H');
		CT_print(n - 1, ans + 'T');

	}

	public static void perm_print(String str, String ans) {
		if (str.isEmpty()) {
			System.out.println(ans);
		}
		for (int i = 0; i < str.length(); i++) {
			perm_print(str.substring(0, i) + str.substring(1 + i), ans + str.charAt(i));
		}
	}

	public static void print_SubSeq(String str, String ans) { // "abc"
		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		print_SubSeq(str.substring(1), ans + str.charAt(0)); // "bc" , a
		print_SubSeq(str.substring(1), ans + (int) str.charAt(0)); // "bc" , " "
		print_SubSeq(str.substring(1), ans); // "bc" , " "

	}
}
