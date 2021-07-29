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

	public void add3(int ele) {
		root = add3(root, ele);
	}

	private Node add3(Node Curr, int ele) {
		if (Curr == null) {
			Node nn = new Node();
			nn.data = ele;
			return nn;
		}

		if (ele <= Curr.data) {
			Curr.left = add3(Curr.left, ele);
		} else {
			Curr.right = add3(Curr.right, ele);
		}
		return Curr;
	}

	public void remove(int item) {
		if (item == root.data) {
			if (root.left == null && root.right == null) {
				root = null;
			} else if (root.left != null && root.right == null) {
				root = root.left;
			} else if (root.left == null && root.right != null) {
				root = root.right;
			}
		} else {
			remove(root, null, item);
		}
	}

	private void remove(Node Curr, Node Parent, int item) {

		if (item < Curr.data) {
			remove(Curr.left, Curr, item);
		} else if (item > Curr.data) {
			remove(Curr.right, Curr, item);
		} else {
//			Curr.data === item
//			This is the Node to remove

//			Case 1: Curr Node is a Leaf Node
			if (Curr.left == null && Curr.right == null) {
//				 Which connection from Parent to Curr
//				if(Curr.data<Parent.data) {
				if (Parent.left.data == item) {
					Parent.left = null;
				} else {
					Parent.right = null;
				}
			}
//			Case 2 : When your Curr Node has a Single Child!

//			Case 2 a : When Your Curr Node have left 
			else if (Curr.left != null && Curr.right == null) {
				if (Parent.left.data == Curr.data) {
					Parent.left = Curr.left;
				} else {
					Parent.right = Curr.left;
				}
			}
//			Case 2 b : When Your Curr Node have right 
			else if (Curr.left == null && Curr.right != null) {
				if (Parent.left.data == Curr.data) {
					Parent.left = Curr.right;
				} else {
					Parent.right = Curr.right;
				}
			}
//			Case 3 : When your Curr Node has both children  
//			I actually Updated the Node data
			else {
				int Max_LST = Max(Curr.left);
				Curr.data = Max_LST;
				remove(Curr.left, Curr, Max_LST);
			}
		}
	}

	public void remove3(int item) {
		root = remove3(root, item);

	}

	private Node remove3(Node Curr, int item) {
		if (item < Curr.data) {
			Curr.left = remove3(Curr.left, item);

		} else if (item > Curr.data) {
			Curr.right = remove3(Curr.right, item);

		} else {
//			Curr is the Node that you have to remove
			if (Curr.left == null && Curr.right == null) {
				return null;
			}
//			Case 2 : When your Curr Node has a Single Child!

//			Case 2 a : When Your Curr Node have left 
			else if (Curr.left != null && Curr.right == null) {
				return Curr.left;

			}
//			Case 2 b : When Your Curr Node have right 
			else if (Curr.left == null && Curr.right != null) {
				return Curr.right;
			}
//			Case 3 : When your Curr Node has both children  
//			I actually Updated the Node data
			else {
				int Max_LST = Max(Curr.left);
				Curr.data = Max_LST;
				Curr.left = remove3(Curr.left, Max_LST);
				return Curr;
			}
		}
		return Curr;
	}

	public boolean isBST() {
//		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		return isBST2(root).isBST;
	}

	private boolean isBST(Node curr, int min, int max) {
		if (curr == null)
			return true;
		if (curr.data < min || curr.data > max)
			return false;
		else {
			boolean flag = isBST(curr.left, min, curr.data);
			if (flag == false)
				return flag;
			return isBST(curr.right, curr.data, max);
		}
	}

	private class Mx_Mn_isBST {
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		int Largest_Size_BST = 0;
		int Largest_BST_root_val = 0;
		boolean isBST = true;
	}

	private Mx_Mn_isBST isBST2(Node Curr) {
		if (Curr == null) {

			return new Mx_Mn_isBST();
		}

		Mx_Mn_isBST left = isBST2(Curr.left);
		Mx_Mn_isBST right = isBST2(Curr.right);

		Mx_Mn_isBST ans = new Mx_Mn_isBST();

		if (Curr.data >= left.Max && Curr.data < right.Min && left.isBST && right.isBST) {
			ans.isBST = true;
			ans.Largest_Size_BST = left.Largest_Size_BST + right.Largest_Size_BST + 1;
			ans.Largest_BST_root_val = Curr.data;
		} else {
			ans.isBST = false;
			if (left.Largest_Size_BST > right.Largest_Size_BST) {
				ans.Largest_Size_BST = left.Largest_Size_BST;
				ans.Largest_BST_root_val = left.Largest_BST_root_val;
			} else {
				ans.Largest_Size_BST = right.Largest_Size_BST;
				ans.Largest_BST_root_val = right.Largest_BST_root_val;
			}
		}
		ans.Max = Math.max(Math.max(left.Max, right.Max), Curr.data);
		ans.Min = Math.min(Math.min(left.Min, right.Min), Curr.data);
		System.out.println(Curr.data + " ; Max = " + ans.Max + " ; Min = " + ans.Min);
		return ans;

	}

}