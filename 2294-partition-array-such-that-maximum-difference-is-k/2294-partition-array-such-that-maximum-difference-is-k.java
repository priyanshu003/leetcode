class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int mn = nums[0];
        int mx = nums[0];
        int ans = 1;
        for(int i = 1;i<nums.length;i++){
            
            mn = Math.min(mn,nums[i]);
            mx = Math.max(mx,nums[i]);
            if(mx - mn > k){
                ans++;
                mn = mx = nums[i];
            }
        }
        
        return ans;
    }
}