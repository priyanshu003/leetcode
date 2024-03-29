class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int [] res = new int[2];
        for(int i=0; i<nums.length; i++){
            int diff= target - nums[i];
            if(map.containsKey(diff)) {
                res [1] = i+1;
                res[0] = map.get(diff);
                break;
            }else{
                map.put(nums[i], i+1);
            }
        }   
        return res;
    }
}