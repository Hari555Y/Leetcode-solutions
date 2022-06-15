// https://leetcode.com/problems/find-the-k-beauty-of-a-number

class Solution {
    public int divisorSubstrings(int num, int k) {
        int count =0;
        String m = String.valueOf(num);
        int n = m.length();
        for(int i =0; i<=n-k ; i++){
            int t = Integer.parseInt(m.substring(i, i+k));
            if(t!=0 && num%t ==0){
                count++;
            }
            
        }
        return count;
        
    }
}