
public class Pat_1 {
	public static void main(String[] args) {
		int RR= 5;
		int row =1;
		while(row<=RR) {
			//col work
			int curr_star =1;
			
			while (curr_star<=RR) {
				System.out.print("*");
				curr_star++;
			}
			System.out.println();	
			row++;
		}
	}

}
