// https://leetcode.com/problems/excel-sheet-column-number

class Solution {
    public int titleToNumber(String columnTitle) {
        int count =0;
        int ter =0;
        int len = columnTitle.length();
        for (int i =0; i<columnTitle.length();i++){
            int rd = columnTitle.charAt(i) - 64;
            count = count + MAth.pow(26, len-1+ter)*rd;
            ter++;
        }
     //   int k = columnTitle.charAt(columnTitle.length()-1) - 64;
       // count+=k;
        return count;
    }
}