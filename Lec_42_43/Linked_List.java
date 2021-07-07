package Lec_42_43;

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

	public void reverseI() {
		if (size() == 1) {
			return;
		}
		Node temp = Head;
		Node prev = Head;
		Node curr = Head.next;
		while (curr != null) {
			Node after = curr.next;
			curr.next = prev;
//			Update your pointer
			prev = curr;
			curr = after;
		}
		Head.next = null;
		Head = prev;
//		temp.next=null;
	}

	public void reverse_R1() {
		reverse_R1(Head, Head.next);
		return;
	}

	private void reverse_R1(Node prev, Node curr) {
		if (curr == null) {
			Head.next = null;
			Head = prev;
			return;
		}
		Node after = curr.next;
		curr.next = prev;
//		prev = curr;
//		curr = after;
		reverse_R1(curr, after);
	}

	public void reverse_R2() {
		reverse_R2(null, Head);
	}

	private void reverse_R2(Node prev, Node curr) {

		if (curr == null) {

			Head = prev;
			return;
		}
//		Head = curr;
		reverse_R2(curr, curr.next);
		curr.next = prev;

	}

	public void reverse_R3() {
		Node temp = Head;
		reverse_R3(Head);
		temp.next = null;
	}

	private void reverse_R3(Node curr) {
		if (curr.next == null) { // cant work when curr 5k
			Head = curr;
			return;
		}
		reverse_R3(curr.next);
		curr.next.next = curr;
	}

	public int mid() {
		Node slow = Head;
		Node fast = Head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int last_kth(int k) {
		Node slow = Head;
		Node fast = Head;
		for (int i = 1; i <= k; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}
	public void reverse_K(int k) {
		Head = reverse_K(this.Head, k);
	}
	private Node reverse_K(Node node, int k) {
		if(node ==null) {
			return null;
		}
		Node l1 = node;
		for (int i = 1; i <= k && l1!=null; i++) {
			
			l1 = l1.next;
		}
//		System.out.println(l1.data);
		Node prev = reverse_K(l1, k); // return the address of 60= 6k

		Node curr = node;
		for (int i = 1; i <= k&& curr!=null; i++) {
			Node after = curr.next;
			curr.next = prev;
			prev = curr;
			curr = after;
		}
		return prev;
	}
	public void Cylic_LL() {
		this.addLast(10);
		this.addLast(20);
		this.addLast(30);
		this.addLast(40);
		this.addLast(50);
		this.addLast(60);
		this.addLast(70);
		this.addLast(80);
		Node last = getNodeAt(size()-1);
		Node mid = getNodeAt(2);
		last.next = mid;
	}
}
