package Lec_31;

public class Client_Stack {
	public static void main(String[] args) throws Exception {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.dip();
		s.push(50);
		s.dip();
		
//		s.arr= new int[3];
		
		s.pop();
		s.dip();
		

		s.pop();
		s.dip();

		s.pop();
		s.dip();

		s.pop();
		s.dip();

		s.pop();
		s.dip();

	}
}
