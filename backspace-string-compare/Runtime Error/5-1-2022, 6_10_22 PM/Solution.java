// https://leetcode.com/problems/backspace-string-compare

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char c : s.toCharArray()){
            if (c=='#'){
                st1.pop();
            }
            else{
                st1.push(c);
            }
        }
        for(char c : t.toCharArray()){
            if (c=='#'){
                st2.pop();
            }
            else{
                st2.push(c);
            }
        }
        return st1.equals(st2);
        
    }
}