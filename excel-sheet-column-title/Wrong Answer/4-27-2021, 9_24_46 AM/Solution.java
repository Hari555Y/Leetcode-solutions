// https://leetcode.com/problems/excel-sheet-column-title

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int tape = columnNumber;
      //  columnnumber = columnNumber/26;
        while(tape!=0){
            int stay = columnNumber%26;
            sb.insert(0, (char)stay + 64 );
            
            
            tape = tape/26;
            
            
        }
        return sb.toString();
        
    }
}