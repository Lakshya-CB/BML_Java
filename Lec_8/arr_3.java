package Lec_8;

public class arr_3 {
	public static void main(String[] args) {
//		int[] arr = new int[5];
//		arr[0] =1 ;
//		arr[1] =13;
//		arr[2] =3;
//		arr[3] = 7;
//		for(int val:arr) {
//			System.out.println(val);
//		}
		char[] cs_arr = new char[3];
		cs_arr[0] = '1';
		cs_arr[1] = 'a';
		cs_arr[2] = 'z';
		
		for(char c : cs_arr) {
			System.out.println(c);
			c='O';
		}
		System.out.println("--------");
		for(char c : cs_arr) {
			System.out.println(c);
		}
		
		
	}
}
