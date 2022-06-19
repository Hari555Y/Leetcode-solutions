// https://leetcode.com/problems/count-binary-substrings

class Solution {
    public int countBinarySubstrings(String s) {
        int count =0;
        int sum =0;
        for(char c  : s.toCharArray()){
            if (c=='0'){
                count++;
            }
            else{
                count--;

            }
            if(count==0){
                sum++;
            }
        }
        return sum*(sum+1);
        
    }
}