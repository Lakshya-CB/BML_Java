package lec_4;

public class Dec_Oct {
	public static void main(String[] args) {
		int num = 684;
		int oct = 0;
		int mult = 1;
		while(num>0) {
			int digit = num%8;
			num = num/8;
			oct = oct + digit * mult;
			mult=mult*10;
//			System.out.println(digit);
		}
		System.out.println(oct);
	}
}
