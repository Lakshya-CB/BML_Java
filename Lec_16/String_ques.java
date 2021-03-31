package Lec_16;

import java.util.ArrayList;

public class String_ques {
	public static void main(String[] args) {
		String str = "nitin";
//		All_substring(str);
//		System.out.println(All_substring(str));
//		count_Palin(str);
		str = "The Sky Is Blue";
		rev_word(str);
	}
	public static boolean isPalin(String str) {
		int low =0;
		int high = str.length()-1;
		while(low<high) {
			if(str.charAt(high)==str.charAt(low)) {
				low++;
				high--;
			}
			else {
				return false;
			}
		}
		return true;
	}
 	public static ArrayList <String> All_substring(String str) {
		ArrayList <String> AL = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
//				System.out.println(str.substring(i,j));
				AL.add(str.substring(i,j+1));
			}
		}
		return AL;
	}
 	public static void count_Palin(String str) {
 		ArrayList<String> AL = All_substring(str);
 		int count =0;
 		for(String g : AL) {
 			if(isPalin(g)) {
 				count++;
 				System.out.println(g);
 			}
 		}
 		System.out.println(count);
 	}
 	
 	public static void rev_word(String str) {
 		while(true) {
 			int index = str.lastIndexOf(' ');
 			String word = str.substring(index+1);
 			System.out.println(word);
 			if(index ==-1) {
 				break;
 			}
 			str = str.substring(0,index);
 		}
 	}
}
