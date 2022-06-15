// https://leetcode.com/problems/sort-characters-by-frequency

class Solution {
    public String frequencySort(String s) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b)-> a.freq ==b.freq ? a.c -b.c : b.freq -a.freq);
        HashMap<Character,Integer> hash = new HashMap<>();
        for(char i : s.toCharArray()){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }
        for(char c : s.toCharArray()){
            pq.add(new pair(c,hash.get(c)));
        }
      //  int[] ans = new int[s.length];
      //  int i =0;
        String st ="";
        while(pq.size()>0){
            pair m = pq.poll();
          //  ans[i++] = m.val;
            st+=m.c;
        }
        return st;
        
    }
}
class pair{
    char c;int freq;
    public pair(char c, int freq){
        this.c= c; this.freq = freq;
    }
}