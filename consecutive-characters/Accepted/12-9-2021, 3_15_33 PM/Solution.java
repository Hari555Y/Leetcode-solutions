// https://leetcode.com/problems/consecutive-characters

class Solution {
    public int maxPower(String s) {
        int[] left = new int[s.length()];
        int[] right = new int[s.length()];
        left[0] =1;
        right[s.length()-1] =1;
        int max =0;
        int n = s.length();
        for (int i =1; i<n; i++){
            left[i] = (s.charAt(i-1)==s.charAt(i))? left[i-1]+1:1;
        }
        for (int j =0; j<n-1; j++){
            right[j] = (s.charAt(j)== s.charAt(j+1))? right[j+1]+1: 1;
        }
        for (int i =0; i<n; i++){
            max = Math.max(max, left[i]+ right[i]-1);
        }
        return max;
    }
}