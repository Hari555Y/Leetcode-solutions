// https://leetcode.com/problems/kth-largest-element-in-an-array

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        // for(int i : nums){
        //     pq.add(i);
        // }
        // while(pq.size()>1){
        //     pq.poll();
        // }
        Arrays.sort(nums);
      //  Arrays.reverse(nums);
        return nums[nums.length -k];
        
        
        
    }
}