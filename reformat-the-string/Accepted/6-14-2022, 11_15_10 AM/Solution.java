// https://leetcode.com/problems/reformat-the-string

class Solution {
    public String reformat(String s) {
        int l= s.length();
       StringBuilder digits = new StringBuilder();
       StringBuilder chars = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        
        for(int i =0; i< l ;i++)
        {
            char c = s.charAt(i);
            if(c >= 48 && c<= 57)
            {
                digits.append(c);
            }
            else {
                chars.append(c);
            }
        }
        
        if(Math.abs(digits.length() - chars.length()) > 1)
        {
            return "";
        }
        int j=0; int k=0;
        if(chars.length() > digits.length())
        {
         for(int i =1; i<= l ;i++)
         {
             if(i%2==0)
             {
                 ans.append(digits.charAt(j++));
             }else {
                  ans.append(chars.charAt(k++));
             }
         }
        } else {
         for(int i =1; i<= l ;i++)
         {
             if(i%2==0)
             {
                 ans.append(chars.charAt(j++));
             }else {
                  ans.append(digits.charAt(k++));
             }
         }
        }

        return ans.toString();
    }
}