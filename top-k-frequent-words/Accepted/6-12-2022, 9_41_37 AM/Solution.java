// https://leetcode.com/problems/top-k-frequent-words

class Solution {
    public List<String> topKFrequent(String[] nums, int k) {
        List<String> ans = new LinkedList<>();
        HashMap<String, Integer> hash = new HashMap<>();
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->a.val==b.val ? a.no.compareTo(b.no) :b.val - a.val);
        for(String i: nums){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }
        for(String p : hash.keySet()){
            pq.add(new pair(p, hash.get(p)));
        }
        int i =0;
        while(i<k){
            pair t = pq.poll();
           // ans[i] = t.no;
            ans.add(t.no);
            i++;
            
        }
        return ans;
        
    }
}
    class pair{
        String no; int val;
        public pair(String no, int val){
            this.no = no;
            this.val = val;
        }
    }

/*
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> hash = new HashMap<>();
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->b.val - a.val);
        for(int i: nums){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }
        for(int p : hash.keySet()){
            pq.add(new pair(p, hash.get(p)));
        }
        int i =0;
        while(i<k){
            pair t = pq.poll();
            ans[i] = t.no;
            i++;
            
        }
        return ans;
        
    }
    class pair{
        int no; int val;
        public pair(int no, int val){
            this.no = no;
            this.val = val;
        }
    }
}








*/