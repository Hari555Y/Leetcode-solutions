// https://leetcode.com/problems/detect-capital

class Solution {
    public boolean detectCapitalUse(String word) {
        boolean bool = true;
        if (word.charAt(0)>='a' && word.charAt(0)<='z'){
            String p = word.toLowerCase();
            return p.equals(word);
        }
        else{
            String ner = word.substring(1, word.length());
            String a = ner.toLowerCase();
            String b = ner.toUpperCase();
            return ner.equals(a) || ner.equals(b);
        }
        
    }
}