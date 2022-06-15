// https://leetcode.com/problems/buddy-strings

class Solution {
    public boolean buddyStrings(String s, String goal) {
        HashSet<Character> hash = new HashSet<>();
        if (s.length() != goal.length()){
            return false;
        }
        int c =0;
        boolean bool = false;
        for(int i =0 ; i<s.length(); i++){
                if (s.charAt(i)!=goal.charAt(i)){
                    c++;
                }
                        if (hash.contains(s.charAt(i))){
                    bool = true;
                }
                hash.add(s.charAt(i));
            
            
        }
        return c==2 || (c==0 &&  bool == true); 
        
    }
}