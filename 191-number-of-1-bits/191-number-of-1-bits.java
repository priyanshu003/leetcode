public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        short sum = 0;
        while (n != 0 ) { 
            if ( (n & 1) == 1) { 
                ++sum;
            }
            n >>>= 1;        // using a logical right shift (>>>), not arithmetic (>>) because of 2's complement used by Java
        }
        
        return sum;
    }
}