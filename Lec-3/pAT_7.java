
public class pAT_7 {

	public static void main(String[] args) {
		int RR= 5;
		int row =1;
		while(row<=RR) {
			//col work
			int col =1;
			
			while (col<=RR) {
				if(col==1 ||col==RR||row==1||row==RR) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
				col++;
			}
			
			System.out.println();	
			row++;
		}
	}


}
