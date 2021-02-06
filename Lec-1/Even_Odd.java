package pack1;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();	
		
		if(num%2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		

	}

}
