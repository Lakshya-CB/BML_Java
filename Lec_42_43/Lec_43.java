package Lec_42_43;

public class Lec_43 {
	public static void main(String[] args) {
		Linked_List LL = new Linked_List();
		LL.addLast(10);
		LL.addLast(20);
		LL.addLast(30);
		LL.addLast(40);
		LL.addLast(50);
		LL.addLast(60);
		LL.addLast(70);
		LL.addLast(80);
		LL.addLast(90);
		LL.addLast(100);
		LL.addLast(110);
//		LL.disp();
		LL.reverse_K( 3);
		LL.disp();
	}
}
