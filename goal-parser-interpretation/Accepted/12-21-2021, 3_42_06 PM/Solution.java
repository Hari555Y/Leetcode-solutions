// https://leetcode.com/problems/goal-parser-interpretation

class Solution {
    public String interpret(String command) {
        char[] arr = command.toCharArray();
        String ans ="";
        int n = command.length();
        int i =0;
        while(i<n){
            if(arr[i]=='G'){
                ans+='G';
                i++;
                
            }
            else if (arr[i]=='(' && arr[i+1]==')'){
                ans+='o';
                i+=2;
            }
            else{
                ans+="al";
                i+=4;
            }
            
        }
        return ans;
    }
}