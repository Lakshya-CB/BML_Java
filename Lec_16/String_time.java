package Lec_16;

public class String_time {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 100000; i++) {
			str = str + i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
