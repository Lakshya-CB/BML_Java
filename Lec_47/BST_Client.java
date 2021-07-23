package Lec_47;

public class BST_Client {
	public static void main(String[] args) {
		int[] in = {  };
		BST TT = new BST(in);
		TT.Disp();
//		System.out.println(TT.Max());
//		System.out.println(TT.find(20));
//		System.out.println(TT.find(25));
//		System.out.println(TT.find(35));
//		System.out.println(TT.find(50));
		System.out.println("--------------");
//		TT.Print_bw(15, 65);
//		TT.replace_Greater();
//		TT.Disp();
		TT.add2(10);
		TT.add2(10);
		TT.add2(10);
		TT.add2(10);
		TT.add2(10);
		
		TT.Disp();

	}
}
