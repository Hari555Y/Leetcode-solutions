// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary

class Solution {
    public double average(int[] salary) {
        int sum =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : salary){
            sum+=i;
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        return (double)((double)(sum-max-min)/((double)salary.length-2));
        
    }
}