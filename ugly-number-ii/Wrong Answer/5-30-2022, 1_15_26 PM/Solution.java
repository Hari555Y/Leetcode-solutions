// https://leetcode.com/problems/ugly-number-ii

class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(3);
        pq.add(5);
        for(int i =0; i<n; i++){
            int m  = pq.poll();
            pq.add(2*m);
            pq.add(3*m); 
            pq.add(5*m);
            
        }
        return pq.poll();
        
    }
}