// https://leetcode.com/problems/validate-stack-sequences

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int l = pushed.length;
        Stack<Integer> s  = new Stack<>();
        int t =0;
        for(int i =0; i<l; i++){
            s.push(pushed[i]);
            while(!s.isEmpty() && t<l && s.peek() == popped[t]){
                s.pop();
                t++;
            }            
        }
        return s.isEmpty();
        
    }
}