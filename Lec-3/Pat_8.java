
public class Pat_8 {

	public static void main(String[] args) {
		int RR= 5;
		int row =1;
		while(row<=RR) {
			//col work
			int col =1;
			
			while (col<=RR) {
				if(col==row||col+row==RR+1) {
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
