// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold

class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) {
        int n = arr.length;
        int tar = k*th;
        int sum =0;
        for(int i =0; i<k ; i++){
            sum+=arr[i];            
        }
        int c =0;
            if (sum>=tar){
                c++;
            }
        for(int i = k; i<n ; i++)
        {
            sum-=arr[i-k];
            sum+=arr[i];
            if (sum>=tar){
                c++;
            }
        }
        return c;
    }
}