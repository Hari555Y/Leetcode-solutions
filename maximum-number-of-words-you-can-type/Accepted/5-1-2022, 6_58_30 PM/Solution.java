// https://leetcode.com/problems/maximum-number-of-words-you-can-type

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int count =0;
        for(String s : arr){
            boolean bool = false;
            for(char c : s.toCharArray()){
                if(brokenLetters.indexOf(c) >= 0){
                    bool = true;
                    break;
                }
            }
            if(bool == false){
                count++;
            }
        }
        return count;
        
    }
}