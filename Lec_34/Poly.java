package Lec_34;

public class Poly {
	public static void main(String[] args) {
//		solve_poly(7, 3);
//		System.out.println(pow(2, 5));
		SOE(5500);

	}

	public static int solve_poly(int x, int n) {
		int pow = x;
		int sum = 0;
		for (int c = n; c >= 1; c--) {
			sum = sum + c * pow;
			System.out.println(c * pow);
			pow = pow * x;
		}
		return sum;
	}

	public static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int sp = pow(x, n / 2);
		if (n % 2 == 0) {
			return sp * sp;
		} else {
			return sp * sp * x;
		}
	}

	public static void SOE(int n) {
		boolean[] isPrime = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}
		for (int factor = 2; factor * factor <= n; factor++) {
			if (isPrime[factor]) {
//				System.out.println(factor);
				for (int mult = 2; factor * mult <= n; mult++) {
					isPrime[factor * mult] = false;
				}
			}
		}
		
		for(int i=0;i<=n;i++) {
			if(isPrime[i]) {
				System.out.println(i);
			}
		}

	}
}
