// https://leetcode.com/problems/unique-length-3-palindromic-subsequences

class Solution {
    public int countPalindromicSubsequence(String s) {
        if(s.length() <3){
            return 0;
        }
        HashSet<String> hash = new HashSet<>();
      //  int start = 0; int end = s.length()-1;
        for (int i =0; i<s.length()-2;i++){
            for (int j =2; j<s.length(); j++){
                if (s.charAt(i)==s.charAt(j)){
                    for (int k =i+1; k<j; k++){
                        String st ="";
                        st+= s.charAt(i);
                        st+=s.charAt(k);
                        st+=s.charAt(j);
                        hash.add(st);
                    }
                }
            }
        }
        return hash.size();
        
    }
}