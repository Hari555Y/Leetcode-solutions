// https://leetcode.com/problems/decode-xored-array

class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] ans = new int[n+1];
        //int i =0;
        ans[0]= first;
        for(int i =1;i<=n; i++){
            ans[i] = encoded[i-1]^ans[i-1];
        }
        return ans;
        
    }
}