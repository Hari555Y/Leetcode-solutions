// https://leetcode.com/problems/unique-number-of-occurrences

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        HashSet<Integer> ste = new HashSet<>();
        for(int i : arr){
            hash.put(i, hash.getOrDefault(hash.get(i) , 0)+1);
        }
        for(int i : hash.values()){
            if(ste.contains(i)){
                return false;
            }
            ste.add(i);
        }
        return true;
        
    }
}