package pack1;

public class Code_3 {
	public static void main(String[] args) {
		int num = 11;
		int div = 1;
		int factor = 0;
		while(div<=num) {
			if(num%div==0) {
				//factor
				factor ++;
			}
			div++;
		}
		System.out.println(factor);
		if(factor > 2 ) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("Prime");
		}
		System.out.print("Print line" + '\n');
		System.out.println("PrintLN");
		
	}
}
