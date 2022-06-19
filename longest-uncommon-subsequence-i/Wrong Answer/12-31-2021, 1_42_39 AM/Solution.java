// https://leetcode.com/problems/longest-uncommon-subsequence-i

class Solution {
    public int findLUSlength(String a, String b) {
        int[] arr = new int[26];
        int[] brr = new int[26];
        for(char c : a.toCharArray()){
            arr[c-'a']++;
        }
        for(char c : b.toCharArray()){
            brr[c-'a']++;
        }
        int ans = 0;
        int ans2 =0;
        for(int i =0; i<26; i++){
            if (arr[i]-brr[i]>0){
                ans += arr[i]-brr[i];
            }
        }
        for(int i =0; i<26; i++){
            if (brr[i]-arr[i]>0){
                ans2 += brr[i]-arr[i];
            }
        }
        if(ans==0 && ans2==0){
            return -1;
        }
        return Math.min(ans, ans2);
        
        
    }
}