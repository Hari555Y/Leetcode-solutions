// https://leetcode.com/problems/count-the-number-of-consistent-strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
        for(String s: words){
            int n = s.length();
            boolean bool = true;
            for(int i =0; i<n; i++){
                if (allowed.indexOf(s.charAt(i))<0){
                    bool = false;
                    break;
                }
            }
            if(bool)
                count++;
            
        }
        return count;
        
    }
}