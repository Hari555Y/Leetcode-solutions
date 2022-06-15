// https://leetcode.com/problems/string-matching-in-an-array

class Solution {
    public List<String> stringMatching(String[] words) {
        
        int startVariable =0;
        List<String> ans = new ArrayList<>();
        
        while(startVariable <= words.length - 1){
            String firstWord = words[startVariable];
            for(int i =0; i< words.length; i++){
                String cmpWord = words[i];
                
                if(cmpWord != "1" && i != startVariable && firstWord.contains(cmpWord)){
                    ans.add(cmpWord);
                    words[i] = "1";
                }
            }
            startVariable++;
        }
        
        return ans;
    }
}