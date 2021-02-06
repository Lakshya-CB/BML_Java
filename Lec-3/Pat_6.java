
public class Pat_6 {
	
	public static void main(String[] args) {
		int RR = 5;
		int rows= 1;
		int nsp = 0;
		int nst = 5;
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
			nst=nst-1;
			nsp =nsp+2 ;
			rows++;
		}
		
	}
}
