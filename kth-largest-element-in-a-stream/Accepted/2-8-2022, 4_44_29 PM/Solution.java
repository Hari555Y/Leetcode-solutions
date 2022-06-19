// https://leetcode.com/problems/kth-largest-element-in-a-stream

class KthLargest {
    PriorityQueue<Integer> pq;

    int p;
    public KthLargest(int k, int[] nums) {
        p = k;
        pq = new PriorityQueue<>();
        for(int i : nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>p){
            pq.poll();
        }
        return pq.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */