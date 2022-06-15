// https://leetcode.com/problems/sort-array-by-increasing-frequency

class Solution {
    public int[] frequencySort(int[] nums) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b)-> a.freq==b.freq ? b.val-a.val : a.freq -b.freq);
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i : nums){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }
        for(int i : nums){
            pq.add(new pair(i,hash.get(i)));
        }
        int[] ans = new int[nums.length];
        int i =0;
        while(pq.size()>0){
            pair m = pq.poll();
            ans[i++] = m.val;
        }
        return ans;
        
    }
}
class pair{
    int val;int freq;
    public pair(int val, int freq){
        this.val = val; this.freq = freq;
    }
}