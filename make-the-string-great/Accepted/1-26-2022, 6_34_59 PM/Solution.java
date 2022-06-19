// https://leetcode.com/problems/make-the-string-great

class Solution {
    public String makeGood(String s) {
        String ans = "";
        Stack<Character> st = new Stack<>();
        for(int i =0; i<s.length(); i++){
            if ( st.size()!=0 &&( (int)(st.peek()-s.charAt(i))==32 || (int)(st.peek()-s.charAt(i))==-32)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(st.size()>0 ){
            ans = st.pop() + ans;
           //return ans;
        }
        return ans;
        
    }
}