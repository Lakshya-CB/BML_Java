package Lec_42_43;

public class Client_Adapter {
	public static void main(String[] args) throws Exception {
		Stack_push_eff_Q  Stack =new  Stack_push_eff_Q();
		Stack.push(10);
		Stack.push(20);
		Stack.push(30);
		Stack.push(40);
//		Stack.disp();
		Stack.pop();
		Stack.disp();
		Stack.pop();
		Stack.pop();
		Stack.pop();
		Stack.pop();
		
		
		
	}
}
