package Lec_7;

import java.util.Scanner;

public class input_char {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
//		System.out.println(ch);
		if('a'<=ch && ch<='z') {
			System.out.println("Lower");
		}
		else if('A'<=ch && ch<='Z') {
			System.out.println("Upper");
		}
		else {
			System.out.println("Invalid");
		}
		
	}
	
}
