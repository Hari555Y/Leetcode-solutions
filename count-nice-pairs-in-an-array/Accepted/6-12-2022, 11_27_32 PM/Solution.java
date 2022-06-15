// https://leetcode.com/problems/count-nice-pairs-in-an-array

class Solution {
    int MOD = 1000000007;
    public int rev(int n) {
        int r = 0;
        while(n>0) {
            r=r*10+n%10;
            n=n/10;
        }
        return r;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> revMap = new HashMap();
        int cnt = 0;
        for (int j=0;j<nums.length;j++) {
            int lhs = nums[j]-rev(nums[j]);
            int prevCnt = revMap.getOrDefault(lhs, 0);

            cnt += prevCnt;
            // Update count to keep it in mode
            // This is just to pass test cases, we can do at end too.
            // Which is not very clear in description.
            cnt = cnt % MOD;
            // Update counts of numbers with same (N-rev(N)) value so far.
            revMap.put(lhs, prevCnt + 1);
        }
    
        return cnt;
    }
}