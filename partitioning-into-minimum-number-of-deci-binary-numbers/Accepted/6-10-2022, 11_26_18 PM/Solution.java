// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers

class Solution {
    public int minPartitions(String s) {
        int ans = 0;
        for(int i =0; i<s.length();i++){
            ans = Math.max(ans, Character.getNumericValue(s.charAt(i)));
        }
        return ans;
    }
}