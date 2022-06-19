// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping

class Solution {
    public String freqAlphabets(String s) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if ( c== '#'){
                int p = dq.removeLast();
                int r = dq.removeLast();
                dq.addLast(10*r+ p);
            }
            else{
                dq.addLast(Character.getNumericValue(c));
            }
        }
        String ans = "";
        for(int i :  dq){
            ans+=(char)(i + 'a'-1);
            
        }
        return ans;
    }
}