// https://leetcode.com/problems/maximum-number-of-removable-characters

class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int kj = 0;
        int n = removable.length;
        int[] s1 = new int[26];
        int[] p1= new int[26];
        for(char k : s.toCharArray()){
            s1[k-'a']++;
        }
        for(char k : p.toCharArray()){
            p1[k-'a']++;
        }
        for(int i =0; i<n; i++){
            int rs = s.length();
                        s1[s.charAt(removable[i])-'a']--;
            s = s.substring(0, removable[i]) + "-"+ s.substring(removable[i] +1,rs);

            
            if (cuntains(s, p)&& isposb(s1, p1)){
                kj = Math.max(kj, i+1);
            }
            else{
                break;
            }
            
        }
        return kj;
    }
    public static boolean cuntains(String s, String p){
        int i =0; int j =0;
        while(i<p.length() && j<s.length()){
            char m  = p.charAt(i);
            char g  = s.charAt(j);
            if (m==g){
                i++;
            }
            j++;
            
        }
        return  i == p.length() ? true :false;
        
    }
    
    public static boolean isposb(int[] a, int[] b){
        for(int i =0; i<26; i++){
            if(a[i]<b[i]){
                return false;
            }
            
        }
        return true;
    }
    
}