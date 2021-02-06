
public class Pat_9 {
	public static void main(String[] args) {
		int RR= 5;
		int row =1;
		int nsp = 4;
		int nst = 1;
		while(row<=RR) {
			//col work
			int csp =1;
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
			nsp --;
			nst = nst+2;
			row++;
		}
	}
}
