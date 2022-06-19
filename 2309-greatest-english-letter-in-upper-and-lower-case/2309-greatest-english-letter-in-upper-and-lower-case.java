class Solution {
    public String greatestLetter(String s) {
        int [] lower = new int [26];
        int [] upper = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            int ascii = (int)(s.charAt(i));
            if(ascii <= 90 && ascii >= 65){
                upper[ascii - 65]++;
            }
          if(ascii <= 122 && ascii >= 97){
                lower[ascii - 97]++;
            }
        }
        int ans = -1;
        for(int i = 0 ; i < 26 ; i++){
            if(lower[i] != 0 && upper[i]!= 0){
                ans = i;
            }
        }
        
        if(ans != -1){
        return  String.valueOf((char)(ans+'A'));
        }
        return "";
    }
}