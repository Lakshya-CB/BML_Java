package Bit_Masking;

import java.util.HashMap;

public class Trie {
	class Node {
		char ch;
		boolean end_word;
		HashMap<Character, Node> children;

		public Node(char cc) {
			// TODO Auto-generated constructor stub
			ch = cc;
			children = new HashMap<>();
		}
	}

	Node root;

	public Trie() {
		// TODO Auto-generated constructor stub
		root = new Node('*');
	}

	public void addWord(String word) {
		addWord(word, root);
		return;
	}

	private void addWord(String word, Node Curr) {
		if (word.length() == 0) {
			Curr.end_word = true;
			return;
		}
		char ch = word.charAt(0);
		String rem_word = word.substring(1);

		boolean check = Curr.children.containsKey(ch);

		if (check) {
			Node nn = Curr.children.get(ch);
			addWord(rem_word, nn);
		} else {
			Node nn = new Node(ch);
			Curr.children.put(ch, nn);
			addWord(rem_word, nn);
		}
	}
	public void dispWord() {
		dispWord(root,"");
		System.out.println();
	}
	private void dispWord(Node Curr,String word) {
		if(Curr.end_word) {
			System.out.print(word + "  ");
			
		}
		for(char ch : Curr.children.keySet()) {
			dispWord(Curr.children.get(ch),word+ch);
		}
	}
	public void dispTrie() {
		dispTrie(root,"");
	}
	private void dispTrie(Node Curr,String dpeth) {
		System.out.println(dpeth + Curr.ch + " : "+Curr.children.keySet());
		for(char ch : Curr.children.keySet()) {
			dispTrie(Curr.children.get(ch),dpeth+"\t");
		}
	}
	public boolean searchWord(String word) {
		return searchWord(root,word);
		
	}
	private boolean searchWord(Node Curr, String word) {
		if (word.length() == 0) {
			return Curr.end_word;
		}
		
		char ch = word.charAt(0);
		String rem_word = word.substring(1);

		boolean check = Curr.children.containsKey(ch);

		if (check) {
			Node nn = Curr.children.get(ch);
			return searchWord(nn,rem_word);
		} else {
			return false;
		}
	}
	public boolean searchPrefix(String word) {
		return searchPrefix(root,word);
		
	}
	private boolean searchPrefix(Node Curr, String word) {
		if (word.length() == 0) {
			return true;
		}
		
		char ch = word.charAt(0);
		String rem_word = word.substring(1);

		boolean check = Curr.children.containsKey(ch);

		if (check) {
			Node nn = Curr.children.get(ch);
			return searchPrefix(nn,rem_word);
		} else {
			return false;
		}
	}
	
	
	public void DelWord(String word) {
		DelWord(root,word);
		
	}
	private void DelWord(Node Curr, String word) {
		if (word.length() == 0) {
			Curr.end_word = false;
			return;
		}
		
		char ch = word.charAt(0);
		String rem_word = word.substring(1);

		boolean check = Curr.children.containsKey(ch);

		if (check) {
			Node nn = Curr.children.get(ch);
			DelWord(nn,rem_word);
			if(nn.children.size()==0 && !nn.end_word) {
				Curr.children.remove(ch);
			}
		} else {
			
		}
	}
}
