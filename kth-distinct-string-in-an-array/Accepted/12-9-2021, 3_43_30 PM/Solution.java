// https://leetcode.com/problems/kth-distinct-string-in-an-array

class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> hash = new HashMap<>();
        for (String s : arr){
            hash.put(s, hash.getOrDefault(s, 0)+1);
        }
        ArrayList<String> ar = new ArrayList<>();
        for (int i =0; i<arr.length; i++){
            if (hash.get(arr[i])==1){
                ar.add(arr[i]);
            }
        }
        if( k> ar.size()){
            return "";
        }
        else{
            return ar.get(k-1);
        }
        
        
        
    }
}