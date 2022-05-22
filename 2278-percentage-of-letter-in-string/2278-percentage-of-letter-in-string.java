class Solution {
    public int percentageLetter(String s, char l) {
        
        int c = 0;
        for(char ch : s.toCharArray()){ if(ch == l){ c++;}
        }
        double ans =  ((double)c/(double)s.length())*100;
        System.out.print(ans);
        return (int)ans;
    }
}