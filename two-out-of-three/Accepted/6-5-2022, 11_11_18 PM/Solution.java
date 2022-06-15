// https://leetcode.com/problems/two-out-of-three

class Solution {
    public List<Integer> twoOutOfThree(int[] A, int[] B, int[] C) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashSet<Integer> s1 = new HashSet<Integer>();
        HashSet<Integer> s2 = new HashSet<Integer>();
        HashSet<Integer> s3 = new HashSet<Integer>();
        for (int i :A){
            s1.add(i);
        }
        for (int i :B){
            s2.add(i);
        }
        for (int i :C){
            s3.add(i);
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int r :s1){
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        for (int m :s2){
            map.put(m, map.getOrDefault(m, 0) + 1);
        }
        for (int j :s3){
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (int s:map.keySet()){
            if (map.get(s)>=2){
                ans.add(s);
                
            }
        }
        Collections.sort(ans);
        return ans;
        
    }
}