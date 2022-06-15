// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum =0;
        for(int i : nums){
            pq.add(i);
        }
        while(k>0){
            int x = pq.poll();
            pq.add(-1*x);
            k--;
        }
        while(pq.size()!=0){
            sum+=pq.poll();
        }
        return sum;
        
        
    }
}