// https://leetcode.com/problems/maximum-number-of-removable-characters

class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
       // int kj = 0;
        int n = removable.length;
        StringBuilder sb = new StringBuilder(s);
        int st = 0;
        int e  = n-1;
        while(st<=e){
            int mid = (st) + (e-st)/2;
            for(int i =0; i<=mid; i++){
                sb.setCharAt(i, '-');
            }
            if (cuntains(sb.toString(), p)){
                st = mid+1;
            }
            else{
                e = mid;
            }
            sb = new StringBuilder(s);
            
        }
        return e;
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
    
//     public static boolean isposb(int[] a, int[] b){
//         for(int i =0; i<26; i++){
//             if(a[i]<b[i]){
//                 return false;
//             }
            
//         }
//         return true;
//     }
    
}