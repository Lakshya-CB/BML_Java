package Bit_Masking;

public class Duplicate_missing {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 6, 3, 4, 3 };
		int n = 6;
		// Calculate the Zor of Missing and Duplicate number!!
		int zor = 0;
		for (int i = 0; i <= n; i++) {
			zor = zor ^ i;
		}

		for (int ele : arr) {
			zor = zor ^ ele;
		}

//	Find the mask!! mask is the Right Most Set Bit
		int mask = zor & -zor;
		
		int set1 = 0;
		int set2 = 0;
		for (int ele : arr) {
			if ((mask & ele) == 0) {
				set1 = set1 ^ ele;
			} else {
				set2 = set2 ^ ele;
			}
		}
		for (int i = 0; i <= n; i++) {
			int ele = i;
			if ((mask & ele) == 0) {
				set1 = set1 ^ ele;
			} else {
				set2 = set2 ^ ele;
			}
		}
		System.out.println(set1 + " , " + set2);
	}
}
