package Bit_Masking;

public class Demo {
	public static void main(String[] args) {
		byte b = 40;
//		System.out.println(Integer.toBinaryString(b).substring(24));
		int ll = 36;
		int orr = b | ll;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(ll));
		System.out.println(Integer.toBinaryString(orr) + "  " + orr);
		System.out.println("--------------------------");
		int and = b & ll;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(ll));
		System.out.println(Integer.toBinaryString(and) + "  " + and);
		System.out.println("--------------------------");
		int zor = b ^ ll;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(ll));
		System.out.println(Integer.toBinaryString(zor) + "  " + zor);

		System.out.println("--------------------------");
		int x = 5;
		int lefty_shift = x << 31;
		System.out.println(Integer.toBinaryString(x) + "  " + x);
		System.out.println(Integer.toBinaryString(lefty_shift) + "  " + lefty_shift);

		System.out.println("--------------------------");

		x = -21;
		int right_shift = x >> 1;
//		System.out.println(Integer.toBinaryString(x)+"  "+x);
		System.out.println(Integer.toBinaryString(right_shift) + "  " + right_shift);

		System.out.println("--------------------------");

		x = 21;
		right_shift = x >> 1;
//		System.out.println(Integer.toBinaryString(x)+"  "+x);
		System.out.println(Integer.toBinaryString(right_shift) + "  " + right_shift);

		System.out.println("--------------------------");
		x=-5;
		int TTT_right_shift = x>>>1;
		System.out.println(Integer.toBinaryString(x)+"  "+x);
		System.out.println(Integer.toBinaryString(TTT_right_shift)+"  "+TTT_right_shift);
		
		
		System.out.println("--------------------------");
		x = 13;
		int not_x = ~x+1;
		System.out.println(Integer.toBinaryString(x) + "  " + x);
		System.out.println(Integer.toBinaryString(not_x) + "  " + not_x);
		
//		Playing with ith bit!!! Convert ith bit to 1!!
		System.out.println("--------------------------");
		int mask = 1<<4;
		System.out.println(Integer.toBinaryString(x) + "  " + x);
		System.out.println(Integer.toBinaryString(x|mask) + "  " + (x|mask));

//		Playing with ith bit!!! Convert ith bit to 0!!
		System.out.println("--------------------------");
		mask = ~(1<<3);
		System.out.println(Integer.toBinaryString(x) + "  " + x);
		System.out.println(Integer.toBinaryString(x&mask) + "  " + (x&mask));

//		Playing with ith bit!!! Toggle ith bit!!
		System.out.println("--------------------------");
		mask = 1<<1;
		System.out.println(Integer.toBinaryString(x) + "  " + x);
		System.out.println(Integer.toBinaryString(x^mask) + "  " + (x^mask));


//		Playing with ith bit!!! check ith bit!!
		System.out.println("--------------------------");
		mask = 1<<0;
		System.out.println(Integer.toBinaryString(x) + "  " + x);

		if((x&mask)==0) {
			System.out.println("ith bit is 0");
		}
		else {
			System.out.println("ith bit is 1");
		}	

	}
	
}
