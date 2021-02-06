
public class Pat_21 {
	public static void main(String[] args) {
		int RR = 5;
		int row =1;
		int nst = 1;
		int nsp = 7;
		while(row<=RR) {
			
			int cst = 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
				
			}
			
			int csp = 1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			
			cst = 1;
			if(row==RR) {
				cst=2;
			}
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
				
			}
//			Prep
			System.out.println();
			nst = nst+1;
			nsp = nsp-2; 
			
			row++;
		}
		
	}

}
