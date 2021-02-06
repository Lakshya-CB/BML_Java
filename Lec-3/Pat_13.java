
public class Pat_13 {
	public static void main(String[] args) {
		int RR = 5;
		int row = 1;
		int nst = 1; 
		while(row<=2*RR-1) {
			
//			Step 2
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if(row<=RR-1) {
				nst++;		
			}
			else {
				nst--;
			}
			row++;
			
		}
		
	}

}
