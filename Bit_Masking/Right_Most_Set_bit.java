package Bit_Masking;

public class Right_Most_Set_bit {
	public static void main(String[] args) {
		int x = 52;
		System.out.println(Integer.toBinaryString(x));
		int mask = -x;
		System.out.println(Integer.toBinaryString(mask));
		
		int ans = x&mask;
		System.out.println(Integer.toBinaryString(ans));
	}
}
