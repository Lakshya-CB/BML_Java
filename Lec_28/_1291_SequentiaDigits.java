package Lec_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1291_SequentiaDigits {
	public static void main(String[] args) {
			List<Integer> AL = new ArrayList<>();
			for (int i = 1; i <= 9; i++) {
				gen_num(i, 100, 9999999,AL);
			}
			
			Collections.sort(AL);
			System.out.println(AL);
			System.out.println(Integer.MAX_VALUE);
		}
	
		public static void gen_num(int curr, int low, int high,List<Integer> AL) {
			if (curr >= low && curr <= high) {
	//			System.out.println(curr);
				AL.add(curr);
			}
	
			if (curr % 10 == 9 || curr > high) { // -BC
				return;
			}
	
			gen_num(curr * 10 + (curr % 10 + 1), low, high,AL);
		}
	
	}
