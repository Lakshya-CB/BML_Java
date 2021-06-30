package Lec_38;

public class Client_Q {
	public static void main(String[] args) throws Exception {
		Queue Q = new Queue();

		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		Q.enqueue(40);
		Q.enqueue(50);

		Q.disp();

		System.out.println(Q.dequeue());
		Q.enqueue(60);
		Q.disp();
		System.out.println(Q.dequeue());
		Q.enqueue(70);
		Q.disp();
		System.out.println(Q.dequeue());
		Q.enqueue(80);
		Q.disp();
		System.out.println(Q.dequeue());
		Q.enqueue(90);
		Q.disp();
		System.out.println(Q.dequeue());
		Q.enqueue(100);
		Q.disp();
		System.out.println(Q.dequeue());
		Q.enqueue(110);
		Q.disp();

		System.out.println(Q.dequeue());
		System.out.println(Q.dequeue());
		System.out.println(Q.dequeue());
		System.out.println(Q.dequeue());
		System.out.println(Q.dequeue());
		Q.disp();
		Q.dequeue();

	}
}
