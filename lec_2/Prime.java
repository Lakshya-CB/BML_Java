package lec_2;

public class Prime {
	public static void main(String[] args) {
		int num = 1;
		int div = 1;
		int factors=0;
		while (div<=num) {
			//work
			if(num%div==0) { //factor
				factors = factors+1;
			}
			div++;
		}
		System.out.println(factors);
		if(factors ==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");		
		}

	}
}
