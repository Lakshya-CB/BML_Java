package Lec_38;

public class Client_Dynamic_Stack {
	public static void main(String[] args) throws Exception {
		Dynamic_Stack S = new Dynamic_Stack();
		S.push(10);
		S.push(20);
		S.push(30);
		S.push(40);
		S.push(50);
		S.push(60);
		S.push(70);
		S.push(80);
		S.dip();
		
		S.pop();
		S.dip();
		S.pop();
		S.dip();
		S.pop();
		S.dip();
		S.pop();
		S.dip();
		S.pop();
		S.dip();
		S.pop();
		S.dip();
		S.pop();
		S.dip();
		S.pop();
		S.dip();
		
		
	}
}
