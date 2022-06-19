// https://leetcode.com/problems/number-of-1-bits

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String nr = Integer.toString(n);
        int t = nr.length();
        int count =0;
        for (int i=0; i<t; i++){
            if (nr.charAt(i)=='1'){
                count+=1;
            }
        }
        return count;
        
    }
}