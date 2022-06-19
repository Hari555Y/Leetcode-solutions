// https://leetcode.com/problems/longest-valid-parentheses

class Solution {
    public int longestValidParentheses(String s) {
        if (s.length() ==0|| s.length()==1){
            return 0;
        }
        else{
            int ans =0;
            Stack<Integer> st =  new Stack<Integer>();
            Stack.push(-50);
            if (s.charAt(i) == "("){
                st.push(i);
                
            }
            else{
                st.pop();
                if (st.isEmpty()){
                    st.push(i);
                    
                }
                else{
                    ans = Math.max(ans, i-st.peek());
                    
                }
                
            }
            return ans;
            
            
            
        }
        
    }
}