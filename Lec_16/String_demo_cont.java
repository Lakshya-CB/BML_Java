package Lec_16;

import java.util.Scanner;

public class String_demo_cont {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String str = scn.next();
//		System.out.println(str);
		String str ="HelloH";
		System.out.println(str.indexOf('H'));
		System.out.println(str.lastIndexOf('H'));
		System.out.println("--------------");
		System.out.println(str.startsWith("Hel"));
		System.out.println(str.endsWith("lol"));
		System.out.println("--------------");
		
		String s1 = "Hi";
		String s2 = "bye";
		String s3 = s1+s2;
		String s4 = s1.concat(s2);
		System.out.println(s3==s4);
		String s5 = "HibyeLL";
		String s6 = s5.substring(0,5) ;
		
		System.out.println("--------------");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s6);
		System.out.println(s3==s4); // false
		System.out.println(s3==s6); // ??false or 
		System.out.println("--------------");
		


		
		
	}
}
