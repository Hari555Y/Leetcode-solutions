// https://leetcode.com/problems/mean-of-array-after-removing-some-elements

class Solution {
    public double trimMean(int[] arr) {
        int len = arr.length;
        double start = len*(0.05);
        double end = arr.length - len*(0.05);
        double ans= 0;
        long sum =0;
        for (int i =(int)start; i<(int)end; i++){
            sum+=arr[i];
        }
        return (double)(sum)/(end-start);
        
    }
}