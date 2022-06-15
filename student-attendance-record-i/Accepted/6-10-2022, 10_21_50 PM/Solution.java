// https://leetcode.com/problems/student-attendance-record-i

class Solution {
    public boolean checkRecord(String s) {
        int count =0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='A'){
                count++;
            }
            if (count>=2){
                return false;
            }
            
        }
        if (s.indexOf("LLL") !=-1){
            return false;
        }
        return true;
        
    }
}