package Lec_44;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GTree {
	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children;
	}

	private Node root;

	public GTree() {
		// TODO Auto-generated constructor stub
		root = Constructor(null, -999);
	}

	public Node Constructor(Node parent, int ith) {
		Node nn = new Node();
		if (parent == null) {
			System.out.println("Input Root value");
		} else {
			System.out.println("Input the " + ith + " child of " + parent.data);

		}
		int item = scn.nextInt();
		nn.data = item;
		System.out.println("How many Children does " + item + " has ");
		int noc = scn.nextInt();

		nn.children = new ArrayList<>();

		for (int i = 0; i < noc; i++) {
			Node child = Constructor(nn, i);
			nn.children.add(child);
		}
		return nn;
	}

	public void Disp() {
		Disp(root);
		System.out.println("------------------");
	}

	private void Disp(Node node) {
//		Self work
		System.out.print(node.data + " -> ");
		for (Node child : node.children) {
			System.out.print(child.data + " ");
		}
		System.out.println();
//		Call S.P.
		for (Node child : node.children) {
			Disp(child); // Small Problems
		}
	}

	public int Size() {
		return Size(root);
	}

	private int Size(Node node) {
		int ans = 1;
//		Call S.P.
		for (Node child : node.children) {
			int size_sub_tree = Size(child); // Small Problems
//			Self work;
			ans = ans + size_sub_tree;
		}
		return ans;
	}

	public boolean Find(int ele) {
		return Find(root, ele);
	}

	private boolean Find(Node node, int ele) {
		if (node.data == ele) {
			return true;
		}
		for (Node child : node.children) {
			Boolean found_st = Find(child, ele);
//			return found_st;
			if (found_st) {
				return true;
			}
		}
		return false;
	}

	public int Height() {
		return Height(root);
	}

	private int Height(Node node) {
		int ans = 0;
		for (Node child : node.children) {
			int height_sub_trees = Height(child);
			int wrt_bp = height_sub_trees + 1;
			ans = Math.max(ans, wrt_bp);
		}
//		return ans+1; // +1 beacause your lvl is chnaged wrt BP
		return ans;
	}

	public void Reverse() {
		Reverse(root);
	}

	private void Reverse(Node node) {

		for (Node child : node.children) {
			Reverse(child); // Reverse each sub Tree;
		}
		// Reverse AL
		ArrayList<Node> Extra = new ArrayList<>();
		while (!node.children.isEmpty()) {
			Node last = node.children.remove(node.children.size() - 1);
			Extra.add(last);
		}
		node.children = Extra;
	}

	public void Lvl_traversal() {
		Queue<Node> QQ = new LinkedList<>();
		QQ.add(root);
		while (!QQ.isEmpty()) {
			Node nn = QQ.poll();
			System.out.print(nn.data + " ");
			for (Node child : nn.children) {
				QQ.add(child);
			}
		}
	}

	public void Lvl_traversal_ln() {
		Queue<Node> Curr_lvl = new LinkedList<>();
		Queue<Node> Next_lvl = new LinkedList<>();

		Curr_lvl.add(root);
		while (!Curr_lvl.isEmpty()) {
//			Work on you current lvl
			Node nn = Curr_lvl.poll();
			System.out.print(nn.data + " ");
			for (Node child : nn.children) {
				Next_lvl.add(child);
			}
			if (Curr_lvl.isEmpty()) {
				System.out.println();
				Curr_lvl = Next_lvl;
				Next_lvl = new LinkedList<GTree.Node>();
			}
		}
	}

	public void Lvl_traversal_zigzag() {
		int lvl = 0;
		Stack<Node> Curr_lvl = new Stack<>();
		Stack<Node> Next_lvl = new Stack<>();

		Curr_lvl.add(root);
		while (!Curr_lvl.isEmpty()) {
//			Work on you current lvl
			Node nn = Curr_lvl.pop();
//			Self work!!
			System.out.print(nn.data + " ");

//			Inserting My Children!
			if (lvl % 2 == 0) {
				for (Node child : nn.children) {
					Next_lvl.add(child);
				}
			}
			else {
				for(int i = nn.children.size()-1;i>=0;i--) {
					Next_lvl.add(nn.children.get(i));
				}
			}
			if (Curr_lvl.isEmpty()) {
				System.out.println();
				Curr_lvl = Next_lvl;
				Next_lvl = new Stack<>();
				lvl++;
			}
		}
	}
}
