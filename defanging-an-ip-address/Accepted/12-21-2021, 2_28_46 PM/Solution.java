// https://leetcode.com/problems/defanging-an-ip-address

class Solution {
    public String defangIPaddr(String address) {
        String ans ="";
        for(char c: address.toCharArray()){
            if(c!='.'){
                ans+=c;
            }
            else{
                ans+="[.]";
            }
        }
        return ans;
        
    }
}