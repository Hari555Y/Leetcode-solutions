// https://leetcode.com/problems/find-resultant-array-after-removing-anagrams

class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> words2 = sortStringsInArray(words);
        int i = 0;
        
        while (i < words.length) {
            int j = i;
            
            while (j < words.length && words2.get(i).equals(words2.get(j)))
                j++;
            
            ans.add(words[i]);
            i = i != j ? j : i + 1;
        }
        
        return ans;
    }
    
    private ArrayList<String> sortStringsInArray(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            char[] arr = words[i].toCharArray();
            Arrays.sort(arr);
            ans.add(String.valueOf(arr));
        }
        
        return ans;
    }
    
}