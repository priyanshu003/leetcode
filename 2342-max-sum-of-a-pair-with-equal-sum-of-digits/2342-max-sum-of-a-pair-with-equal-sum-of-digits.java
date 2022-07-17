class Solution {
       public int maximumSum(int[] nums) {
        //stores mapping of sum and the max num so far in
        //case there are 3 num with same sum
        Map<Integer, Integer> sum2maxnum = new HashMap<>();
        int max =  Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++) {
            int num = nums[i];
            int sum = 0;
            while (num>0) {
                sum += num%10;
                num /= 10;
            }
            Integer prevMax = sum2maxnum.get(sum);
            if (prevMax==null) {
                sum2maxnum.put(sum, nums[i]);
            } else {
                max = Math.max(max, prevMax+nums[i]);
                sum2maxnum.put(sum, Math.max(nums[i], prevMax));
            }
        }
        return max==Integer.MIN_VALUE? -1: max;        
    }
}