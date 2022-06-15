// https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        List<Integer> elementIndex=new ArrayList<Integer>();
        if(s1.length()!=s2.length())
            return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                elementIndex.add(i);
                if(elementIndex.size()>2)return false;
            }
        }   
        return (elementIndex.size()==0) ||
            (elementIndex.size()==2) && 
            s1.charAt(elementIndex.get(0))== s2.charAt(elementIndex.get(1)) 
            && s1.charAt(elementIndex.get(1))== s2.charAt(elementIndex.get(0));
    }
}