// https://leetcode.com/problems/excel-sheet-column-number

class Solution {
    public int titleToNumber(String columnTitle) {
        int count =0;
        for (int i =0; i<columnTitle.length()-1;i++){
            int rd = columntitle.charAt(i) - 64;
            count = count+26*(rd);
        }
        int k = columnTitle.charAt(columnTitle.length()-1) - 64;
        count+=k;
        return count;
    }
}