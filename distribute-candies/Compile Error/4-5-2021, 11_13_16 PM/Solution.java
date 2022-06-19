// https://leetcode.com/problems/distribute-candies

class Solution {
    public int distributeCandies(int[] candyType) {
        int l = candyType.length;
        int half = l/2;
        HashSet<Integer> map = new HashSet<>();
        for (int i=0; i<l;i++){
            map.add(candyType[i];
        }
        return math.min(half, map.size());
        
        
        
    }
}