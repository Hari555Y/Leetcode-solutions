// https://leetcode.com/problems/xor-queries-of-a-subarray

class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefxor = new int[n];
        int[] ans = new int[n];
        for(int i =0; i<n; i++){
            prefxor[i] = arr[i] ^(i==0 ? 0 : prefxor[i-1]);
        }
        int i =0;
        for(int[] p : queries){
            int s = p[0];
            int e = p[1];
            ans[i++] = prefxor[e] ^(s==0 ? 0  : prefxor[s-1]);
            
        }
        return ans;
    }
}