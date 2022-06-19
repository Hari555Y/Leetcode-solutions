// https://leetcode.com/problems/groups-of-special-equivalent-strings

class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> set = new HashSet<>();
        for (String r : words){
            String m = "";
            for (int i =0; i<r.length(); i+=2){
                m+=r.charAt(i);
                
            }
            String p = sort(m);
            String ms = "";
            for (int i =1; i<r.length(); i+=2){
                ms+=r.charAt(i);
                
            }
            String ps = sort(ms);
            String rt = p+ps;
            set.add(rt);
            
        }
        return set.size();
        
    }
    public String sort(String p){
        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}