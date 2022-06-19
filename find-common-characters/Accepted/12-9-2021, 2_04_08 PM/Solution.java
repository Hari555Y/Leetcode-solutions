// https://leetcode.com/problems/find-common-characters

class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<String, Integer> hash = new HashMap<>();
        for(int i=0; i<words[0].length(); i++){
            hash.put(words[0].charAt(i)+"", hash.getOrDefault(words[0].charAt(i)+"",0)+1);
            
        
        }
        for(int p =1; p<words.length; p++){
            String s = words[p];
            HashMap<String,Integer> piro = new HashMap<>();
            for (int i =0; i<s.length() ; i++){
                if (hash.containsKey(s.charAt(i)+ "")){
                    piro.put(s.charAt(i) + "", piro.getOrDefault(s.charAt(i) + "",0)+1);
                    hash.put(s.charAt(i)+ "" , hash.getOrDefault(s.charAt(i) + "",0)-1);
                    if (hash.get(s.charAt(i) + "")==0){
                        hash.remove(s.charAt(i) + "");
                    }
                }
                    
            }
            hash = piro;
        }
        List<String> ans = new ArrayList<String>();
        for(String g: hash.keySet()){
            int val = hash.get(g);
            while(val-->0)
                ans.add(g);
        }
        return ans;
    }
}