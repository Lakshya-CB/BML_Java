package Bit_Masking;

public class Count_num_set_bits {
//	Brian kernighans Algo
	public static void main(String[] args) {
		int x = 52;
		int mask = 1;
		int count = 0;
		while (mask <= x) {
			if ((x & mask) > 0) {
				count++;
				System.out.println(Integer.toBinaryString(mask));
			}
			mask = mask << 1;
		}
		System.out.println(count);
		x = 52;
		mask = 1;
		count = 0;
		while (x != 0) {
			int RMSB = x & -x;
			System.out.println(Integer.toBinaryString(RMSB));
			x = x - RMSB;
			count++;
		}
		System.out.println(count);
		
	}
}
