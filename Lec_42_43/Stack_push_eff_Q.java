package Lec_42_43;

public class Stack_push_eff_Q {
	Dynamic_Queue PQ = new Dynamic_Queue();

	public void push(int item) throws Exception {
		try {
			PQ.enqueue(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Stack is full!!");
		}
	}

	public int pop() throws Exception {
		Dynamic_Queue temp_Q = new Dynamic_Queue();
		int ans = -1;
		try {
			while (PQ.size() > 1) {
				temp_Q.enqueue(PQ.dequeue());
			}
			ans = PQ.dequeue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Stack is Empty!!");
		}
		
		PQ = temp_Q;
		return ans;
	}

	public int peek() throws Exception {
		Dynamic_Queue temp_Q = new Dynamic_Queue();
		int ans = -1;
		try {
			while (PQ.size() > 1) {
				temp_Q.enqueue(PQ.dequeue());
			}
			ans = PQ.dequeue();
			temp_Q.enqueue(ans);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Stack is Empty!!");
		}
		PQ = temp_Q;
		return ans;
	}

	public void disp() throws Exception {
		disp(0);
	}

	private void disp(int n) throws Exception {
		if(n==PQ.size()) {
			return;
		}
		int temp;
		try {
			temp = PQ.dequeue();
			PQ.enqueue(temp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Stack is Empty!!");
		}
		
		disp(n+1);
		System.out.println(temp);
	}
}
