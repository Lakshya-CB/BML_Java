package Lec_14;

import java.util.Scanner;

public class K_root {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            long n = sc.nextLong();
            int k = sc.nextInt();
            long x = (long) Math.pow(n,1.0/k);
            // System.out.println(x- Math.pow(n,1.0/k));
            if( Math.pow(n,1.0/k)-x>0.99){
                System.out.println(x+1);
            }
            else{
                System.out.println(x);
            }
            t--;
        }
    }
}


