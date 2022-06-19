// https://leetcode.com/problems/excel-sheet-column-title

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int tape = columnNumber;
      //  columnnumber = columnNumber/26;
        while(tape!=0){
            int stay = tape%26;
            char c = (char)(stay+64);
            sb.insert(0, c );
            
            
            tape = tape/26;
            
            
        }
        return sb.toString();
        
    }
}