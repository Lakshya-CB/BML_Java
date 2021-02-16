package doubt_class_bml;

import java.util.Scanner;

public class Pat_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int RR = scn.nextInt();
		int nst = 1;
		for(int i=1;i<=RR;i++) {
			
			int cst = 1;
			int comb = 1;
			while(cst<=nst) {
//				System.out.print("*"+"\t");
//				nCr = comb;
//				nCr+1 = comb * (n-r)/(r+1)
				
				System.out.print(comb + "\t");
				int n = i-1;
				int r = cst-1;
				comb = comb * (n-r)/(r+1);
				cst++;
			}
			System.out.println();
			nst++;
		}
	}

}
