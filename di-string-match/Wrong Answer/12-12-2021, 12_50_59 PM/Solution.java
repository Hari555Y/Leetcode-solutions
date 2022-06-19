// https://leetcode.com/problems/di-string-match

class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] arr = new int[n+1];
        int st =0;
        int e = n;
        if (s.charAt(0)=='I'){
            arr[0] = 0;
            arr[1] = n;
            st++;
            e--;
        }
        else{
            arr[0] = n;
            arr[1] = 0;
            st++;
            e--;
        }
        for (int i =1; i<n; i++){
            if (s.charAt(i)=='I'){
                arr[i+1] = e;
                e--;
                
            }
            else{
                arr[i+1] = st;
                st++;
            }
            
        }
        //arr[n] = st;
        return arr;
    }
}