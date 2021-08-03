package Lec_50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_QPS {
	public static void main(String[] args) {
//		[[10,20,30], 
//		 [15,35], 
//		 [5,7,12,25] , 
//		 [17, 22, 40]] 
		ArrayList<ArrayList<Integer>> AL = new ArrayList<ArrayList<Integer>>();
		AL.add(new ArrayList<Integer>());
		AL.get(0).add(10);
		AL.get(0).add(20);
		AL.get(0).add(30);

		AL.add(new ArrayList<Integer>());
		AL.get(1).add(15);
		AL.get(1).add(35);

		AL.add(new ArrayList<Integer>());
		AL.get(2).add(5);
		AL.get(2).add(7);
		AL.get(2).add(12);
		AL.get(2).add(25);

		AL.add(new ArrayList<Integer>());
		AL.get(3).add(17);
		AL.get(3).add(22);
		AL.get(3).add(40);

//		Merge_K_sorted(AL);

//		Inbuilt PQ min Heap
//		PriorityQueue<Integer> Pq = new PriorityQueue<>();

//		Inbuilt Max Heap
//		PriorityQueue<Integer> Pq = new PriorityQueue<>(Collections.reverseOrder());

//		Pq.add(30);
//		Pq.add(10);
//		Pq.add(5);
//		Pq.add(100);
//		System.out.println(Pq);
//		System.out.println(Pq.poll());
//		System.out.println(Pq.poll());
//		System.out.println(Pq.poll());
//		System.out.println(Pq.poll());
		int[] arr = { 20, 30, 60, 10 };

		kThLargest(arr, 3);
	}

	static class pair implements Comparable<pair> {
		int data;
		int List_num;
		int List_idx;

		@Override
		public int compareTo(pair o) {
//			this and o =  marks (min Heap)
			return o.data - this.data;
		}

		public String toString() {
			return this.data + " ";
		}

	}

	public static void Merge_K_sorted(ArrayList<ArrayList<Integer>> AL) {
		Heap_generic<pair> H = new Heap_generic<>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < AL.size(); i++) {
			pair nn = new pair();
//			Ith list 0th element 
			nn.data = AL.get(i).get(0);
			nn.List_num = i;

			H.add(nn);
		}
		while (!H.isEmpty()) {
			pair Curr = H.poll();

			ans.add(Curr.data);
			if (Curr.List_idx + 1 < AL.get(Curr.List_num).size()) {
				Curr.data = AL.get(Curr.List_num).get(Curr.List_idx + 1);
				Curr.List_idx = Curr.List_idx + 1;
				H.add(Curr);
			}
//			H.Disp();
//			System.out.println(ans);
//			System.out.println("----------");
		}
		System.out.println(ans);
	}

	public static void klarger(int[] arr, int k) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();

		for (int i = 0; i < k; i++)
			heap.add(arr[i]);

		for (int i = k; i < arr.length; i++) {
			if (arr[i] > heap.peek()) {
				heap.remove();
				heap.add(arr[i]);
			}
		}

		System.out.println(heap);
	}

	public static void kThLargest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			if (pq.size() > k) {
				pq.poll();
			}
		}
		System.out.println(pq);

//		return pq.poll();
	}

	
}
