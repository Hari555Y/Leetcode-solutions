// https://leetcode.com/problems/thousand-separator

class Solution {
    public String thousandSeparator(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int l = s.length();
        int c =0;
        for(int i = l-1; i>=0 ; i--){
            if (c==3){
                sb.append('.');
                c=0;
            }
            sb.append(s.charAt(i));
            c++;
        }
        return sb.reverse().toString();
    }
}