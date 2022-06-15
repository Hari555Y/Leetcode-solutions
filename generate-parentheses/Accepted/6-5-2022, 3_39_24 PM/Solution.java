// https://leetcode.com/problems/generate-parentheses

class Solution {
    public List<String> generateParenthesis(int n) {
        if (n==0){
            List<String> ls = new ArrayList<>();
           // ls.add("");
            return ls;
            
        }
        if (n==1){
            List<String> ls = new ArrayList<>();
            ls.add("()");
            return ls;   
        }
        List<String> ans = new ArrayList<>();
        for(String s : generateParenthesis(n-1)){
            ans.add("(" + s + ")");
            
        }
        for(int n1 =1; n1<n ; n1++){
            int n2 = n-n1;
            List<String> a = generateParenthesis(n1-1);
            if(n1==1){
                a.add("");
            }
            List<String> b = generateParenthesis(n2);
            for(String  at: a){
                for(String bt : b){
                    ans.add("(" + at + ")" + bt);
                }
            }
            
        }
        return ans;
    }
}