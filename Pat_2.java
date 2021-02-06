package lec_2;

public class Pat_2 {
	public static void main(String[] args) {
		int RR = 5;
		int rows= 1;
		int nsp = 4;
		int nst = 1;
		while(rows<=RR) {
			// Col work
			// Print Space
			int csp = 1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			
			int cst = 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			// Prep 
			System.out.println();
			nst++;
			nsp--;
			rows++;
		}
		
	}
}
