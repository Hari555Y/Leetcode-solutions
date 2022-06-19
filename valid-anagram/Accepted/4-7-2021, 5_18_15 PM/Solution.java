// https://leetcode.com/problems/valid-anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1 = new char[s.length()];
        char[] c2 = new char[t.length()];
        if (s.length() !=t.length()){
            return false;
        }
        else{
            for (int i =0; i<s.length(); i++){
                c1[i] = s.charAt(i);
                c2[i] = t.charAt(i);
            }
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
        }
        
        
    }
}