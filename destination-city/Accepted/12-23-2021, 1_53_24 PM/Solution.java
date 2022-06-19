// https://leetcode.com/problems/destination-city

class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hash = new HashSet<>();
        for(List<String> ls : paths){
            hash.add(ls.get(1));
        }
        for(List<String> k: paths){
            hash.remove(k.get(0));
        }
        for(String s: hash){
            return s;
        }
        return "";
        
    }
}