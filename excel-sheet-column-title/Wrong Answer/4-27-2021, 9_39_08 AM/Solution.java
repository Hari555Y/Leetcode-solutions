// https://leetcode.com/problems/excel-sheet-column-title

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int tape = columnNumber;
      //  columnnumber = columnNumber/26;
        while(tape>1){
            if (tape ==26){
                int stay = 26+64;
                char c = (char)stay;
                sb.insert(0, c );
            }
            else{
                int stay = tape%26 + 64;
                char c = (char)stay;
                sb.insert(0, c );
                
            }
       //     char c = (char)stay;
            
            
            
            tape = tape/26;
            
            
        }
        return sb.toString();
        
    }
}