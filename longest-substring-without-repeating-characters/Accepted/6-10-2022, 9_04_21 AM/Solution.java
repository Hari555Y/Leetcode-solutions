// https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int len =0;
        int start =0;
        for (int e =0; e<s.length();e++){
            if(hash.containsKey(s.charAt(e))){
                start = Math.max(start, hash.get(s.charAt(e))+1 );                
                
            }
            hash.put(s.charAt(e),e);
            len = Math.max(len, e-start+1);
        }
        return len;
        
    }
}