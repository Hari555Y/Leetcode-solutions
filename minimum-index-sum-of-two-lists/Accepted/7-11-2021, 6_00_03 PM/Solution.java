// https://leetcode.com/problems/minimum-index-sum-of-two-lists

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,ArrayList<Integer>> map = new HashMap<>();
        for (int i =0; i<list1.length; i++){
            map.put(list1[i], new ArrayList<>());
            map.get(list1[i]).add(i);
            
        }
        for (int j =0; j<list2.length; j++){
            map.putIfAbsent(list2[j], new ArrayList<>());
            map.get(list2[j]).add(j);     
        }
        ArrayList<String> arr = new ArrayList<>();
        int sum =Integer.MAX_VALUE;
        for (String p: map.keySet()){
            if(map.get(p).size()==2){
                if (map.get(p).get(0)+map.get(p).get(1)<sum){
                    arr.clear();
                    arr.add(p);  
                    sum= map.get(p).get(0)+map.get(p).get(1);
                }
                else if (map.get(p).get(0)+map.get(p).get(1)==sum){
                 //   arr.clear();
                    arr.add(p);    
                }
            }
        }
        return arr.toArray(new String[arr.size()]);
        
        
    }
}