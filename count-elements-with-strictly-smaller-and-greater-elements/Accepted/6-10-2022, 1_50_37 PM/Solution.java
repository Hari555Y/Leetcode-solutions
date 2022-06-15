// https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements

class Solution {
    public int countElements(int[] nums) {
        int smal = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            smal = Math.min(smal ,i);
            max = Math.max(max, i);
        }
        int count =0;
        for(int i : nums){
            if( i != max && i!=smal)
                count++;
        }
        return count;
        
    }
}