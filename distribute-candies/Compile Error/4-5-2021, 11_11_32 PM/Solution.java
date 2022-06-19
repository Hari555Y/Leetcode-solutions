// https://leetcode.com/problems/distribute-candies

class Solution {
    public int distributeCandies(int[] candyType) {
        int l = candyType.length;
        int half = l/2;
        HashSet<int> map = new HashSet<>();
        for (int i=0; i<l;i++){
            map.add(num(i));
        }
        return min(half, set.size())
        
        
        
    }
}