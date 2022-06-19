// https://leetcode.com/problems/hamming-distance

class Solution {
    public int hammingDistance(int x, int y) {
        String k = Integer.toBinaryString(x);
        String r = Integer.toBinaryString(y);
        int count =0;
        for (int i =0; i<k.length();i++){
            if (k.charAt(i) != r.charAt(i)){
                count++;
            }
        }
        return count;
        
    }
}