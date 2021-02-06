package lec_2;

public class Prime_2 {
	public static void main(String[] args) {
		int num = 12;
		int div = 2;
		int factors=0;
		
		while (div<=num-1) {
			//work
			if(num%div==0) { //factor
				factors = factors+1;
				break;
			}
			div++;
		}
		System.out.println(div);
//		System.out.println(factors);
//		if(factors>=1) {
//			System.out.println("Not Prime");
//		}
//		else{
//			System.out.println("Prime");
//		}
		

	}

}
