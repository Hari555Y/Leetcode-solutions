// https://leetcode.com/problems/arranging-coins

class Solution {
    public int arrangeCoins(int n) {
        if(n==0 || n==1){
            return n;
        }
        int s = 1;
        int e = 79000;
        int ans = -1;
        while(s<=e){
            int mid =  s + (e-s)/2;
            if((((mid)*(mid+1))/2) == n){
                return mid;
            }
            else if((((mid)*(mid+1))/2) < n){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }
}