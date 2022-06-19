// https://leetcode.com/problems/minimum-time-to-complete-trips

class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int s =1;
        int e = 99999;
        int ans = -1;
        if (time.length==1){
            ans = totalTrips/time[0];
            return ans;
        }
        while(s<=e){
            int mid =(s+e)/2;
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
    public static boolean ct(int mid, int[] time, int tt){
        int c =0;
        for(int i : time){
            c += (mid)/i;
        }
        return (c>=tt);
    }
}