
public class Pat_18 {
	public static void main(String[] args) {
		int RR = 7;
		int row = 1;
		int nsp = 3;
		int nst = 1;
		while(row<=RR) {
			
//			Work
			int csp =1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			
			int cst = 1;
			while(cst <= nst ) {
				if(cst==1||cst==nst) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				cst++;
			}
			
//			Step 3
			System.out.println();
			if(row<=RR/2) {
				nsp --;
				nst = nst+2;
			}
			else {
				nsp ++;
				nst = nst-2;		
			}
			row++;
		}
	}

}
