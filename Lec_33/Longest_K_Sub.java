package Lec_33;

import java.util.ArrayList;
import java.util.Arrays;

public class Longest_K_Sub {
	public static void main(String[] args) {
		Longest_Uni_K("aabbccabc", 2);
	}

	public static void Longest_Uni_K(String str, int k) {
		int[] arr = new int[26];
		int start = 0;
		int end = 0;
		int unique = 0;
		ArrayList<Character> AL = new ArrayList<>();
		while (end >= start && end < str.length()) {

			// ??
			if (unique > k) {
				char start_ch = str.charAt(start);
				if (arr[start_ch - 'a'] == 1) {
					unique--;
				}
				arr[start_ch - 'a'] = arr[start_ch - 'a'] - 1;
				AL.remove(0);
				
//				if (unique == k) {
////					System.out.println(Arrays.toString(arr));
////					System.out.println(str.substring(start+1, end ) + " : " + unique);
//				}
				start++;
			} else {
				char end_ch = str.charAt(end);
				// exists in my sub string of start to end
				if (arr[end_ch - 'a'] == 0) {
					unique++;
//					System.out.println(end_ch + " : " +  unique);
				}
				AL.add(end_ch);
				arr[end_ch - 'a'] = arr[end_ch - 'a'] + 1;
//				if (unique == k) {
////					System.out.println(Arrays.toString(arr));
////					System.out.println(str.substring(start, end + 1) + " : " + unique);
//				}
				end++;
				
			}
			if (unique == k) {
				System.out.println(AL);
			}
			
		}
	}
}
