// https://leetcode.com/problems/mean-of-array-after-removing-some-elements

class Solution {
    public double trimMean(int[] arr) {
        int len = arr.length;
        int start = len*(int)(0.5);
        int end = arr.length - len*((int)0.5);
        double ans= 0;
        long sum =0;
        for (int i =start; i<end; i++){
            sum+=arr[i];
        }
        return (double)(sum)/(end-start);
        
    }
}