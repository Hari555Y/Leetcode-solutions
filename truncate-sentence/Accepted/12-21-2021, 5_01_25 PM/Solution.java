// https://leetcode.com/problems/truncate-sentence

class Solution {
    public String truncateSentence(String s, int k) {
        String ans ="";
        int count =0;
        for(char c : s.toCharArray()){
            if(c==' '){
                count++;
                if(count >=k){
                break;
                }
                ans+=c;
            }
            else{
                ans+=c;
                
            }
            
        }
        return ans;
    }
}