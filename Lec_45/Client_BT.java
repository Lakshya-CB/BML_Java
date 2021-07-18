package Lec_45;

public class Client_BT {
//	10 true 20 false true 40 true 50 true 100 true 110 false false false false true 60 false false true 30 true 70 false false true 80 false false  
	public static void main(String[] args) {
		BTree BT = new BTree();
		BT.Disp();
//		System.out.println(BT.Size());
//		System.out.println(BT.Max());
//		System.out.println(BT.Find(40));
		System.out.println("---------------------");
		System.out.println(BT.Diameter());
	}

}
