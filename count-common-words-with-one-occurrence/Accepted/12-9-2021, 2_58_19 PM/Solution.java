// https://leetcode.com/problems/count-common-words-with-one-occurrence

class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hash = new HashMap<>();
        HashMap<String,Integer> map = new HashMap<>();
        for (String s :  words1){
            hash.put(s, hash.getOrDefault(s,0)+1);
        }
        for (String p:  words2){
            map.put(p, map.getOrDefault(p,0)+1);
        }
        int count =0;
        for (String m : hash.keySet() ){
            if(hash.get(m)==1 && map.get(m)!=null&& map.get(m)==1)
                count++;
        }
        return count;
        
    }
}