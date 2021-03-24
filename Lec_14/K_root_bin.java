package Lec_14;

import java.util.Scanner;

public class K_root_bin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println(popo(10,5));
		int t = sc.nextInt();
		while (t > 0) {
			long n = sc.nextLong();
			int k = sc.nextInt();
			long low = 1;
			long high = n;
			long ans = 1;
			while(low<=high) {
				long mid = (low+high)/2;
				if(popo(mid,k)==n) {
//					System.out.println(mid);
					high = mid;
					break;				
				}
				else if(popo(mid,k)<n) {
					low = mid+1;
				}
				else {
					high = mid-1;
				}
			}
			System.out.println(high);
			t--;
		}
	}
	public static long popo(long a, long b) {

		return (long)Math.pow(a, b);
	}
}
