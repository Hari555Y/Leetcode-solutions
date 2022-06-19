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
        if (sumi[n-1]<0){
            return 0;
        }
        return (sumi[n-1]);
        
    }
}