// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced

class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for (int i =0; i<s.length();i++){
            if(s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if (!st.isEmpty() && s.charAt(i)==']' ){
                st.pop();
            }
        }
        return st.size()%2==0? st.size()/2 : (st.size()+1)/2;
        
    }
}