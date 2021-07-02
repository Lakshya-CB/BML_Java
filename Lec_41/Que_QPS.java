package Lec_41;

import java.util.LinkedList;
import java.util.Queue;

import Doubts_class_1.First;
import Lec_39.Dynamic_Queue;

public class Que_QPS {
	public static void main(String[] args) throws Exception {
		Dynamic_Queue Q = new Dynamic_Queue();
		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		Q.enqueue(40);
		Q.enqueue(50);

		Q.disp();

		Print_Rev(Q, 0);
		System.out.println();
		Q.disp();
		System.out.println("*****************");
		Actual_Rec(Q);
		Q.disp();
		System.out.println("*****************");

		// uSing inbuild Queue
		Queue<Integer> QQ = new LinkedList<>();
		QQ.add(10);
		QQ.add(20);
		QQ.add(30);
		QQ.add(40);

//		System.out.println(QQ);
//		System.out.println(QQ.poll());
//		System.out.println(QQ);
//
//		System.out.println(QQ.poll());
//		System.out.println(QQ);
//
//		System.out.println(QQ.poll());
//		System.out.println(QQ);
//		
//
//		System.out.println(QQ.peek());
//		System.out.println(QQ);

//		
		int[] arr2 = { -20, 10, -5, 4, 5, 6, -9, -80, 60, 50 };
		First_neg_k_window(arr2, 3);

	}

	public static void Print_Rev(Dynamic_Queue Q, int count) throws Exception {
		if (count == Q.size()) {
			return;
		}
		int temp = Q.dequeue();
		Q.enqueue(temp);
//		Q.disp();
		Print_Rev(Q, count + 1);
		System.out.print(temp + " ");
	}

	public static void Actual_Rec(Dynamic_Queue Q) throws Exception {

		if (Q.isEmpty()) {
			return;
		}
		int temp = Q.dequeue();
		Actual_Rec(Q);
		Q.enqueue(temp);
	}

	public static void First_neg_k_window(int[] arr, int k) {
		Queue<Integer> QQ = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				QQ.add(i);
			}
		}
		
		// starting index from 1 till i+k-1 <arr.length 
		int ans = 0;
		if (!QQ.isEmpty()) {
			ans = arr[QQ.peek()];
		}
		System.out.println("Start : " + 0 + " , End : " + ( k - 1) + " ; First Neg " + ans);

		for (int i = 1; (i + k - 1) < arr.length; i++) {
			// Add the Right most element of the window in ur QQ
			if (arr[i + k - 1] < 0) {
				QQ.add(i + k - 1);
			}

			if (!QQ.isEmpty() && QQ.peek() == i - 1) {

				QQ.poll();
			}
			
			ans = 0;
			if (!QQ.isEmpty()) {
				ans = arr[QQ.peek()];
			}
			System.out.println("Start : " + i + " , End : " + (i + k - 1) + " ; First Neg " + ans);
//			System.out.println(QQ);
		}
	}
}
