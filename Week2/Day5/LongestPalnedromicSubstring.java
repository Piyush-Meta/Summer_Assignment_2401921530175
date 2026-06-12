class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String rs = new StringBuilder(s).reverse().toString();
        boolean[][] dp = new boolean[n][n]; 
         int len =0,endindex =0;
         for(int i=1 ; i<n; i++){
            for(int j =1; j<n;j++){
             if(s.charAt(i) == rs.charAt(j) && dp[i-1][j-1]) {
                dp[i][j] = true;
                len = j-i+1;
                endindex;
             }
         }
         return s.substring(endindex -len , endindex);

        }    }
