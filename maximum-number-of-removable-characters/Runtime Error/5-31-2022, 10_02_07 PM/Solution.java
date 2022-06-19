// https://leetcode.com/problems/maximum-number-of-removable-characters

class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int k = 0;
        int n = removable.length;
        int c =0;
        for(int i =0; i<n; i++){
            int rs = s.length();
            s = s.substring(0, removable[i]) + s.substring(removable[i] +1);
            c++;
            if (cuntains(s, p)){
                k = Math.max(c, k);
            }
            
            
        }
        return k;
    }
    public static boolean cuntains(String s, String p){
        int i =0; int j =0;
        while(i<p.length() && j<s.length()){
            char m  = p.charAt(i);
            char g  = s.charAt(j);
            if (m==g){
                i++;
               // j++;
            }
            j++;
            
        }
        return  i == p.length() ? true :false;
        
    }
    
}