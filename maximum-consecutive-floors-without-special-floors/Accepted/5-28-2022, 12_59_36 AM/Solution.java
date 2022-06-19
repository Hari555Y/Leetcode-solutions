// https://leetcode.com/problems/maximum-consecutive-floors-without-special-floors

class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int ans = special[0]- bottom;
        int n = special.length;
        for(int i =1; i<n; i++){
            ans  = Math.max(special[i] - special[i-1]-1 , ans);
            
        }
        ans = Math.max(ans, top - special[n-1]);
        return ans;
        
    }
}