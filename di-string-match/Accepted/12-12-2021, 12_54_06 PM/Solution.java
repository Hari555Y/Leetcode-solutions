// https://leetcode.com/problems/di-string-match

class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] arr = new int[n+1];
        int st =0;
        int e = n;
        for (int i =0; i<n; i++){
            if (s.charAt(i)=='I'){
                arr[i] = st;
                st++;
                
            }
            else{
                arr[i] = e;
                e--;
            }
            
        }
        arr[n] = st;
        return arr;
    }
}