// https://leetcode.com/problems/merge-strings-alternately

class Solution {
    public String mergeAlternately(String w1, String w2) {
        int i =0;
        int j =0;
        String ans = "";
        boolean bool = false;
        while(i<w1.length() || j<w2.length()){
                if (bool==false){
                    if(i<w1.length())
                        ans += w1.charAt(i);
                    bool = true;
                    i++;
                }
                
                else{
                    if (j < w2.length())
                        ans += w2.charAt(j);
                    j++;
                    bool = false;      
                }
                
           //}
            
        }
        return ans;
    }
}