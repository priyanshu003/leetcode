class Solution {
    public boolean strongPasswordCheckerII(String p) {
        
        if(p.length() < 8) return false;
        int ch1 = 0,ch2 = 0,ch3  = 0,ch4 = 0;
        for(char ch : p.toCharArray()){
            if(ch >= 'A' && ch <= 'Z') ch1++;
             if(ch >= 'a' && ch <= 'z')  ch2++;
             if(ch >= '0' && ch <= '9') ch3++;
            //!@#$%^&*()-+
            if(ch ==  '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch =='*' || ch == '(' || ch == ')' || ch == '+'|| ch == '-'){
                ch4++;
            }
        }
        
        for(int i = 1;i<p.length();i++){
            if(p.charAt(i) == p.charAt(i-1)) return false;
        }
        if(ch1 <=0 || ch2 == 0 || ch3 == 0|| ch4==0) return false;
        return true;
    }
}