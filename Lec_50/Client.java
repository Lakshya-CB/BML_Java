package Lec_50;

public class Client {
	public static void main(String[] args) {
		Heap_generic<Integer> H = new Heap_generic();
		H.add(10);
		H.add(20);
		H.add(30);
		H.add(40);
		H.Disp();
		H.add(5);

		H.Disp();
		System.out.println(H.poll());

		H.Disp();
		System.out.println(H.poll());

		H.Disp();
		System.out.println(H.poll());

		H.Disp();

		System.out.println(H.poll());

		H.Disp();

	}
}
