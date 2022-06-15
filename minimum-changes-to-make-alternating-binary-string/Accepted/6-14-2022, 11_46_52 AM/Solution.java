// https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string

class Solution {
    public int minOperations(String s) {
        int cnt1 = 0, cnt2 = 0;
        char[] p = {'0', '1'};
        for (int i = 0; i < s.length(); i++ ) {
            if (s.charAt(i) == p[i & 1]) 
                cnt1++;
            else 
                cnt2++;    
        }
        return Math.min(cnt1, cnt2);
    }

}