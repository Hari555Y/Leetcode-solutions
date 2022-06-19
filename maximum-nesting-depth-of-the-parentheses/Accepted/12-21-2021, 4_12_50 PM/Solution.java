// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses

class Solution {
    public int maxDepth(String s) {
        int count =0;
        int ans=0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            ans = Math.max(count,ans);
        }
        return ans;
        
    }
}