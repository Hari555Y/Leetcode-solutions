// https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet

class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ls = new ArrayList<>();
        for(char c  = s.charAt(0) ; c<= s.charAt(3); c++){
            for(int i =Character.getNumericValue(s.charAt(1)); i<=Character.getNumericValue(s.charAt(4)); i++){
                String p = c + String.valueOf(i);
                ls.add(p);
            }
        }
        return ls;
        
    }
}