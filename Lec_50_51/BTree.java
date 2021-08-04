package Lec_50_51;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BTree {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	Node root;
	Scanner scn = new Scanner(System.in);

	public BTree() {
		// TODO Auto-generated constructor stub
		root = Cons(null, 90);

	}

	public BTree(int[] pre, int[] in) {
		root = Cons(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node Cons(int[] pre, int p_s, int p_e, int[] in, int i_s, int i_e) {
// 		BC
		if (i_s > i_e || p_s > p_e) {
			return null;
		}

//		Creating!!
		Node nn = new Node();
		nn.data = pre[p_s];
		int found = -9999;
		int num_L_E = 0;
//		Need to find my nn.data in my in order!! in = Left + nn.data + right
		for (int i = i_s; i <= i_e; i++) {
			if (nn.data == in[i]) {
				found = i;
				break;
			}
			num_L_E++;
		}

		nn.left = Cons(pre, p_s + 1, p_s + num_L_E, in, i_s, found - 1);
		nn.right = Cons(pre, p_s + num_L_E + 1, p_e, in, found + 1, i_e);

		return nn;
	}

	private Node Cons(Node parent, int child_num) {
		if (parent == null) {
			System.out.println("What is the root data ?");
		} else {
			if (child_num == 0) {
				System.out.println("What is the " + parent.data + " left child data ?");

			} else {
				System.out.println("What is the " + parent.data + " right child data ?");

			}
		}
		Node nn = new Node();
		nn.data = scn.nextInt();

		System.out.println("Does " + nn.data + " Left child exit ?");
		boolean has_lc = scn.nextBoolean();
		if (has_lc) {
			nn.left = Cons(nn, 0);
		}

		System.out.println("Does " + nn.data + " Right child exit ?");
		boolean has_rc = scn.nextBoolean();
		if (has_rc) {
			nn.right = Cons(nn, 1);
		}
		return nn;
	}

	public void Disp() {
//		System.out.println("asfdasdf");
		Disp(root);
	}

	private void Disp(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + "->" + nn.data + "<-";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);
		Disp(nn.left);
		Disp(nn.right);
	}

	public int Size() {
		return Size(root);
	}

	private int Size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int LS = Size(nn.left);
		int RS = Size(nn.right);

		return LS + RS + 1;
	}

	public int Max() {
		return Max(root);
	}

	private int Max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int Left_max = Max(nn.left);
		int Right_max = Max(nn.right);
		return Math.max(nn.data, Math.max(Left_max, Right_max));
	}

	public boolean Find(int item) {
		return Find(root, item);
	}

	private boolean Find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.data == item) {
			return true;
		}
		boolean Left_F = Find(nn.left, item);

		boolean Right_F = Find(nn.right, item);

		return Left_F || Right_F;
	}

	public int Height() {
		return Height(root);
	}

	private int Height(Node nn) {
		if (nn == null) {
			return -1;
		}
		int Left_H = Height(nn.left);
		int Right_H = Height(nn.right);
		return Math.max(Left_H, Right_H) + 1;
	}

	int max_dia = 0;

	public int Diameter() {
		Diameter1(root);
		return max_dia;
	}

	private void Diameter1(Node nn) {
		if (nn == null) {
			return;
		}
		Diameter1(nn.left);
		Diameter1(nn.right);

		int Left_H = Height(nn.left);
		int Right_H = Height(nn.right);

		int curr_dia = Left_H + Right_H + 2;
		max_dia = Math.max(curr_dia, max_dia);
		System.out.println(curr_dia);
	}

	public int Diameter2() {

		return Diameter2(root);
	}

	private int Diameter2(Node nn) {
		if (nn == null) {
			return 0;
		}
		// sp
		int D_LT = Diameter2(nn.left);
		int D_RT = Diameter2(nn.right);

		/// Self work!! Self Diameter
		int Left_H = Height(nn.left);
		int Right_H = Height(nn.right);
		int curr_dia = Left_H + Right_H + 2;

//		max_dia = Math.max(curr_dia, max_dia);
//		System.out.println(curr_dia);
		return Math.max(curr_dia, Math.max(D_LT, D_RT));
	}

	private class DH_pair {
		int Dia;
		int Ht;
	}

	public int Diameter3() {
		return Diameter3(root).Dia;
	}

	private DH_pair Diameter3(Node nn) {
		if (nn == null) {
			DH_pair null_ans = new DH_pair();
			null_ans.Ht = -1;
			null_ans.Dia = 0;
			return null_ans;
		}

//		S.P
		DH_pair left = Diameter3(nn.left);
		DH_pair right = Diameter3(nn.right);

//		 Self Work

//		Find find of the current tree from node nn
		int LH = left.Ht;
		int RH = right.Ht;

		int Curr_H = Math.max(LH, RH) + 1;
//		Find Max Diameter of the current tree from node nn
		int Curr_D = LH + RH + 2;

		int Max_D = Math.max(Curr_D, Math.max(left.Dia, right.Dia));

//		Created the object that was required wanted to return 
		DH_pair ans = new DH_pair();
		ans.Ht = Curr_H;
		ans.Dia = Max_D;
		return ans;
	}

	public boolean isBalanced() {
		return isBalanced(root);
	}

	private boolean isBalanced(Node nn) {
		if (nn == null) {
			return false;
		}
//		Self work
		int HL = Height(nn.left);
		int HR = Height(nn.right);
		System.out.println(HL + "=>" + nn.data + "<=" + HR);
		if (HL - HR <= 1 && HL - HR >= -1) {
//			Current Node is Balanced
			return isBalanced(nn.left) && isBalanced(nn.right);
		} else {
//			System.out.println(nn.data);
			return false;
		}
	}

	private class HB_pair {
		int Ht;
		boolean Bal;
	}

	public boolean isBalanced2() {
		return isBalanced2(root).Bal;
	}

	private HB_pair isBalanced2(Node nn) {
		if (nn == null) {
			HB_pair null_ans = new HB_pair();
			null_ans.Ht = -1;
			null_ans.Bal = true;
			return null_ans;
		}
//		Self work
		HB_pair ans = new HB_pair();

		HB_pair left = isBalanced2(nn.left);
		if (left.Bal == false) {
			return ans;
		}
		HB_pair right = isBalanced2(nn.right);
		if (right.Bal == false) {
			return ans;
		}
		int HL = left.Ht;
		int HR = right.Ht;

		System.out.println(HL + "=>" + nn.data + "<=" + HR);

//		Height
		ans.Ht = Math.max(HL, HR) + 1;

		if (HL - HR <= 1 && HL - HR >= -1) {
//			Current Node is Balanced
			ans.Bal = left.Bal && right.Bal;
		}
		return ans;
	}
