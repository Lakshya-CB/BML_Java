package Lec_39;

import Lec_38.Dynamic_Stack;

public class Min_Stack {
	Dynamic_Stack S = new Dynamic_Stack();
	int min = 0;

	public void push(int item) throws Exception {
		if (S.isEmpty()) {
			S.push(item);
			min = item;
			return;
		}

		if (item >= min) {
			S.push(item);
//			min is same
		} else {
//			item < min !!
//			Store same info in Stack and min ?! NO 
//			Encryption 
			int out = 2 * item - min; // out < item < min
			S.push(out);
			min = item;
		}

	}

	public int peek() {
//		S.size() >1 
		if (S.peek() >= min) {
			return S.peek();
		} else {
//			S has some wierd lower value than min!
			return min;
		}
	}

	public int pop() throws Exception {
//		Normal
		if (S.peek() >= min) {
			return S.pop();
		} else {
//		Decrypt!! 
			int out = S.pop();
//			out = 2*item- prev_min;
			int item = min;
			int prev_min = 2 * item - out;
			// Update min
			min = prev_min;

			return item;
		}
	}
}
