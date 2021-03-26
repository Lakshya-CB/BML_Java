package Lec_15;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Para {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int P = scn.nextInt();
		int num_Cooks = scn.nextInt();
		int[] Rank = new int[num_Cooks];
		for(int i=0;i<num_Cooks;i++) {
			Rank[i] = scn.nextInt();
		}
		Arrays.sort(Rank);
		int high = Rank[num_Cooks-1]*P*(P+1)/2;
		int low =0;
		
//		System.out.println(checker(Rank, 6, P));
//		
//		for(int i=low;i<=high;i++) {
//			System.out.println(i+ " : "+ checker(Rank, i, P));
//		}
//		binary search 
		int ans = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(checker(Rank, mid, P)) {
				ans=mid;
				high = mid-1;
			}
			else {
				low= mid+1;
			}
		}
		System.out.println(ans);
	}

	public static boolean checker(int[] Ranks, int Given_time, int P) {
		int Total_P = 0;
		for(int i=0;i<Ranks.length;i++) {
//			Find number of Para chef can make in Given_time
//			n(n+1)/2*Ri <=Given_time
			
//			Logic 1
//			int n=0;
//			while(n*(n+1)/2*Ranks[i]<=Given_time) {
//				n++;
//			}
			
//			Logic 2
			int time_passed =0;
			int P_made =0;
			while(true) {
				if(time_passed+(P_made+1)*Ranks[i]<=Given_time) {
					P_made++;
					time_passed =time_passed+ P_made*Ranks[i];
				}
				else {
					break;
				}
			}
			
			Total_P=Total_P+(P_made);
//			System.out.println(n-1);
		}
		if(Total_P>=P) {
			return true;
		}
		else{
			return false;
		}
	}
}
