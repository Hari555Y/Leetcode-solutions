// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero

class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int count =1;
        int sum = -1;
        for(int i =0; i<n/2; i++){
            ans[i] = count++;
        }
        for(int i = n/2; i<2*(n/2); i++){
            ans[i] = sum--;
        }
        return ans;
    }
}