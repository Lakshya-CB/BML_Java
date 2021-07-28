package QPS_Test3;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	class Node {
		int data;
		Node next;
	}

	public static void main(String[] args) {
//		Test tt = new Test();
//		Node head = tt.new Node();
//		Scanner scn = new Scanner(System.in);
//		int Size = scn.nextInt();
//		Node temp = null;
//		for (int i = 0; i < Size; i++) {
//			Node nn = tt.new Node();
//			nn.data = scn.nextInt();
//			if (i == 0) {
//				head = nn;
//				temp = nn;
//			} else {
//				temp.next = nn;
//				temp = nn;
//			}
//		}
//		Odd_Even_LL(head);
//		Form_min_num_from_Seq("DIDIDI");

		Min_Win_Size_Ss("AEBANC" ,"ABC");
	}

	public static void Odd_Even_LL(Node orj) {
		Node head_odd = orj;
		Node head_even = orj.next;

		Node odd = orj;
		Node even = orj.next;

		while (even != null && even.next != null) {
			Node next_odd = even.next;
			Node next_even = next_odd.next;

//			Join
			odd.next = next_odd;
			even.next = next_even;
//			Updating
			odd = next_odd;
			even = next_even;
		}
		odd.next = head_even;
		Disp(head_odd);
	}

	public static void Disp(Node hh) {
		while (hh != null) {
			System.out.print(hh.data + " ");
			hh = hh.next;
		}
		System.out.println();
	}

	public static void Form_min_num_from_Seq(String str) {
		int[] ans = new int[str.length()+1];
		int num = 1;
		for(int i=0;i<=str.length();i++) {
			if(i==str.length()||str.charAt(i)=='I') {
//				start filling from index i reverse
				ans[i] = num;
				num++;
				System.out.println(i);
				for(int j = i-1;j>=0 && str.charAt(j)!='I';j--) {
					ans[j] = num;
					num++;	
				}

			}
			
		}
		System.out.println(Arrays.toString(ans));
	}

	public static void Min_Win_Size_Ss(String Big, String Small) {
		int[] freq_small = new int[255];
		for(int i=0;i<Small.length();i++) {
			freq_small[Small.charAt(i)]++;
		}
		
		int[] freq_win = new int[255];
		int score =0;
		int start =0;
		int end = 0;
		
		int len_ans= Big.length();
		int start_ans =0;
		int end_ans=0;
		String ss="";
		while(true) {
			
			if(score<Small.length()&&end<Big.length()) {
//			Add your ending char in your window, Increase size
				char end_ch = Big.charAt(end);
//				Updating my Score
				if(freq_win[end_ch]<freq_small[end_ch]) {
					score++;
				}
				freq_win[end_ch]++;
				end++;
				ss = ss + end_ch;
			}
			else if(score==Small.length()) {
				if(end-start<len_ans) {
					len_ans = end-start;
					start_ans = start;
					end_ans = end;
				}
				
				
//				Remove my starting char from window and Decrease size
				char start_ch = Big.charAt(start);
//				Update of Score
				if(freq_win[start_ch]==freq_small[start_ch]) {
					score--;
				}
				freq_win[start_ch]--;
				start++;
				ss=ss.substring(1);
			}
			else if(end==Big.length()) {
				break;
			}
//			System.out.println(ss + " ; "+score);
			System.out.println(Big.substring(start,end) + " ; "+ score);
		}
		System.out.println(Big.substring(start_ans,end_ans));
		
	}


}
