package lec_4;

public class Bin_dec {
	public static void main(String[] args) {
		int num = 100101;
		int dec = 0;
		int mult = 1;
		while(num>0) {
			int digit = num%10;
			num = num/10;
			dec = dec + digit*mult;
			mult=mult*2;
//			System.out.println(digit);
		}
		System.out.println(dec);
	}

}
