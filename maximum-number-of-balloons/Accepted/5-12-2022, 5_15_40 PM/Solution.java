// https://leetcode.com/problems/maximum-number-of-balloons

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];
        for(char c : text.toCharArray()){
            arr[c-'a']++;
        }
        return Math.min(arr['b'-'a'] , Math.min(arr['a'-'a'], Math.min(arr['l'-'a']/2 , Math.min(arr['o'-'a']/2 , arr['n'-'a']) ) ) ); 
        
    }
}