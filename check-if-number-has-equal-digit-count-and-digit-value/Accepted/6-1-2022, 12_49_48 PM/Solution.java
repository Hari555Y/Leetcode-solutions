// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value

class Solution {
    public boolean digitCount(String num) {
        int[] ar = new int[10];
        for(char c  : num.toCharArray()){
            ar[c-'0']++;
        }
        for(int i =0 ; i<num.length(); i++){
            if (ar[i] != Character.getNumericValue(num.charAt(i)))
                return false;
        }
        return true;
        
    }
}