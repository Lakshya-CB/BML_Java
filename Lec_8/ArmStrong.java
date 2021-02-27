package Lec_8;

public class ArmStrong {
	public static void main(String[] args) {
		printArm(1,100000000);
	}
	public static void printArm(int l,int h) {
		for(int i=l;i<=h;i++) {
//			Print my number of Armstrong
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isArmstrong(int num) {
//		Calculate RHS
//		Compare to num 
//		If equal return true else false
		int temp = num;
		int numdigit = num_digit(num);
		int RHS  = 0;
		while(num>0) {
			int digit = num%10;
			num = num/10;
			RHS = (int)(RHS + Math.pow(digit, numdigit));
		}
		if(RHS==temp) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static int num_digit(int num) {
//		  count number of digits 
		int ans = 0;
		while(num>0) {
			num=num/10;
			ans++;
		}
		return ans;
	}

}
