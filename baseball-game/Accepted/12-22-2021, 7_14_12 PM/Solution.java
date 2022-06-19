// https://leetcode.com/problems/baseball-game

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        int count =0;
        for(String s : ops){
            if(s.equals("+")){
                int a = st.pop();
                int b = st.pop();
                int c= a+b;
                st.push(b);
                st.push(a);
                st.push(c);
            }
            else if(s.equals("C")){
                st.pop();
                
            }
            else if(s.equals("D")){
                int a = st.pop();
                int b = 2*a;
                st.push(a);
                st.push(b);
                
                
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        while(!st.isEmpty()){
            count+=st.pop();
        }
        return count;
        
    }
}