// https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts

class Solution {
    public String generateTheString(int n) {
        if(n==0){
            return "";
        }
        if(n==1){
           return 'a' + ""; 
        }
        if(n==3){
            return "abc";
        }
        String ans ="";
        if(n%2==0){
            for(int i =0; i<n-1; i++){
                ans+='a';
            }
            ans+='b';
            return ans;
        }
        else{
            for(int i =0; i<n-4; i++){
                ans+='a';
            }
            ans+="bcde";
            return ans;
        }
        
    }
}