// https://leetcode.com/problems/divide-a-string-into-groups-of-size-k

class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        String[] ans = new String[n%k==0 ? n/k : n/k +1]; 
        int count =0;
        String p = "";
        for(int i =0; i<(n%k==0 ? n : k*(n/k + 1)); i++){
            p += (i >=n ? fill :s.charAt(i));
            if (p.length()==k){
                ans[count++] = p;
                p ="";
                
            }
            
            
        }
        return ans;
            
    }
}