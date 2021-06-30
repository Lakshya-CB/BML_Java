package Lec_39;

public class Client_Dynamic_Q {
	public static void main(String[] args) throws Exception {
		Dynamic_Queue Q = new Dynamic_Queue();
		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		Q.enqueue(40);
		Q.enqueue(50);
		Q.enqueue(60);
		Q.disp();
		Q.enqueue(70);
		Q.enqueue(80);
		Q.enqueue(90);
		Q.disp();
		Q.dequeue();
		Q.disp();

		Q.dequeue();
		Q.disp();

		Q.dequeue();
		Q.disp();

		Q.dequeue();
		Q.disp();
		
		Q.enqueue(100);
		Q.disp();
	}
}
