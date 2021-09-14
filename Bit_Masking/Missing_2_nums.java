package Bit_Masking;

public class Missing_2_nums {
	public static void main(String[] args) {
		int[] arr = {0,5,2,4};
		int n = arr.length+1;
//		Calculate the Zor of missing numbers!!!
		int zor =0;
		for(int i=0;i<=n;i++) {
			zor=zor^i;
		}
		
		for(int ele : arr) {
			zor  = zor^ele;
		}
		
//		Find the mask!! mask is the Right Most Set Bit
		int mask = zor &-zor;
		int set1 = 0;
		int set2 = 0;
		for(int ele: arr) {
			if((mask&ele)==0) {
				set1= set1^ele;
			}
			else {
				set2= set2^ele;
			}
		}
		for(int i=0;i<=n;i++) {
			int ele =i;
			if((mask&ele)==0) {
				set1= set1^ele;
			}
			else {
				set2= set2^ele;
			}
		}
		System.out.println(set1 + " , "+set2);
	}
}
