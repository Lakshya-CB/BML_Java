package Lec_48_49;

import java.util.Arrays;
import java.util.LinkedList;

import Lec_42_43.Linked_List;

public class Maximum_win {
	public static void main(String[] args) {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		maxSlidingWindow(nums, k);
	}

	public static int[] maxSlidingWindow1(int[] nums, int k) {
		int[] ans = new int[nums.length - k + 1];

//		Create our window of k first
		LinkedList<Integer> LL = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			while (!LL.isEmpty() && nums[LL.peekLast()] < nums[i]) {
				LL.pollLast();
			}
			LL.addLast(i);
		}
		System.out.println(LL);
		ans[0] = nums[LL.peekFirst()];
//		Shift your window of size k
		for (int i = k; i < nums.length; i++) {
			if (!LL.isEmpty() && LL.peekFirst() == i - k) {
				LL.pollFirst();
			}
			// removed last window element
			while (!LL.isEmpty() && nums[LL.peekLast()] < nums[i]) {
				LL.pollLast();
			}
			LL.addLast(i);
			System.out.println(LL);

			ans[i - k + 1] = nums[LL.peekFirst()];
		}
		System.out.println(Arrays.toString(ans));
		return ans;
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		int[] ans = new int[nums.length - k + 1];
		
		int[] left_max=new int[nums.length];
		int[] right_max=new int[nums.length];
		
		int start =0;
		for(int i=0;i<nums.length;i++) {
			if((i+1)%k==0 || i==nums.length-1) {
				
//				movin towards right
				int temp_right_max = Integer.MIN_VALUE;
				for(int ll = start;ll<=i;ll++) {
					temp_right_max = Math.max(temp_right_max, nums[ll]);
					right_max[ll] = temp_right_max;
				}
//				movin towards left
				int temp_left_max = Integer.MIN_VALUE;
				for(int ll = i;ll>=start;ll--) {
					temp_left_max = Math.max(temp_left_max, nums[ll]);
					left_max[ll] = temp_left_max;
				}
				System.out.println(Arrays.toString(right_max));
				System.out.println(Arrays.toString(left_max));
				System.out.println("*****");
				start=i+1;
			}
			
		}
		for(int i=0;i<nums.length - k + 1;i++) {
			int start_win_idx = i;
			int end_win_idx = i+k-1;
			ans[i] = Math.max(left_max[start_win_idx], right_max[end_win_idx]);
		}
		System.out.println(Arrays.toString(ans));
		return ans;
	}
}
