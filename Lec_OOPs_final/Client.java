package Lec_OOPs_final;

public class Client {
	public static void main(String[] args) {
//		add("A",0,1);
//		add("lol");
		add(1,2);
		for(String AA: args) {
			System.out.println(AA);
		}
		System.out.println("---------");
	}

	public static void add(int a, int b) {
		System.out.println("fixed");
	}

	public static void add(int a, int b, int c) {
		System.out.println("fixed2");
	}

//	public static void add(int... is) {
//		System.out.println(is.length);
//		for (int ll : is) {
//			System.out.println(ll);
//		}
//	}
	public static void add(int a,int b ,int... is) {
		System.out.println( " - "+ is.length);
		for (int ll : is) {
			System.out.println(ll);
		}
	}
}
