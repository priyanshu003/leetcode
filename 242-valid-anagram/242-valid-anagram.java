class Solution {
    public boolean isAnagram(String s, String t) {
        int f[] = new int[26];
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            f[ch- 'a']++;
        }
        
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            f[ch- 'a']--;
        }
        
        for(int i  = 0;i<26 ;i++){
            if(f[i] != 0){
                return false;
            }
        }
        
        return true;
        
        
        
        
    }
}