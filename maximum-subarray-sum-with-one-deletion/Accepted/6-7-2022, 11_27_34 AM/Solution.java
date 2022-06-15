// https://leetcode.com/problems/maximum-subarray-sum-with-one-deletion

class Solution {
    public int maximumSum(int[] arr) {
        int ans = arr[0];
        int with_del = 0;
        int no_del = arr[0];
        for(int i =1; i<arr.length; i++){
            with_del = Math.max(no_del , with_del  + arr[i]);   
            no_del = Math.max(no_del + arr[i] , arr[i]);
            ans = Math.max(ans , Math.max(no_del, with_del));
        }
        return ans;
        
    }
}