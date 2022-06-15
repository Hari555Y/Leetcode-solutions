// https://leetcode.com/problems/remove-digit-from-number-to-maximize-result

class Solution {
    public String removeDigit(String number, char digit) {
        int n = number.length();
        int ind = -1;
        for(int i =0; i<n; i++){
            if (number.charAt(i)==digit){
                ind = i;
                if (i!= n-1 && number.charAt(i)<number.charAt(i+1)){
                    return number.substring(0, i) + number.substring(i+1,number.length());
                    
                }
                
            }
        }
        return  number.substring(0, ind) + number.substring(ind+1,number.length());
        
    }
}