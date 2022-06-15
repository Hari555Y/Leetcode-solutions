// https://leetcode.com/problems/repeated-substring-pattern

class Solution {
    public boolean repeatedSubstringPattern(String s){
        int n = s.length();
        for(int i =1; i<=n/2; i++){
            if(is_sub(s, s.substring(0, i))){
                return true;
                
            }
            
            
        }
        return false;
        
    }
    public static boolean is_sub(String a, String  b){
        int m= a.length();
        int  n = b.length();    
        if(m%n!=0){
            return false;
        }
        for(int i =0; i<m; i++){
            if(a.charAt(i) != b.charAt(i>=n ? i%n : i)){
                return false;
            }
        }
        return true;
    }
}