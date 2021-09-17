package Bit_Masking;

public class Trie_client {
	public static void main(String[] args) {
		Trie T = new Trie();
		T.addWord("ant");
		T.addWord("arc");
		T.addWord("and");
		T.addWord("see");
		T.addWord("seen");
		T.addWord("sea");
		T.addWord("an");
		
//		T.dispWord();
//		T.dispTrie();
//		System.out.println(T.searchWord("se"));
		T.DelWord("see");
		T.dispWord();
		T.DelWord("seen");
		T.dispWord();
		T.dispTrie();
		
	}
}
