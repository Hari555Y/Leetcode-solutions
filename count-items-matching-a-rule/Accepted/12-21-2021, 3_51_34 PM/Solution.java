// https://leetcode.com/problems/count-items-matching-a-rule

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;
        for(List<String> ls: items){
            if (ruleKey.charAt(0)=='t'){
                if(ls.get(0).compareTo(ruleValue)==0){
                    count++;
                }
                
            }
            if (ruleKey.charAt(0)=='c'){
                    if(ls.get(1).compareTo(ruleValue)==0){
                    count++;
                }
                
            }
            if (ruleKey.charAt(0)=='n'){
                    if(ls.get(2).compareTo(ruleValue)==0){
                    count++;
                }
                
            }  
        }
        return count;
        
    }
}