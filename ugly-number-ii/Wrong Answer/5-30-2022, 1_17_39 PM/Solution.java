// https://leetcode.com/problems/ugly-number-ii

class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        for(int i =0; i<n+1; i++){
            int m  = pq.poll();
            pq.add(2*m);
            pq.add(3*m); 
            pq.add(5*m);
            
        }
        return pq.poll();
        
    }
}