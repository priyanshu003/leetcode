class Solution {
    public int edgeScore(int[] e) {
        long s[] = new long[e.length];
        
        for(int i= 0;i<e.length;i++){
            s[e[i]] += i;
        }
        
        long max = 0,ind = 0;
        
        for(int i = 0;i<s.length;i++){
            //System.out.print(+" ");
            if(max<s[i]){
                max = s[i];
                ind = i;
            }
        }
        
        return (int)ind;
    }
}