class Solution {
    public int maximumBags(int[] c, int[] r, int ar) {
        
        int a[] = new int[c.length];
        for(int i = 0;i<c.length;i++){
            a[i] = c[i] - r[i];
        }
        
        Arrays.sort(a);
        int j = 0;
        while(ar != 0 && j < a.length){
            
            int x = a[j];
            a[j] -= Math.min(a[j],ar);
            ar -= Math.min(x,ar);
            j++;
        }
        
        int ans =0;
        for(int i : a){
            if(i == 0) ans++;
        }
        
        return ans;
    }
}