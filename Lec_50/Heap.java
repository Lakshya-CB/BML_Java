package Lec_50;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> Al = new ArrayList<>();;
	
	public void Disp() {
		System.out.println(Al);
	}
	public void add(int ele) {
		Al.add(ele);
//		 Also maintain the COndition of Priority ?
		Upheapify(Al.size()-1);
	}
	
	private void Upheapify(int child) {
		// TODO Auto-generated method stub
		int parent = (child-1)/2;
		if(Al.get(parent)>Al.get(child)) {
//			Swap 
			swap(child, parent);
			Upheapify(parent);
		}
	}
	private void swap(int i, int j) {
		int temp = Al.get(i);
		Al.set(i, Al.get(j));
		Al.set(j, temp);
	}
	public int poll() {
		int temp = Al.get(0);
//		Swap from 0 to size -1
		swap(0,Al.size()-1);
//		Delete Last node
		Al.remove(Al.size()-1);
		
		DownHeapify(0);
		
		return temp;
	}
	private void DownHeapify(int Parent) {
		// TODO Auto-generated method stub
		int L_C = Parent*2+1;
		int R_C = Parent*2+2;
		
		int mini_val_idx = Parent;
		if(L_C<Al.size()&&Al.get(L_C)<Al.get(mini_val_idx)) {
			mini_val_idx = L_C;
		}
		if(R_C<Al.size()&&Al.get(R_C)<Al.get(mini_val_idx)) {
			mini_val_idx = R_C;
		}
//		Recursive!!
		if(mini_val_idx!=Parent) {
//				Swap 500 to mini_val_idx
			swap(mini_val_idx, Parent);
			DownHeapify(mini_val_idx);
		}
	}
}
