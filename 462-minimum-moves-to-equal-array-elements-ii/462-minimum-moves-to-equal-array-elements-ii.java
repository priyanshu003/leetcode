class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int med = nums[nums.length/2];
        for(int val : nums) ans += Math.abs(med - val);
        return ans;
    }
}