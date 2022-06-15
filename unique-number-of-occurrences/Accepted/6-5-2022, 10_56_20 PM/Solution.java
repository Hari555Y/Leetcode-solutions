// https://leetcode.com/problems/unique-number-of-occurrences

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        HashSet<Integer> ste = new HashSet<>();
        for(int i : arr){
            hash.put(i, hash.getOrDefault(i , 0)+1);
        }
        for(int p : hash.keySet()){
            System.out.println(hash.get(p));
            if(ste.contains(hash.get(p))){
                return false;
            }
            ste.add(hash.get(p));
        }
        return true;
        
    }
}