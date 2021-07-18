package Lec_45;

import java.util.Scanner;

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

}
