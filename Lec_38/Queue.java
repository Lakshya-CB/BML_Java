package Lec_38;

public class Queue {
	protected int[] arr;
	protected int front;
	protected int size;
	
	public Queue() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
		front = 0;
		size =0;
	}
	public Queue(int Capa) {
		// TODO Auto-generated constructor stub
		arr = new int[Capa];
		front = 0;
		size = 0;
	}
	public void enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Its full!!");
		}
		arr[(front+size)%arr.length]=item;
		size++;
		return;
	}
	
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int temp = arr[front];
		arr[front]=0;
		front=(front+1)%arr.length;
		size--;
		return temp;
	}
	public int getFront() {
		return arr[front];
	}
//	  Size functions
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size() ==0;
	}
	public boolean isFull() {
		return size() ==arr.length;
	}
	public void disp() {
		for(int i=0;i<size;i++) {

			System.out.print(arr[(front+i)%arr.length] + " ");
		}
		System.out.println();
		System.out.println("--------");
		
	}
}