//	public boolean FlipEq(BTree T1,BTree T2) {
//		Node roo1 = T1.root;
//		Node roo2 = T2.root;
//		
//		
//	}
//	private boolean FlipEq(Node root1, Node root2) {
//		if(root1==null && root2==null) {
//			return true;
//		}
//		if(root1==null||root2==null||root1.data!=root2.data) {
//			return false;
//		}
//		
//// if no flip 
//		boolean noflip = FlipEq(root1.left, root2.left) && FlipEq(root1.right, root2.right);
//// If there was a flip
//		if(noflip) {
//			return true;
//		}
//		boolean flip =   FlipEq(root1.left, root2.right) && FlipEq(root1.right, root2.left);
//		
//		return noflip || flip ;
//	}

	private class MaxSumPair {
		int MaxST_sum = Integer.MIN_VALUE;
		int CurrT_sum = 0;
	}

	public int Maximum_Sub_Tree_Sum() {
		return Maximum_Sub_Tree_Sum(root).MaxST_sum;
	}

	private MaxSumPair Maximum_Sub_Tree_Sum(Node nn) {

		if (nn == null) {
			MaxSumPair null_ans = new MaxSumPair();

			return null_ans;
		}
		MaxSumPair left = Maximum_Sub_Tree_Sum(nn.left);
		MaxSumPair right = Maximum_Sub_Tree_Sum(nn.right);

		MaxSumPair ans = new MaxSumPair();
		// find the curr tree sum
		ans.CurrT_sum = nn.data + left.CurrT_sum + right.CurrT_sum;

		ans.MaxST_sum = Math.max(ans.CurrT_sum, Math.max(left.MaxST_sum, right.MaxST_sum));
		return ans;
	}

	private class Iter_Node {
		Node nn;
		boolean self_d;
		boolean left_d;
		boolean right_d;

		public Iter_Node(Node nn) {
			// TODO Auto-generated constructor stub
			this.nn = nn;
		}
	}

	public void Iterative_print() {
		Stack<Iter_Node> SS = new Stack<>();
//		Iter_Node rr = new Iter_Node();
//		rr.nn = root;
		SS.add(new Iter_Node(root));
		while (!SS.isEmpty()) {
			Iter_Node curr = SS.peek();
//			BC
			if (curr.nn == null) {
				SS.pop();
				continue;
			}
//			Self Work

			if (curr.self_d == false) {
				System.out.println(curr.nn.data);
				curr.self_d = true;
			}
//			Left Call
			else if (curr.left_d == false) {
//				if child not null, dont add
				SS.add(new Iter_Node(curr.nn.left));
				curr.left_d = true;
			}
//			Right Call
			else if (curr.right_d == false) {
				SS.add(new Iter_Node(curr.nn.right));
				curr.right_d = true;
			}
//			Code is complete!!, pop the function frame!
			else {
				SS.pop();
			}

		}
	}

	private class Nodex {
		Node n;
		int x;
		public Nodex(Node o) {
			// TODO Auto-generated constructor stub
			n = o;
		}
		
		
	}

	public void VerticalOrder() {
		Queue<Nodex> Q = new LinkedList<>();
		Nodex pp = new Nodex(root);
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

		Q.add(pp);
		while (!Q.isEmpty()) {
			Nodex Curr = Q.poll();

			if (!map.containsKey(Curr.x)) {
				ArrayList<Integer> Al = new ArrayList<>();
				Al.add(Curr.n.data);
				map.put(Curr.x, Al);
			} else {
				map.get(Curr.x).add(Curr.n.data); 
				
			}
//			System.out.println(Curr.n.data + "  " + Curr.x);

			if (Curr.n.left != null) {
				Nodex left = new Nodex(Curr.n.left);
				left.x = Curr.x - 1;
				Q.add(left);
			}

			if (Curr.n.right != null) {
				Nodex right = new Nodex(Curr.n.right);
				right.x = Curr.x + 1;
				Q.add(right);
			}
		}
//		System.out.println(map);
		int min = 0;
		for(int key :map.keySet()) {
			min = Math.min(key, min);
		}
		while(map.containsKey(min)) {
			System.out.println(map.get(min));
			min++;
		}
	}
}
