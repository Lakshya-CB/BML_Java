package Bit_Masking;

public class missing_number {
	public int missingNumber(int[] nums) {
        int sum = nums.length*(nums.length+1)/2;
        int ar_sum=0;
        for(int ele: nums){
            ar_sum = ar_sum +ele;
        }
        return sum - ar_sum;
    }
	public int missingNumber2(int[] nums) {
        int sum = 0;
        for(int i=0;i<=nums.length;i++) {
        	sum = sum^i;
        }
        for(int ele: nums){
        	sum = sum ^ele;
        }
        return sum;
    }
}
