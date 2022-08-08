class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int max = 0 ;
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        for(int i= 1;i<n;i++){
            max = 0;
            for(int j = 0;j<i;j++){
                if(nums[j]<nums[i]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] += max;
        }
        max = 0;
        for(int v: dp) max = Math.max(max,v);
        return max;
        
        
    }
}