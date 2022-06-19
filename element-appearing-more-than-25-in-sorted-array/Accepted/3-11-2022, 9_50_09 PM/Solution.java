// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array

class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i : arr){
            hash.put(i, hash.getOrDefault(i,0)+1);
        }
        for(int k : hash.keySet()){
            if(hash.get(k)> arr.length/4){
                return k;
            }
        }
        return -1;
        
    }
}