// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i =0; i<n; i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
              //  st.push(s.charAt(i));
                st.pop();
            }
            else
                st.push(s.charAt(i));
            
            
        }
        String ans  = "";
        while(!st.isEmpty()){
            ans = st.pop() + ans;
            
        }
        return ans;
        
        
    }
}