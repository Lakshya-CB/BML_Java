package lec_4;

public class Rotation_1 {
	public static void main(String[] args) {
		int num = 123456;
		int rot = -13;
		int count = 0;
		int temp = num;
		
		while(temp >0) {
			temp=temp/10;
			count++;
		}
		rot=rot%6;
		System.out.println(rot);
//		if(rot<0) {
//			rot=rot+6;
//		}
//		
////		System.out.println(count);
//		for(int jj = 1;jj<=rot;jj++) {
//			int ld = num%10; 
//			int mid_num = num/10;
//
//			int mult = (int)Math.pow(10, count-1);
//			num = mid_num + ld*mult ;
//			System.out.println("Ans : "+num);
//			System.out.println("---------");
//		}
//		
//		
		
		
		
	}

}
