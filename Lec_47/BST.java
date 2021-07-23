package Lec_47;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	Node root;

	public BST(int[] in) {
		// TODO Auto-generated constructor stub
		root = Constructor(in, 0, in.length - 1);

	}

	private Node Constructor(int[] in, int low, int high) {
		if (low > high) {
			return null;
		}
		int mid = (low + high) / 2;
		Node nn = new Node();
		nn.data = in[mid];

		nn.left = Constructor(in, low, mid - 1);

		nn.right = Constructor(in, mid + 1, high);

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

	public int Max() {
		Node temp = root;
		while (temp.right != null) {
			temp = temp.right;
		}
		return temp.data;
	}

	private int Max(Node nn) {
		if (nn.right == null) {
			return nn.data;
		}
		return Max(nn.right);
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}

		if (nn.data < item) {
			return find(nn.right, item);
		} else if (nn.data > item) {
			return find(nn.left, item);
		} else {
			return true;
		}

	}

	public void Print_bw(int low, int high) {
		Print_bw(root, low, high);
	}

	private void Print_bw(Node nn, int low, int high) {
		if (nn == null) {
			return;
		}
		if (nn.data < low) {
			Print_bw(nn.right, low, high);
		} else if (nn.data > high) {
			Print_bw(nn.left, low, high);
		} else {
//			 In Order!!
			Print_bw(nn.left, low, high);
//			Self Work
			System.out.println(nn.data);
			Print_bw(nn.right, low, high);
		}
	}

	static int sum = 0;

	private static void replaceMax(Node root) {
		if (root == null)
			return;
		replaceMax(root.right);
		int temp = sum;
		sum += root.data;
		root.data = temp;
		replaceMax(root.left);
	}

	public void replace_Greater() {
//		A :1 
//		sum = 0;
//		replaceMax(root);

//		A :2 _1
//		replaceSumAllGreater(root, 0);

//		A :2 _2
		replaceSumAllGreater(root, 0);

	}

	private int replaceSumAllGreater(Node parent, int sum) {
		if (parent == null) {
			return sum;
		}
		sum = replaceSumAllGreater(parent.right, sum);
		int temp = parent.data;
		parent.data = sum;
		sum += temp;
		return replaceSumAllGreater(parent.left, sum);
	}

	private int replaceGreater(Node nn, int sum) {

//		 Right Self Work and Left
		int Sum_Right = replaceGreater(nn.right, sum);

		int temp = nn.data;

		nn.data = sum + Sum_Right;

		int new_sum = temp + Sum_Right + sum;
		int Sum_left = replaceGreater(nn.left, new_sum);
		return Sum_Right + Sum_left + temp;

	}

	public void add2(int ele) {
		if (root == null) {
			Node nn = new Node();
			nn.data = ele;
			root = nn;
		} else {
			add2(root, null, ele);

		}
	}

	private void add2(Node Curr, Node Parent, int ele) {
		if (Curr == null) {

			Node nn = new Node();
			nn.data = ele;

			if (ele <= Parent.data) {
				Parent.left = nn;
			} else {
				Parent.right = nn;
			}
			return;
		}
		if (ele <= Curr.data) {
			add2(Curr.left, Curr, ele);
		} else {
			add2(Curr.right, Curr, ele);
		}
	}
	
	private Node add3 (Node Curr, int ele) {
		if(Curr==null) {
			Node nn = new Node();
			nn.data = ele;
			return nn;
		}
		
		if(Curr.data<=ele) {
			Curr.left = add3(Curr.left, ele);
		}
		else {
			Curr.right= add3(Curr.right, ele);	
		}
		return Curr;
	}
}
