package doubt_class_bml;

import java.util.Scanner;

public class Pat_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int RR = scn.nextInt();
		int nst = 1;
		int nsp = RR;
		for(int i=1;i<=RR;i++) {
			int csp=1; 
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst  = 1;
			int comb = 1;
			while(cst<=nst) {
				System.out.print(comb + " ");
				int n = i-1;
				int r = cst-1;
				comb = comb * (n-r)/(r+1);
//				System.out.print("* ");
				cst++;
			}
			nsp--;
			nst++;
			System.out.println();
			
		}
	}

}
