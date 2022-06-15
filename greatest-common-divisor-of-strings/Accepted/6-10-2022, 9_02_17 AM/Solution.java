// https://leetcode.com/problems/greatest-common-divisor-of-strings

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String s = "";
        for(int i =1; i<=str1.length(); i++){
            if (che(str1.substring(0, i) , str2) && che(str1.substring(0, i) , str1) ){
                s = str1.substring(0, i);
            }
        }
        return s;
        
        
    }
    // func to check if the str is a divisor
    public static boolean che(String a, String b){
        if(a.length()>b.length() || b.length()%a.length() != 0){
            return false;
        }
        for(int i =0; i<b.length(); i++){
            if (i<a.length()){
                if(a.charAt(i)!= b.charAt(i)){
                    return false;
                }
              //  i++;
                
            }
            else{
                if(a.charAt(i%a.length())!= b.charAt(i)){
                    return false;
                }
                
            }
        }
        return true;
    }
}