// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence

class Solution {
    public int isPrefixOfWord(String sentence, String sw) {
        String[] arr = sentence.split(" ");
        int  i = 1;
        for(String a  : arr){
            if (pref(a,sw)){
                return i;
            }
            i++;
        }
        return -1;
        
        
    }
    public static boolean pref(String a, String sw){
        if (sw.length()>a.length()){
            return false;
        }
        for(int i= 0; i<sw.length() ; i++){
            if(a.charAt(i) != sw.charAt(i))
                return false;
            
        }
        return true;
    }
}