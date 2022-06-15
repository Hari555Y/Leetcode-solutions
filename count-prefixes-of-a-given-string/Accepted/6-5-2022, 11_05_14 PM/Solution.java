// https://leetcode.com/problems/count-prefixes-of-a-given-string

class Solution {
    public int countPrefixes(String[] words, String s) {
        HashSet<String> h = new HashSet<>(); 
        int n = s.length();
        for(int i =1; i<=n; i++){
            h.add(s.substring(0, i));
        }
        int  count = 0;
        for(String x  : words){
            count += h.contains(x) ? 1 : 0;
        }
        return count;
    }
}