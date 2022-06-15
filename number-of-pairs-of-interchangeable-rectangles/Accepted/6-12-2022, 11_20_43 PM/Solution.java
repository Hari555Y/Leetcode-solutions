// https://leetcode.com/problems/number-of-pairs-of-interchangeable-rectangles

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Integer> hash = new HashMap<>();
        for(int[] i : rectangles){
            hash.put((double)i[0]/(double)i[1]   , hash.getOrDefault((double)i[0]/(double)i[1] , 0) +1);
        }
        long ans =0L;
        for(int p : hash.values()){
            ans += ((long)p*((long)p -1L))/(long)2;
        }
        return ans;
    }
}