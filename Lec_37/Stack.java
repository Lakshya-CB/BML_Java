package Lec_31;

public class Stack {
	private int[] arr;
	private int tos;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
		tos = -1;
	}

	public Stack(int Capa) {
		// TODO Auto-generated constructor stub
		arr = new int[Capa];
		tos = -1;
	}

	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full Capacity Reached!");
		}
		tos++;
		arr[tos] = item;
	}

	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty!!");
		}
		int temp = arr[tos];
		arr[tos] = 0;// Optional
		tos--;
		return temp;
	}

	public int peek() {
		return arr[tos];
	}

	public int size() {
		return tos + 1;
	}
	public boolean isFull() {
		return size() == arr.length; 
	}
	
	public boolean isEmpty() {
		return size() == 0; 
	}
	public void dip() {
		for(int i=tos;i>=0;i--) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("--------------");
	}
}
