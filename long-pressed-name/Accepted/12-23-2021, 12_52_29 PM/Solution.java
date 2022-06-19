// https://leetcode.com/problems/long-pressed-name

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i =0;
        int j =0;
        int m = name.length(); int n = typed.length();
        if(name.charAt(0) != typed.charAt(0)){
            return false;
            
        }
        while(i<m && j<n){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if (typed.charAt(j-1) == typed.charAt(j)){
                j++;
            }
            else{
                break;
            }
        }
        for(int p = j; p<n; p++){
            if(typed.charAt(p)!=typed.charAt(p-1)){
                return false;
            }
        }
        return i>=m;
        
        
        
    }
}