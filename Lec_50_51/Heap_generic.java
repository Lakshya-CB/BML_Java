package Lec_50_51;

import java.util.ArrayList;

public class Heap_generic<E extends Comparable> {
	private ArrayList<E> Al = new ArrayList<>();;

	public void Disp() {
		System.out.println(Al);
	}

	public boolean isEmpty() {
		return Al.isEmpty();

	}

	public void add(E ele) {
		Al.add(ele);
//		 Also maintain the COndition of Priority ?
		Upheapify(Al.size() - 1);
	}

	private void Upheapify(int child) {
		// TODO Auto-generated method stub
		int parent = (child - 1) / 2;
//		COmpare for priority ?!
//		if(Al.get(parent)>Al.get(child)) {
//			Swap
		if (Al.get(parent).compareTo(Al.get(child)) < 0) {
			swap(child, parent);
			Upheapify(parent);
		}
	}

	private void swap(int i, int j) {
		E temp = Al.get(i);
		Al.set(i, Al.get(j));
		Al.set(j, temp);
	}

	public E poll() {
		E temp = Al.get(0);
//		Swap from 0 to size -1
		swap(0, Al.size() - 1);
//		Delete Last node
		Al.remove(Al.size() - 1);

		DownHeapify(0);

		return temp;
	}

	private void DownHeapify(int Parent) {
		// TODO Auto-generated method stub
		int L_C = Parent * 2 + 1;
		int R_C = Parent * 2 + 2;

		int Highest_prior_idx = Parent;
		if (L_C < Al.size() && Al.get(L_C).compareTo(Al.get(Highest_prior_idx)) > 0) {
			Highest_prior_idx = L_C;
		}
		if (R_C < Al.size() && Al.get(R_C).compareTo(Al.get(Highest_prior_idx)) > 0) {
			Highest_prior_idx = R_C;
		}
//		Recursive!!
		if (Highest_prior_idx != Parent) {
//				Swap 500 to mini_val_idx
			swap(Highest_prior_idx, Parent);
			DownHeapify(Highest_prior_idx);
		}
	}
}
