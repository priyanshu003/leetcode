class Solution {
    public int minOperations(int[] nums, int x) {
        
        int sum = 0;
      //  int i = 0,j = 0;
        for(int v : nums) sum += v;
       // public int minOperations(int[] nums, int x) {
	

	int maxLength = -1, currSum = 0;
	for (int l=0, r=0; r<nums.length; r++) {
		currSum += nums[r];
		while (l <= r && currSum > sum - x) currSum -= nums[l++];
		if (currSum == sum - x) maxLength = Math.max(maxLength, r-l+1);
	}

	return maxLength == -1 ? -1 : nums.length - maxLength;

    }
}