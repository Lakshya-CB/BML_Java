package Bit_Masking;

public class Misc_Ques {
	public static void main(String[] args) {
		int x = 52;
		while(x!=0) {
			System.out.print(x%2);
			x=x/2;
		}
		System.out.println();
		x = 52;
		while(x!=0) {
			System.out.print(x&1);
//			x=x>>1;
			x>>=1;
		}
	}
}
