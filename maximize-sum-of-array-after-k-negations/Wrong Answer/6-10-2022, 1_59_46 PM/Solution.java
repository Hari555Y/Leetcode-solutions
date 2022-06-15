// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum =0;
        for(int i : nums){
            pq.add(i);
        }
        while(!pq.isEmpty()){
            if(k>0){
                int s = pq.poll();
                if (s<0){
                    sum +=Math.abs(s);   
                    k--;
                }
                else{
                    if (k%2==0){
                        sum+=s;
                    }
                    else
                        sum-=s;
                    k=0;
                    
                }
                
            }
            else{
                sum+=pq.poll();
                
            }
        }
        return sum;
        
        
    }
}