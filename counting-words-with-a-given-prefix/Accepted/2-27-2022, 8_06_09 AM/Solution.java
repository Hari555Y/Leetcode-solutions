// https://leetcode.com/problems/counting-words-with-a-given-prefix

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count =0;
        for(String i :  words){
            count+=f(i,pref);
        }
        return count;
    }
    public static int f(String i , String j){
        if (i.length()<j.length()){
            return 0;
        }
        else{
            boolean bool = true;
            for(int p =0; p<j.length();p++){
                if(i.charAt(p)!=j.charAt(p)){
                    bool = false;
                    break;
                    
                }
                
            }
            if(bool){
                return 1;
            }
            return 0;
        }
        
    }
}