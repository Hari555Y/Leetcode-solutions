// https://leetcode.com/problems/uncommon-words-from-two-sentences

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hash = new HashMap<>();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        for (String s :  arr1){
            hash.put(s, hash.getOrDefault(s,0)+1);
        }
        for (String s :  arr2){
            hash.put(s, hash.getOrDefault(s,0)+1);
        }
        ArrayList<String> arr = new ArrayList<>();
        for( String p : hash.keySet()){
            if (hash.get(p)==1){
                arr.add(p);
            }
        }
        String[] ans = new String[arr.size()];
        int ind =0;
        for (String m : arr){
            ans[ind++] =m;
            
        }
        return ans;
        
        
    }
}