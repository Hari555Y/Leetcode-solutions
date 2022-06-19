// https://leetcode.com/problems/add-strings

class Solution {
    public String addStrings(String num1, String num2) {
        int carry =0;
        String ans = "";
        int i = num1.length()-1; int j = num2.length()-1;
        while(i>=0 || j>=0){
            int count =0;
            if(i>=0)
                count+=Character.getNumericValue(num1.charAt(i));
            if(j>=0)
                count+= Character.getNumericValue(num2.charAt(j));
            count +=carry;
            carry = count/10;
            count = count%10;
            ans = String.valueOf(count) + ans;
            i-- ;j--;
            
        }
        if(carry>0){
            ans  = String.valueOf(carry) + ans;
        }
        return ans;
        
    }
}