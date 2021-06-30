package Lec_38;

import Lec_37.Stack;

public class Dynamic_Stack extends Stack{

	public void push(int item) throws Exception {
		if(isFull()) {
			int [] new_arr = new int[arr.length*2];
			// Copy the  stuff
			for(int i=0;i<=tos;i++) {
				new_arr[i] = arr[i]; 
			}
			arr = new_arr;
		}
		// 
//		if(isFull()) {
//			throw new Exception("Stack is Full Capacity Reached!");
//		}
//		tos++;
//		arr[tos] = item;
		super.push(item);
		
	}
}
