// https://leetcode.com/problems/determine-if-string-halves-are-alike

class Solution {
    public boolean halvesAreAlike(String s) {
        int l = s.length()/2;
        if (countvowel(s.substring(0,l).toLowerCase()) == countvowel(s.substring(l,s.length()).toLowerCase())){
            return true;
        }
        return false;
    }
    public int countvowel(String k){
        int count = 0; 
        for (int i =0; i<k.length(); i++){
            if (k.charAt(i) == 'a' || 'e' || 'i' || 'o' || 'u'){
                count+=1;
            }
        }
        return count;
    }
}