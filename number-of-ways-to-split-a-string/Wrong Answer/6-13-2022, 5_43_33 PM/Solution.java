// https://leetcode.com/problems/number-of-ways-to-split-a-string

class Solution {
    public int numWays(String s) {
        int n = s.length();
        int c =0;
        for(int i =0; i<n ; i++){
            if (s.charAt(i)=='1'){
                c++;
                
            }
        }
        if (c%3!=0)
            return 0;
        if (c==0)
            return n-1;
        int co =0;
        int c1 = c/3;
        int c2 = c-c/3;
        long csep= 0L;
        long rcep =0L;
        for(int i =0; i<n; i++){
            if(c1==co){
                csep+=1L;     
            }
            if (c2==co){
                rcep +=1L;
            }
            if (s.charAt(i)=='1'){
                co++;
            }  
        }
        return (int)((csep*rcep)%(long)1000000007);
        
    }
}