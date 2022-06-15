// https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter

class Solution {
    public int minTimeToType(String word) {
        int count =0;
        int prev = 'a';
        for(char c : word.toCharArray()){
            count += Math.min(Math.abs(c-prev) , Math.abs(26-(c-prev))  );
            prev = c;
            
        }
        return count + word.length();
        
        
    }
}