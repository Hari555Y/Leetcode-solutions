// https://leetcode.com/problems/minimum-cost-to-reach-destination-in-time

class Solution {
    private final int max = (int)1e9+7;
    public int minCost(int maxtime, int[][] edges, int[] passingfees) {
        int len = passingfees.length;
        ArrayList<ArrayList<pair>> ans = new ArrayList<>();
        for (int i =0;i<len; i++){
            ans.add(new ArrayList<pair>());
            
        }
        for (int[] arr: edges){
            ans.get(arr[0]).add(new pair(arr[1],arr[2]));
            ans.get(arr[1]).add(new pair(arr[0],arr[2]));
        }
        int[][] dp = new int[maxtime+1][len];
        for (int i =0; i<=maxtime; i++){
            for (int j =0; j<len; j++){
                dp[i][j] = max;
            }
        }
        dp[0][0] = passingfees[0];
        for (int i =0; i<=maxtime;i++){
            for (int j=0; j<len; j++){
                int tep = dp[i][j];
                if (tep>=max){
                    continue;
                }
                for (pair k : ans.get(j)){
                    int b = k.time + i;
                    int nodes = k.node;
                    if(b<=maxtime){
                        dp[b][nodes] = Math.min(dp[b][nodes], tep+passingfees[nodes]);
                    }
                    
                }
            }
        }
        int answer = max;
        for (int t =0; t<=maxtime; t++){
            System.out.print(dp[t][len-1] + " ");
            answer = Math.min(answer,dp[t][len-1]);
        }
        return answer==max? -1: answer;
        
        
    }
    class pair{
        int time; int node;
        public pair(int node, int time){
            this.node = node; this.time = time;
        }
    }
}