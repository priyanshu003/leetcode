class Solution {
    public int minCostClimbingStairs(int[] c) {
        int n = c.length;
        int dp[]  = new int[n+1];
        dp[n] = 0;
        for(int i = n-1;i>=0;i--){
            int min = Integer.MAX_VALUE;
            for(int j = 1;j<=2 && i+j <dp.length;j++){
              //  dp[i] += c[n-1] + dp[i+j]
                min = Math.min(dp[i+j],min);
            }
            dp[i] = c[i]+min;
        }
        int ans = Math.min(dp[0],dp[1]);
        return ans;
    }
}