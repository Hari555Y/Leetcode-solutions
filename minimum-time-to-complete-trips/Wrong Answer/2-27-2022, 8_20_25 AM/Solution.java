// https://leetcode.com/problems/minimum-time-to-complete-trips

class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long s =1;
        long e = 1000000007;
        long ans = -1;
        if (time.length==1){
            ans = (long)totalTrips*(long)time[0];
            return ans;
        }
        while(s<=e){
            long mid =(s+e)/2;
            if (ct(mid, time, totalTrips)){
                ans = mid;
                e = mid-1;
                
            }
            else{
                s= mid+1;
            }
        }
        return ans;
        
    }
    public static boolean ct(long mid, int[] time, int tt){
        long c =0;
        for(int i : time){
            c += (long)(mid)/(long)i;
        }
        return (c>=(long)tt);
    }
}