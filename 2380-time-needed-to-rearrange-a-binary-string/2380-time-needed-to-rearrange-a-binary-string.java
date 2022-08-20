class Solution {
    public int secondsToRemoveOccurrences(String s) {
      int result=0;
        while(s.contains("01")){
            s=s.replaceAll("01","10");
            result++;
        }
        return result;
    }
}