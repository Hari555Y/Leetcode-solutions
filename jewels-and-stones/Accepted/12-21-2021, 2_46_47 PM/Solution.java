// https://leetcode.com/problems/jewels-and-stones

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0;
        for(char c: stones.toCharArray()){
            if (jewels.indexOf(c)>=0){
                count++;
            }
        }
        return count;
        
    }
}