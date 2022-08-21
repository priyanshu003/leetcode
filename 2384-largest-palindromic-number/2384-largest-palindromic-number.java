class Solution {
    public String largestPalindromic(String num) {
        int feq[] = new int[10];
        for(int  i = 0;i<num.length();i++){
            int v = Character.getNumericValue(num.charAt(i));
            feq[v]++;
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 9;i>0;i--){
            int x = feq[i]/2;
            for(int j = 0;j<x;j++){
                ans.append(i+"");
            }
        }
        if(ans.length()>=1){
            int x = feq[0]/2;
            for(int j = 0;j<x;j++){
                ans.append("0");
            }
        }
        String mid  = "";
        for(int i = 9;i>=0;i--){
            if(feq[i]%2 != 0){
                mid = i+"";
                break;
            }
        }
        String temp = ans.toString();
       // System.out.println(temp );
        StringBuilder ansf = new StringBuilder(temp + mid + ans.reverse());
        if(num.contains("0") && ansf.length() == 0){
            return "0";
        }
        return ansf.toString();
    }
}