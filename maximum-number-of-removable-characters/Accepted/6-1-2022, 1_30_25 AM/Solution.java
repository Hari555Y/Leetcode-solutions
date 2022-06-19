// https://leetcode.com/problems/maximum-number-of-removable-characters

class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
       int kj = -1;
        int n = removable.length;
        StringBuilder sb = new StringBuilder(s);
        int st = 0;
        int e  = n-1;
        while(st<=e){
            int mid = (st) + (e-st)/2;
            for(int i = 0; i<=mid; i++){
             //   System.out.println(i);
                sb.setCharAt(removable[i], '-');
            }
            System.out.println(sb);
            if (cuntains(sb.toString(), p)){
                kj = mid;
                st = mid+1;
            }
            else{
                e = mid-1;
            }
            sb = new StringBuilder(s);   
            System.out.println(e);
        }
        return kj+1;
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
    
}