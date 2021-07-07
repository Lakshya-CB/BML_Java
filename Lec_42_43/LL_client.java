package Lec_42_43;

public class LL_client {
	public static void main(String[] args) throws Exception {
		Linked_List LL = new Linked_List();
		LL.addLast(10);
		LL.addLast(20);
		LL.addLast(30);
		System.out.println(LL.size());
		LL.disp();

		LL.addLast(40);
		System.out.println(LL.size());
		LL.disp();

		LL.addLast(50);
		LL.disp();
		System.out.println(LL.size());
		

		LL.addFirst(5);
		LL.disp();

//		System.out.println(LL.size());

		LL.addAt(8,1);
		LL.disp();
		LL.addAt(0,0);
		LL.disp();

		LL.addAt(100,LL.size());
		LL.disp();
//		LL.addAt(-1,LL.size()+1);
//		LL.disp();
		System.out.println(LL.getAt(0));
		System.out.println(LL.getFirst());
		
		System.out.println(LL.getAt(LL.size()-1));
		System.out.println(LL.getLast());
		
		System.out.println(LL.getAt(LL.size()-2));
		
		System.out.println(LL.getAt(LL.size()-3));
		
//		System.out.println(LL.getAt(99));
		LL.disp();
		System.out.println(LL.removeLast());
		LL.disp();
		System.out.println(LL.removeLast());
		LL.disp();
		System.out.println(LL.removeLast());
		LL.disp();
		System.out.println(LL.removeLast());
		LL.disp();
		System.out.println(LL.removeLast());
		LL.disp();
		System.out.println(LL.removeLast());
		LL.disp();
		System.out.println(LL.removeLast());
		LL.disp();
		System.out.println(LL.removeLast());
		LL.disp();
		System.out.println(LL.removeLast());
		LL.disp();
//		System.out.println(LL.removeLast());
//		LL.disp();
		
		LL.addLast(10);
		LL.addLast(20);
		LL.addLast(30);
		LL.disp();
		System.out.println(LL.removeAt(1));
		LL.disp();
		System.out.println(LL.removeAt(1));
		LL.disp();
		System.out.println(LL.removeAt(9909090));
		LL.disp();
		
		
	}
}
