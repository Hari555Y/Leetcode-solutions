// https://leetcode.com/problems/number-of-dice-rolls-with-target-sum

class Solution {
    static int mod = 1000000007;
    public int numRollsToTarget(int n, int f, int target) {
        int[] ways = new int[target+1];
        ways[0] = 1;
        for(int i =1; i<=n; i++){
            for(int p =1; p<=target; p++){
                ways[p] = (ways[p]%mod + ways[p-1]%mod)%mod;
            }
            int[] new_ways = new int[target+1];
            for(int nsum =1; nsum <= target ; nsum ++){
                new_ways[nsum] = (ways[nsum-1] - (nsum-f-1 > 0 ?ways[nsum-1-f] : 0)) ;
                if(new_ways[nsum]<0){
                    new_ways[nsum] +=mod;
                }
            }
            ways = new_ways;
            
        }
        return ways[target]%mod;
        
    }
}