// https://leetcode.com/problems/arranging-coins

class Solution {
    public int arrangeCoins(int n) {
        if(n==0 || n==1){
            return n;
        }
        long s = 1;
        long e = (long)n;
        long ans = -1;
        while(s<=e){
            long mid =  s + (e-s)/2;
            if((((mid)*(mid+1))/2) == n){
                return (int)mid;
            }
            else if((((mid)*(mid+1))/2) < n){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return (int)ans;
    }
}