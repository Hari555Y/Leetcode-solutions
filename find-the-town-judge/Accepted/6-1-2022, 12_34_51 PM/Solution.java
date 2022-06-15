// https://leetcode.com/problems/find-the-town-judge

class Solution {
    public int findJudge(int n, int[][] trust) {
        int truster[] = new int[n+1];
        int trustee[] = new int[n+1];
        for(int[] as : trust){
            truster[as[0]]++;
            trustee[as[1]]++;
        }
        for(int i =1; i<=n; i++){
            if(truster[i] == 0 && trustee[i] == n-1){
                return i;
            }
        }
        return -1;
        
    }
}