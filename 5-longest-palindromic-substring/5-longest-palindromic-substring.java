class Solution {
    public String longestPalindrome(String s) {
         if(s.length() == 1){
          s.charAt(0);
        }
        
        boolean dp[][] = new boolean[s.length()][s.length()];
        String res = "";
        for(int g = 0;g<s.length();g++){
            for(int i = 0,j = g;j<dp.length;j++,i++){
                
                if(g== 0) {
                    dp[i][j] = true;
                }
                else if(g == 1){
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j] == true){
                  res = s.substring(i, j + 1);
                }
            }
            
        }
        return res;
    }
}