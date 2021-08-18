package Lec_HashMap;

import java.util.ArrayList;

public class HashMap<K, V> {
	private class Node {
		K key;
		V value;
		Node next;

		public Node(K kk, V vv) {
			// TODO Auto-generated constructor stub
			key = kk;
			value = vv;
		}

		@Override
		public String toString() {
			return "{" + key + "," + value + "}";
		}
	}

	ArrayList<Node> BucketArr;
	int size;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public HashMap(int cap) {
		// TODO Auto-generated constructor stub
		BucketArr = new ArrayList<Node>();
		
		for (int i = 0; i < cap; i++) {
			BucketArr.add(null);
		}
	}

	public void put(K key, V value) {
		int bn = hashing_fn(key);
		Node temp = BucketArr.get(bn);
//		Case 1 : if Key already exists!!
		while (temp != null) {
//			if(temp.key==key) {
//			Cannot use == to compare non primitive datatype || class object
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}

//		Case 2: key does not exist ?! Add first in your Linkedlist
		temp = BucketArr.get(bn);
		Node nn = new Node(key, value);
		nn.next = temp;
		BucketArr.set(bn, nn);
		size++;

		double BucketLoad = (1.0 * size) / BucketArr.size();
		double threshold = 2;
		if (BucketLoad > threshold) {
//			REHASH!!!
			rehash();
		}
	}

	private void rehash() {
		// TODO Auto-generated method stub
		ArrayList<Node> Old_arr = BucketArr;
		ArrayList<Node> New_arr = new ArrayList<>();
//		New Bucket Array has twice the amount of buckets
		for(int i=0;i<Old_arr.size()*2;i++) {
			New_arr.add(null);
		}
//		Fresh your Hashmap
		BucketArr = New_arr;
		size=0;
//		Extract each and every pair from your Old_arr and add it in the BucketArr
		for (Node head : Old_arr) {
			Node temp = head;
			while (temp != null) {
				put(temp.key,temp.value);
				temp = temp.next;
			}
		}
	}

	public V get(K key) {
		int bn = hashing_fn(key);
		Node temp = BucketArr.get(bn);
//		Case 1 : if Key already exists!!
		while (temp != null) {
//			if(temp.key==key) {
//			Cannot use == to compare non primitive datatype || class object
			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int bn = hashing_fn(key);
		Node temp = BucketArr.get(bn);
		Node prev = null;

//		Case 1a : if Key pair is the head node!!		
		if (temp!=null&&temp.key.equals(key)) {
			BucketArr.set(bn, temp.next);
			size--;
			return temp.value;
		}

//		Case 1b : if Key already exists!!		
		while (temp != null) {
//			if(temp.key==key) {
//			Cannot use == to compare non primitive datatype || class object
			if (temp.key.equals(key)) {
//				Delete the temp node!!
				size--;
				prev.next = temp.next;
				return temp.value;
			}
			prev = temp;
			temp = temp.next;
		}
//		Case 2: doenst exist
		return null;
	}

	private int hashing_fn(K key) {
		// TODO Auto-generated method stub
		int code = key.hashCode();
		return code % BucketArr.size();// mapping to 0 to bucket size-1
	}

	public String toString() {
		String S = "";
		for (Node head : BucketArr) {
			Node temp = head;
			while (temp != null) {
				S = S + temp;
				temp = temp.next;
			}

		}
		return S;
	}

}
