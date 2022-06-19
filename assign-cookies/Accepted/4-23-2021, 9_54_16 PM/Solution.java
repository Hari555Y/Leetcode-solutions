// https://leetcode.com/problems/assign-cookies

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
  /*      String gs = "";
        String ss = "";
        int count =0;
        for (int i =0; i<s.length; i++){
            ss+=s[i];
        }
        for (int j =0; j< g.length;j++){
            gs+=g[i];
        }
        int tape = Math.min(ss.length(),gs.length());
        for (int i =0; i<tape; i++){
            
        } */
        int start =0;
        int count =0;
        int tapes=0;
        while(start<g.length && tapes<s.length){
            if (g[start]<=s[tapes]){
                count++;
                start++;tapes++;
            }
            else{
                tapes++;
            }
            
        }
        return count;
        
    }
}