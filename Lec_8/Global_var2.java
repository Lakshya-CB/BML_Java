package Lec_8;

public class Global_var2 {
	static int val = 100;
	public static void main(String[] args) {
		System.out.println(Global_var2.val);
		fun(20);
	}

	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(Global_var2.val);
		val = val + 60;
		Global_var2.val = val + 10;
		System.out.println(val);
		System.out.println(Global_var2.val);
	}

}
