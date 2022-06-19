// https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends

class Solution {
    public int minimumLength(String s) {
        if (s.charAt(0)!= s.charAt(s.length()-1)){
            return s.length();
        }
        else{
            int i =0; int j = s.length()-1;
            while(i < s.length()-1 && s.charAt(i+1)==s.charAt(i)){
                i++;
            }
            while(j >0 && s.charAt(j-1)==s.charAt(j)){
                j--;
            }
            return  i >j ? 0 : minimumLength(s.substring(i+1, j));
        }
        
    }
}