package Bit_Masking;

import java.util.ArrayList;
import java.util.List;

public class Grey_code {
	public static void main(String[] args) {
		int n =3;
		System.out.println(grayCode(n));
		List<Integer> ans = new ArrayList<>();
		
		ans.add(0);
		ans.add(1);
		int added =2;
		for(int i=2;i<=n;i++) {
			for(int k = ans.size()-1;k>=0;k--) {
				ans.add(added+ans.get(k));
			}
			added*=2;
		}
		System.out.println(ans);
	}
// One of the ways to generate graycode;
	public static List<Integer> grayCode(int n) {
		List<Integer> ans = new ArrayList<>();
		if (n == 0) {
			ans.add(n);
			return ans;
		}
		List<Integer> list = grayCode(n - 1);
		for (int i = 0; i < list.size(); i++) {
			ans.add(list.get(i) << 1);
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			ans.add((list.get(i) << 1) + 1);
		}
		return ans;
	}

}
