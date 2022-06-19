// https://leetcode.com/problems/crawler-log-folder

class Solution {
    public int minOperations(String[] logs) {
        int count =0;
        for(String s: logs){
            if(s.equals("../")){
                count--;
            }
            else if (s.equals("./")){
                continue;
            }
            else{
                count++;
            }
            if(count<0){
                count =0;
            }
            
        }
        return count;
    }
}