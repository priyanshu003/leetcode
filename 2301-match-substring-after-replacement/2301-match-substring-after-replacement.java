class Solution {
   public boolean matchReplacement(String s, String sub, char[][] mappings) {
        Map<Character, Set<Character>> map = new HashMap<Character, Set<Character>>();
        int m = s.length();
        int n = sub.length();
        
        for(char ch : sub.toCharArray()) {
            Set<Character> set = new HashSet<Character>();
            if(map.containsKey(ch)) {
                set = map.get(ch);
            }
            set.add(ch);

            map.put(ch, set);
        }
        
        for(char[] mapping : mappings) {
            Set<Character> set = new HashSet<Character>();
            if(map.containsKey(mapping[0])) {
                set = map.get(mapping[0]);
            }
            set.add(mapping[1]);

            map.put(mapping[0], set);
        }
        
        int i=0, j=0, p=0;
        while(i<m-n+1 && j<n) {
            if(s.charAt(p) == sub.charAt(j) || map.get(sub.charAt(j)).contains(s.charAt(p))) {
                p++; j++;
            }else{
                i++;
                p=i;
                j=0;
            }            
        }
        
        return j == n;
    }
}