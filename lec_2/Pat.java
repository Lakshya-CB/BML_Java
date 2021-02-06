package lec_2;

public class Pat {
	public static void main(String[] args) {
		int RR = 5;
		int row =1;
		int nst =1; 
		while(row <=RR) {
			//Work on each col
			int col = 1;
			while(col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
//			nst++;
		}
	}

}
