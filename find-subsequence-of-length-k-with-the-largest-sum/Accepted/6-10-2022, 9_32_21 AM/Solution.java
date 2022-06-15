// https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
     //   int sum =0;
        int[] ans = new int[k];
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)-> b.val-a.val);
        PriorityQueue<pair> pm = new PriorityQueue<>((a, b)->a.ind-b.ind);
        for(int i =0; i<n ; i++){
            pq.add(new pair(i, nums[i]));
        }
        int i =0; 
        while(i<k){
            pair m = pq.poll();
            System.out.println(m.val);
            pm.add(m);    
            i++;
        }
        
       // i =0;
        for(int s =0; s<k; s++){
            pair t = pm.poll();
            System.out.println(t.val);
            ans[s] = t.val;
        }
        return ans;
        
        
    }
}
class pair{
    int ind;
    int val;
    public pair(int ind, int val){
        this.ind = ind;
        this.val = val;
    }
}