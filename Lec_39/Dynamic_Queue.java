package Lec_39;

import Lec_38.Queue;

public class Dynamic_Queue extends Queue{
	// Override enque
	@Override
	public void enqueue(int item) throws Exception {
		if(isFull()) {
			int[] new_arr = new int[arr.length*2];
//			Copy the content !!
			for(int i=0;i<size;i++) {
				new_arr[i] = arr[(i+front)%arr.length];
			}
			front =0;
			arr=new_arr;
		}
		super.enqueue(item);
	}
	
}
