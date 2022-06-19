// https://leetcode.com/problems/length-of-last-word

class Solution {
    public int lengthOfLastWord(String s) {
        String p = s.trim();
        int j =p.length()-1;
        int count =0;
        while(j-->0){
            if (p.charAt(j)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count+1;
        
    }
}