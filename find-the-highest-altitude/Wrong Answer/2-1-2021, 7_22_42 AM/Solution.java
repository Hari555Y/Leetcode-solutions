// https://leetcode.com/problems/find-the-highest-altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int n =gain.length;
        int[] sumi = new int[n];
        for (int i=0; i<n; i++){
            int sum =0;
            for (int j = 0; j<=i; j++){
                sum= sum + gain[j];
            }
            sumi[i] = sum;
        }
        Arrays.sort(sumi);
        return (sumi[n-1]);
        
    }
}