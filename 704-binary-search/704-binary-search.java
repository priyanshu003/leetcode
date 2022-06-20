class Solution {
    public int search(int[] nums, int target) {
        
        int  mid; int i = 0 , j = nums.length - 1;
        while(i <= j){
            mid = i+((j - i) >> 2);
            
            if(nums[mid] == target){
                return mid;
            }
            if(target < nums[mid]){
                j = mid -1;
            }else{
                i = mid +1;
            }
        }
        
        return -1;
        
        
    }
}