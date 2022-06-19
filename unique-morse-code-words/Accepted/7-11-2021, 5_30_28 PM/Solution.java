// https://leetcode.com/problems/unique-morse-code-words

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String s:words){
            String p = "";
            for (int i =0; i<s.length();i++){
                p+=arr[s.charAt(i)-'a'];
                
            }
            set.add(p);
        }
        return set.size();
        
        
    }
}