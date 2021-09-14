package Bit_Masking;

public class Single_number_3 {
	public int[] singleNumber(int[] nums) {
		int zor = 0;
		for(int ele: nums) {
			zor = zor^ele;
		}
		int RMSB = zor &-zor;
		int set1 =0;
		int set2 =0;
		for(int ele: nums) {
			if((RMSB&ele)==0) {
				set1= set1^ele;
			}
			else {
				set2= set2^ele;
			}
		}
		int[] ans = new int[2];
		ans[0] = set1;
		ans[1] = set2;
		
		return ans;
	}
}
