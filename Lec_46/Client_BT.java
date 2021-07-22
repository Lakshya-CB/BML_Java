package Lec_46;

public class Client_BT {
//	10 true 20 false true 40 true 50 true 100 true 110 false false false false true 60 false false true 30 true 70 false false true 80 false false  
//	10 true 20 false true 40 true 50 false false true 60 false false true 30 true 70 false false true 80 false false  

	public static void main(String[] args) {
//		BTree BT = new BTree();
//		BT.Disp();
//		System.out.println(BT.Size());
//		System.out.println(BT.Max());
//		System.out.println(BT.Find(40));
		System.out.println("---------------------");
//		System.out.println(BT.Diameter());
//		System.out.println(BT.Diameter3());
//		System.out.println(BT.isBalanced2());
//		System.out.println(BT.Maximum_Sub_Tree_Sum());
//		BT.Iterative_print();
		int[] pre = {10,20,40,50,30,60};
		int[] in = {40,20,50,10,60,30};
		
		BTree BT = new BTree(pre,in);
		BT.Disp();
	}

}
