package Lec_DP;

public class Wild_card {
	public static void main(String[] args) {
		String s = "cdcbsgfsdfysdfg";
		String p = "*z";
		
		Boolean[][] dp = new Boolean [s.length()][p.length()];
        System.out.println(wildCardMatching(s,p,0,0,dp));
    }
    public static boolean wildCardMatching(String s, String p, int s_ind, int p_ind, Boolean dp[][]) {
		if (s_ind == s.length() && p_ind == p.length()) {
			return true;
		}
		if(s_ind < s.length() && p_ind == p.length()) {
			return false;
		}
		if (s_ind == s.length() && p_ind < p.length()) {
			for(int i=p_ind;i<p.length();i++) {
				if(p.charAt(i)!='*') {
					return false;
				}
			}
			return true;
		}
		if(dp[s_ind][p_ind]!=null){
            return dp[s_ind][p_ind];
        }
		if (s.charAt(s_ind) == p.charAt(p_ind) || p.charAt(p_ind) == '?') {
			dp[s_ind][p_ind] = wildCardMatching(s, p, s_ind+1, p_ind + 1, dp);
			return dp[s_ind][p_ind];
		}
		
		if (p.charAt(p_ind) == '*') {
			
			boolean sp1 = wildCardMatching(s, p, s_ind, p_ind + 1, dp);
			boolean sp2 = wildCardMatching(s, p, s_ind + 1, p_ind, dp);
			dp[s_ind][p_ind] = sp1||sp2;
			
			return sp1||sp2;
		}
		if(s.charAt(s_ind) != p.charAt(p_ind)) {
            dp[s_ind][p_ind]=false;
			return false;
		}
        return false;
	}
}