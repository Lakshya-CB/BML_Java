package Extra;

public class Client {
	public static void main(String[] args) {
//		Heap_generic<Integer> H = new Heap_generic();
//		H.add(10);
//		H.add(20);
//		H.add(30);
//		H.add(40);
//		H.Disp();
//		H.add(5);
//
//		H.Disp();
//		System.out.println(H.poll());
//
//		H.Disp();
//		System.out.println(H.poll());
//
//		H.Disp();
//		System.out.println(H.poll());
//
//		H.Disp();
//
//		System.out.println(H.poll());
//
//		H.Disp();

		int[] pre = { 10, 20, 40, 50, 80, 110, 120, 90, 130, 30, 60, 70, 100 };
		int[] in = { 40, 20, 110, 80, 120, 50, 90, 130, 10, 60, 30, 70, 100 };
		int[] lvl = { 10, 20, 30, 40, 50, -1, 70, -1, -1, -1, -1, -1, -1 };
		int[] in1 = {10,20,40,-1,-1,50,-1,-1,30,-1,70,-1,-1};
		BTree B = new BTree(pre, in);
//		B.Disp();
//		B.VerticalOrder();
//		B.create_lvl_order(lvl);
		B.create_pre_order(in1);
		B.Disp();
	}
}
