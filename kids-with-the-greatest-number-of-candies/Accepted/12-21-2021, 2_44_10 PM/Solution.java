// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ex) {
        List<Boolean> ans = new ArrayList<>();
        int max =0;
        int n = candies.length;
        for(int i : candies){
            max= Math.max(max, i);
        }
        for(int i =0; i<n; i++){
            ans.add( (candies[i]+ex >=max)? true : false);
            }
        return ans;
        
    }
}