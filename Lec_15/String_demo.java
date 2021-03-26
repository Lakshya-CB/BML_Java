package Lec_15;

public class String_demo {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s);
		String s1 = "Hello";
		System.out.println(s1==s);
		
		System.out.println("--------------");
		s1 = "by1";
		System.out.println(s);
		
		System.out.println("--------------");
		s = "by1";
		System.out.println(s1==s);
		
		System.out.println("--------------");
		s="adfadsfasf";
		s1=s;
		System.out.println(s1);
		
		System.out.println("--------------");
		String s01 = new String("new keyword BOI");
		String s02 = new String("new keyword BOI");
		System.out.println(s01==s02);
		
		System.out.println("--------------");
		s02=s01;
		s01="adfssdf";
		System.out.println(s02);

		System.out.println("--------------");
		String Class_over= "Bas Karo Bhaiya";
		System.out.println(Class_over.length());
		System.out.println(Class_over.charAt(Class_over.length()-1));
		System.out.println(Class_over.substring(0,2));
		System.out.println(Class_over.substring(0,1));
		System.out.println(Class_over.substring(0,0));
//		System.out.println(Class_over.substring(10,0));
		System.out.println("--------------");
		System.out.println(Class_over.substring(12));
		System.out.println(Class_over.substring(0));
		
		
		
		
		
//		System.out.println("--------------");
//		int[] arr1 = new int[1];
//		int[] arr2 = new int[1];
//		System.out.println(arr1==arr2);
//		
		
	}
}
