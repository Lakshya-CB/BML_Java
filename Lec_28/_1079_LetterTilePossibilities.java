package Lec_28;

public class _1079_LetterTilePossibilities {
	static int count = 0;
	public static void main(String[] args) {
//	"AAB"
//		int[] freq = {2,1};
//		tiles(freq,"");
		System.out.println(header("AAB"));
	}
	public static int header(String s) {
		count =0;
		int[] freq = new int[26];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)-'A']++; // at that wallet just put that element 
		}
		tiles(freq, "");
		return count-1;
	}
	public static void tiles(int [] freq, String ans) {
		count++;
//		System.out.println(ans);// exists in every level
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) { // char exist in its respective wallet
				// select that char
				freq[i]=freq[i]-1;
				tiles(freq, ans+ (char)(i+'A'));
				freq[i]=freq[i]+1;
			}
		}
	}
}
