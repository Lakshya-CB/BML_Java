package Lec_48_49;

import java.util.Comparator;

public class Client {
	static class Node implements Comparable<Node> {
		int data;
		int rank;
		Node next;
		boolean rankwise = true;

		public Node(int data, int rank) {
			this.data = data;
			this.rank = rank;
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "data is " + data + " && rank is " + rank + " - ";
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub

//			2 Nodes here this and o
//			Return a +ve when this.data >i? 
//			return this.data - o.data;

//			Selecting best Rank(1 better than rank 1000)
			return o.rank - this.rank;

		}
	}

	static class Rank_Compare_Node implements Comparator<Node> {

		@Override
		public int compare(Node o1, Node o2) {
			// TODO Auto-generated method stub
			return o2.rank - o1.rank;
		}

	}

	static class Data_Compare_Node implements Comparator<Node> {

		@Override
		public int compare(Node o1, Node o2) {
			// TODO Auto-generated method stub
			return o1.data - o2.data;
		}

	}
	public static void main(String[] args) {
//		StackI SS = new StackI(); 
		Stack ss = new Stack();
		StackI SS = new Stack();

		Node[] arr = new Node[5];
		arr[0] = new Node(101, 134);
		arr[1] = new Node(22, 2);
		arr[2] = new Node(35, 351);
		arr[3] = new Node(14, 8);
		arr[4] = new Node(5, 11);

		Node dd = new Node(99, 99);

		dd.compareTo(arr[1]);
		bubble(arr,new Data_Compare_Node());
		print(arr);

	}

	public static void print(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static <OOO> void print(OOO[] arr) {
//		System.out.println("asdfadsfasdf");
		for (OOO a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static <lol extends Comparable> void bubble(lol[] arr, Comparator<lol> ccc) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int i = 0; i < arr.length - 1 - counter; i++) {
//				if(arr[i]>arr[i+1]) {
//					Swap
//				if(arr[i].compareTo(arr[i+1])>0) {
				if (ccc.compare(arr[i], arr[i + 1]) > 0) {
					lol temp = arr[i];

					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
