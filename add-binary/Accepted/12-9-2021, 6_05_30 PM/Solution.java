// https://leetcode.com/problems/add-binary

class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int m = a.length()-1;
        int n = b.length()-1;
        int carry = 0;
        while(m>=0 || n>=0){
            int num =0;
            if (m>=0){
                num = (a.charAt(m)=='1')? num+1 : num;
            }
            if (n>=0){
                num = (b.charAt(n)=='1')? num+1 : num;
            }
            num +=carry;
            if (num%2==0){
                ans = '0' + ans;
            }
            else{
                ans = '1'+ans;
                
            }
            carry = num/2;
            m--; n--;
            
        }
        if (carry >0){
            ans = '1'+ans;
        }
        return ans;
    }
}