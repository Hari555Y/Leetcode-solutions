// https://leetcode.com/problems/base-7

class Solution {
    public String convertToBase7(int num) {
        int base = 7;
        String ans = "";
        boolean bool = false;
        if(num<0){
            bool = true;
           // ans += '-';
        }
        num = Math.abs(num);
        while(num!=0){
            ans = (num%base) + ans; 
            num /=base;
        }
        return (bool)? '-' + ans : ans;
        
    }
}