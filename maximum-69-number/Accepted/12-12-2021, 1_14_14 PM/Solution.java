// https://leetcode.com/problems/maximum-69-number

class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        String ans = "";
        int l = s.length();
        boolean bool = false;
        for (int i =0; i<l; i++){
            if (s.charAt(i)=='6' && bool == false){
                bool = true;
                ans+= '9';
                
            }
            else{
                ans += s.charAt(i);
            }
            
        }
        return Integer.parseInt(ans);
        
    }
}