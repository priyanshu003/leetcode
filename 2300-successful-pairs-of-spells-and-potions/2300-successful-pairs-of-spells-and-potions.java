class Solution {
    public int[] successfulPairs(int[] s, int[] p, long scs) {
        Arrays.sort(p);
        int ans[] = new int[s.length];
        for(int i = 0;i<s.length;i++){
            int l = 0,r= p.length;
           
            
            while(l <  r){
                int mid = (r+l)/2;
                long x = s[i]*p[mid];
                if(1L*s[i]*p[mid] <scs){
                    l = mid +1;
                }else{
                    r = mid;
                }
                
            }
            ans[i] = p.length - l ;
        }
        
        return ans;
    }
}