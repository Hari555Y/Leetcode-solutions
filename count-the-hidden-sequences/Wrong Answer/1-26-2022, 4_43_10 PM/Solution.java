// https://leetcode.com/problems/count-the-hidden-sequences

class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int i: differences){
            arr.add(arr.get(arr.size()-1)+i);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int p : arr){
            min = Math.min(min, p);
            max = Math.max(max, p);
        }
        return upper-lower+1 - max + min;
        
        
    }
}