// https://leetcode.com/problems/rank-transform-of-an-array

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i : arr){
            hash.add(i);
        }
        ArrayList<Integer> ar= new ArrayList<>(hash);
        Collections.sort(ar);
        for(int i =0; i<arr.length; i++){
            arr[i] = Collections.binarySearch(ar,arr[i])+1;
            
        }
        return arr;
    }
}