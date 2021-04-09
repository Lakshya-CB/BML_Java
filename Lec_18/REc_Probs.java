package Lec_18;


public class REc_Probs {
	public static void main(String[] args) {
//		PD(5);
//		PI(5);
//		PDI(5);
//		System.out.println(fact(3));
//		System.out.println(pow(3,3));
//		System.out.println(fib(0));
//		System.out.println(fib(1));
//		System.out.println(fib(2));
//		System.out.println(fib(3));
		int [] arr = {1,2,3,4,5,6};
		print_arr(arr, 0);
		
	}
	public static void PD(int n) { // Bigger Prob
		if(n==0) {
			return;
		}
		System.out.println(n); // n
		PD(n-1); // n-1,n-2.n-3....1
	}
	
	public static void PI(int n) { // Bigger problem
		if(n==0) {
			return; // Base case
		}
		PI(n-1); // smaller P. 1 ,2,3,4,5,.... n-1
		System.out.println(n);
	}

	public static void PDI(int n) { // Bigger P		
		if(n==0) {
			return; // base cases
		}
		System.out.println("hi " + n);
		PDI(n-1); // SP n-1,n-2,..2,1,2,3...,n-2,n-1
		System.out.println("bye "+n);
	}
	
	public static int fact(int n) { // BP
		// Base case 
		if (n==0) {
			return 1;
		}
		// SP (n-1)!
		int sp = fact(n-1);
		int bp = n*sp;
		return bp;
	}

	public static int pow(int x, int n) { // BP
		if(n==0) {
			return 1; //  base case
		}
		int sp = pow(x,n-1);
		int bp = sp*x;
		return bp;
	}
	
	public static int fib(int n) {
		if (n==0||n==1) {
			return n;
		}
		int prev1 = fib(n-1);
		int prev2 = fib(n-2);
		int ans = prev1+ prev2;
		return ans;		
	}

	public static void print_arr(int [] arr, int index) { // BP
		if (index ==arr.length) {
			//Base case
			return;
		}
		System.out.println(arr[index]); // element at index
		// SB
		print_arr(arr,index+1);
	}
}
