// https://leetcode.com/problems/maximum-product-after-k-increments

class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.add(i);
        }
        while(k-->0){
            int x = pq.poll();
            pq.add(x+1);
        }
        long ans = 1;
        while(pq.size()>0){
            int x = pq.poll();
            ans = (ans*(long)x)%1000000007L;
        }
        return (int)(ans%1000000007L);
        
        
    }
    
    
    /*
    a>x;
    a*(x+1)    (a+1)*x
    ax + a     ax + x
    
    */
}