// https://leetcode.com/problems/first-unique-character-in-a-string

class Solution {
    public int firstUniqChar(String s) {
        int[] a = new int[26];
        for(char c : s.toCharArray()){
            a[c-'a']++;
        }
        for(int i =0; i<s.length(); i++){
            if(a[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
        
    }
}