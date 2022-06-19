// https://leetcode.com/problems/excel-sheet-column-number

class Solution {
    public int titleToNumber(String columnTitle) {
        int count =0;
        for (int i =0; i<String.length();i++){
            int k = String[i];
            int t= k -65;
            count+=k;
        }
        return count;
    }
}