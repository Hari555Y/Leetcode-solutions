// https://leetcode.com/problems/ugly-number-ii

class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        if(n==1){
            return 1;
        }
        for(int i =1; i<n; i++){
            int m  = pq.poll();
            if (!pq.contains(2*m))
                pq.add(2*m);
            if (!pq.contains(3*m))
                pq.add(3*m);
            if (!pq.contains(5*m))
                pq.add(5*m);
            // System.out.println(pq.peek());
            
        }
        return pq.poll();
        
    }
}