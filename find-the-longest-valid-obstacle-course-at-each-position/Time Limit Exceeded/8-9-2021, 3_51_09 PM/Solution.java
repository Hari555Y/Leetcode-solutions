// https://leetcode.com/problems/find-the-longest-valid-obstacle-course-at-each-position

class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int len = obstacles.length;
        int[] dp = new int[len];
        //Arrays.fill(dp,1);
        dp[0]=1;
        for (int i=1; i<len;i++){
            int ans = -1;
            for (int j =i-1; j>=0; j--){
                if(obstacles[j]<=obstacles[i]){
                    ans =Math.max(dp[j], ans);
                }
            }
            System.out.println(ans);
            if(ans!=-1){
                dp[i]=ans+1;
            }
            else{
                dp[i]=1;
            }
        }
        return dp;
    }

}