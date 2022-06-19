// https://leetcode.com/problems/count-the-hidden-sequences

class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int i: differences){
            arr.add(arr.get(arr.size()-1)+i);
        }
        long min = (long)Integer.MAX_VALUE;
        long max = (long)Integer.MIN_VALUE;
        for(int p : arr){
            min = (long)Math.min(min, p);
            max = (long) Math.max(max, p);
        }
        return (int)Math.max((long)0 ,(long)upper-(long)lower+1 - max + min);
        
        
    }
}