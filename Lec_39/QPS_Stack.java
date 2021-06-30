package Lec_39;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;

import Lec_37.Stack;
import Lec_38.Dynamic_Stack;

public class QPS_Stack {
	public static void main(String[] args) throws Exception {

//		Dynamic_Stack S = new Dynamic_Stack();
//		S.push(10);
//		S.push(20);
//		S.push(30);
//		S.push(40);
//		S.push(50);
//		S.dip();

//		Rev_Print(S);
//		S.dip();
//		System.out.println(S);
//		Actual_Rev(S);

//		S.dip();

//		int[][] arr = { { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } };
//		Celeb_finder(arr);
//		int[] arr1 = { 50, 30, 20, 40, 10, 45, 5, 60, 18 };
//		Next_Greater(arr1);

//		Min_Stack MS = new Min_Stack();
//		MS.push(10);
//		MS.push(50);
//		MS.push(40);
//		MS.push(6);
//		MS.push(45);
//		MS.push(2);
//
//		System.out.println(MS.peek() + " , min = " + MS.min);
//		MS.pop();
//
//		System.out.println(MS.peek() + " , min = " + MS.min);
//		MS.pop();
//
//		System.out.println(MS.peek() + " , min = " + MS.min);
//		MS.pop();
//
//		System.out.println(MS.peek() + " , min = " + MS.min);
//		MS.pop();
//
//		System.out.println(MS.peek() + " , min = " + MS.min);
//		MS.pop();
//
//		System.out.println(MS.peek() + " , min = " + MS.min);
//		MS.pop();
		int[] arr2 = {1,2,3,4,5,4};
		Stock_Span(arr2);
	}

	public static void Rev_Print(Stack S) throws Exception {
		if (S.isEmpty()) {
			return;
		}
		int temp = S.pop();
		Rev_Print(S);
		System.out.println(temp);
		S.push(temp);
	}

	public static void Actual_Rev(Stack S) throws Exception {
		Dynamic_Stack Ex = new Dynamic_Stack();
		// Reverse Move part1
		while (!S.isEmpty()) {
			int temp = S.pop();
			Ex.push(temp);
		}
//		S.dip();
//		Ex.dip();

		// Simply Copy!!
		Copy_Rec(S, Ex);
	}

	public static void Copy_Rec(Stack S, Stack Ex) throws Exception {
		if (Ex.isEmpty()) {
			return;
		}
		int temp = Ex.pop();
		Copy_Rec(S, Ex);
		S.push(temp);
	}

	public static void Celeb_finder(int[][] arr) throws Exception {
		Dynamic_Stack S = new Dynamic_Stack();
		for (int i = 0; i < arr.length; i++) {
			S.push(i);
		}

		while (S.size() > 1) {
//			Extract 2 people for questions
			int A = S.pop();
			int B = S.pop();

//			Does A knows B?
			if (arr[A][B] == 1) {
				// B might be a celeb!!
				S.push(B);
			} else {
//			 A does not know B that means B is surely not a Celeb!
				S.push(A);
			}
		}

//		You need to check both Row and Col of Potential Celeb
		int Candidate = S.pop();
		for (int i = 0; i < arr.length; i++) {
			// row
			if (i != Candidate) {
				if (arr[Candidate][i] == 1 || arr[i][Candidate] == 0) {
					System.out.println("No Celeb Bro!");
					return;
				}
			}
		}
		System.out.println(Candidate + " is Celeb Bro!");
		return;

	}

	public static void Next_Greater(int[] arr) throws Exception {
		Dynamic_Stack S = new Dynamic_Stack();
		for (int i = 0; i < arr.length; i++) {
			int item = arr[i];
			while (!S.isEmpty() && item > S.peek()) {
				System.out.println(S.pop() + " -> " + item);
			}
			S.push(item);
//			S.dip();
		}
		while (!S.isEmpty()) {
			System.out.println(S.pop() + " -> " + -1);

		}
	}
	// try Method 2 of Next Greater, in which you have to print next greater
	// element wise.
	// Hint : Sort indexes in your stack!!

	public static void Stock_Span(int[] Stonks) throws Exception {
		int[] All_ans = new int[Stonks.length];
		Dynamic_Stack S = new Dynamic_Stack();
		for (int i = 0; i < Stonks.length; i++) {
			int Curr_D = i;

			int Start_D = i;
			while (!S.isEmpty() && Stonks[S.peek()] <= Stonks[Curr_D]) {
				S.pop();
			}
			if (S.isEmpty()) {
				Start_D = 0;
			} else {
				Start_D = S.peek() + 1;
			}
			
			int duration_span = Curr_D - Start_D + 1;
			System.out.println(Stonks[Curr_D] + " ; "+ Curr_D + " , "+  Start_D);
			All_ans[i] = duration_span;
			
			S.push(Curr_D);
		}
		System.out.println(Arrays.toString(All_ans));
	}

}
