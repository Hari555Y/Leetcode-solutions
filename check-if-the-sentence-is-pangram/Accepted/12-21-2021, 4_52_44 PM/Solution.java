// https://leetcode.com/problems/check-if-the-sentence-is-pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        for(char c: sentence.toCharArray()){
            arr[c-'a']++;
        }
        boolean bool = true;
        for(int i =0; i<26; i++){
            if (arr[i]==0){
                bool = false;
                break;
            }
        }
        return bool;
    }
}