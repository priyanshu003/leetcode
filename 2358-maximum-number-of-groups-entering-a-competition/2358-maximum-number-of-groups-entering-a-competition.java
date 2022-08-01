class Solution {
    public int maximumGroups(int[] g) {
        int c = 0;
        int i = 1;
        int ans = 0;
        while(c+i<=g.length){
            c+=i;
            i++;
            ans++;
        }
        
        return ans;
    }
}