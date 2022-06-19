// https://leetcode.com/problems/two-furthest-houses-with-different-colors

class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int ans = -1;
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if (colors[i]!=colors[j])
                    ans = Math.max(ans, j-i);
            }
        }
        return ans;
    }
}