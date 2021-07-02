package Lec_42;

public class Linked_List {

	private class Node {
		int data;
		Node next;
	}

	Node Head;

	public void disp() {
		// O(n)
		Node temp = Head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
		System.out.println("**********************");
	}

	public int size() {
		// O(n)
		int count = 0;
		Node temp = Head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void addLast(int item) {
		// O(n)
		// create a Node of item
		Node nn = new Node();
		nn.data = item;
		if (Head == null) {
			Head = nn;
			return;
		}
		// get last Node
		Node temp = Head;
		while (temp.next != null) {
			temp = temp.next;
		}
		// Link your Last node to nn
		temp.next = nn;
	}

	public void addFirst(int item) {
		// O(1)
//		Create my node
		Node nn = new Node();
		nn.data = item;
		// Link it to Head!!!
		nn.next = Head;
		// update the Head AGAIn!!
		Head = nn;
	}

	private Node getNodeAt(int idx) {
		Node temp = Head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int item, int indx) throws Exception {
		if (indx < 0 || indx > size()) {
			throw new Exception("Bro, Incorrect Indx");
		}
		if (indx == 0) {
			addFirst(item);
		} else if (indx == size()) {
			addLast(item);
		} else {
			// new Node
			Node nn = new Node();
			nn.data = item;

			// I need to have 2 Nodex, at index inx-1 and indx
			Node n1 = getNodeAt(indx - 1);
			Node n2 = getNodeAt(indx);
//			Node n2 = n1.next;

			// link them up!!
			n1.next = nn;
			nn.next = n2;

		}
	}

	public int getFirst() throws Exception {
		// O(1)
		if (Head == null) {
			throw new Exception("Linked List is Empty!");
		}
		return Head.data;
	}

	public int getLast() throws Exception {
		// O(n)
		if (Head == null) {
			throw new Exception("Linked List is Empty!");
		}
		return getNodeAt(size() - 1).data;
	}

	public int getAt(int indx) throws Exception {
		// O(n)
		if (indx < 0 || indx >= size()) {
			throw new Exception("Bro, Incorrect Indx");
		}
		if (indx == 0) {
			return getFirst();
		} else if (indx == size() - 1) {
			return getLast();
		} else {
			return getNodeAt(indx).data;
		}
	}

	public int removeLast() throws Exception {
		// O(n)
//		Node last = getNodeAt(size()-1);
//		int ans = last.data;
//		
		if (Head == null) {
			throw new Exception("Linked List is Empty!");
		}
		if (size() == 1) {
			int ans = Head.data;
			Head = null;
			return ans;
		}
		Node prev_last = getNodeAt(size() - 2);
		int ans = prev_last.next.data;
		prev_last.next = null;

		return ans;

	}

	public int removeFirst() throws Exception {
//		O(1)
		if (Head == null) {
			throw new Exception("Linked List is Empty!");
		}
		int ans = Head.data;
		Head = Head.next;
		return ans;
	}

	public int removeAt(int indx) throws Exception {
//		O(n)
		if (indx < 0 || indx >= size()) {
			throw new Exception("Bro, Incorrect Indx");
		}
		if (indx == 0) {
			return removeFirst();
		} else if (indx == size() - 1) {
			return removeLast();
		} else {
			//
//			Node to_remove = getNodeAt(indx);
//			int ans = to_remove.data;
//
//			Node before = getNodeAt(indx - 1);
//			Node after = getNodeAt(indx + 1);
//			before.next = after;
			
			Node before = getNodeAt(indx - 1);
			int ans = before.next.data;
//			Node after = before.next.next;
//			before.next = after;
//			
			
			before.next = before.next.next;
			
			return ans;
		}
	}
}
