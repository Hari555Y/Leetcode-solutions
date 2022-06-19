// https://leetcode.com/problems/excel-sheet-column-number

class Solution {
    public int titleToNumber(String columnTitle) {
        int count =0;
        for (int i =0; i<columnTitle.length();i++){
            int k = columnTitle.charAt(i);
            int t= k -64 ;
            count= count+t+26*i;
        }
        return count;
    }
}