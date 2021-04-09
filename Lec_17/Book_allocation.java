package Lec_17;

import java.util.Scanner;

public class Book_allocation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while (test-- > 0) {
			int nob = scn.nextInt();
			int nos = scn.nextInt();
			int[] book = new int[nob];
			int sum_books = 0;
			
			for (int i = 0; i < nob; i++) {
				book[i] = scn.nextInt();
				sum_books = sum_books+book[i];
			}
			
			if (nob == nos) {
				System.out.println(book[nob - 1]);
			} else {
				int low = book[nob-1];
				int high = sum_books;
				int ans =0;
				while(low<=high) {
					int mid = (low+high)/2;
					if(checker(book, nos, mid)) {
						high = mid-1;
					ans = mid;
					}
					else {
						low = mid+1;
					}
				}
				System.out.println(ans);
			}
		}
	}

	public static boolean checker(int[] books,int nos, int max_pages) {
		int readed_pages  =0 ;
		int curr_book=0;
		int student =0;
		while(curr_book<books.length) {
			if(readed_pages +books[curr_book]<=max_pages) {
				readed_pages = readed_pages +books[curr_book];
				curr_book++;
			}
			else{
				student++;
				readed_pages=0;
			}
			if(student>=nos) {
				return false;
			}
		}
		return true;
	}
}
