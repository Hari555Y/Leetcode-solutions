// https://leetcode.com/problems/excel-sheet-column-number

class Solution {
    public int titleToNumber(String columnTitle) {
        int count =1;
        for (int i =0; i<columnTitle.length()-1;i++){
            int rd = columnTitle.charAt(i) - 64;
            count = count*(rd);
        }
        int k = columnTitle.charAt(columnTitle.length()-1) - 64;
        count+=k;
        return count;
    }
}