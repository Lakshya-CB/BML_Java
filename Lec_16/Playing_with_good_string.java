package Lec_16;

import java.util.Scanner;

public class Playing_with_good_string {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int count_vowels = 0;
		int ans =0;
		for(int i=0;i<str.length();i++) {
			if(isvow(str.charAt(i))){
				count_vowels++;
			}else {
				count_vowels=0;
			}
			ans = Math.max(ans, count_vowels);
		}
		System.out.println(ans);
	}
	
	public static boolean isvow(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			return true;
		}
		else {
			return false;
		}
	}
}
