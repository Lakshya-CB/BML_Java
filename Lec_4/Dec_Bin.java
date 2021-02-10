package lec_4;

public class Dec_Bin {
	public static void main(String[] args) {
		int num = 37;
		int bin = 0;
		int mult = 1;
		while(num>0) {
			int bit = num %2;
			bin = bin +bit*mult;
			mult = mult*10;
			num=num/2;
//			System.out.println(bit);
		}
		System.out.println(bin);
	}
}
