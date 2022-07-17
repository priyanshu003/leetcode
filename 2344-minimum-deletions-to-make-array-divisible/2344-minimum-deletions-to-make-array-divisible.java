class Solution {
    public static int minOperations(int[] nums, int[] a) {
        
        int gcd = findGCD(a,a.length);
        Arrays.sort(nums);
        int c = 0;
        if(nums[0]>gcd)return -1;
        for(int i = 0;i<nums.length;i++){
            if(gcd%nums[i] == 0){
                break;
            }else{
                c++;
            }
        }
        if(c == nums.length){
            return -1;
        }
        return c;
    }
    
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}