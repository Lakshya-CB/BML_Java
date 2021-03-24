package Lec_14;

import java.util.Arrays;
import java.util.Scanner;

public class Agg_cows {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int Cow = scn.nextInt();
		int[] stall = new int[N];
		for(int i=0;i<N;i++) {
			stall[i]= scn.nextInt();
		}
		Arrays.sort(stall);
		int low = 0;
		int high = stall[N-1]-stall[0];
		int ans = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arrange(stall, Cow, mid)) {
				ans=mid;
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		System.out.println(ans);
		
	}
	
	public static boolean arrange(int[] stall, int num_Cows ,int min_distace) {
		int curr_cow =1;
		int prev_cow_dist = stall[0];
		for(int i=1;i<stall.length;i++) {
			if(stall[i]-prev_cow_dist>=min_distace) {
//				place cow
				curr_cow++;
				prev_cow_dist = stall[i];
			}
			if(curr_cow==num_Cows) {
				return true;
			}
		}
		return false;
	}
}
