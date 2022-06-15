// https://leetcode.com/problems/number-of-equivalent-domino-pairs

class Solution {
    public int numEquivDominoPairs(int[][] d) {
        int n = d.length;
        HashMap<Integer, Integer> hash = new HashMap<>();
        int count =0;
        for(int i =0; i<n; i++){
            hash.put(100*d[i][0]+ d[i][1], hash.getOrDefault(100*d[i][0]+ d[i][1], 0)+1);
            if(d[i][0] != d[i][1])  
                hash.put(100*d[i][1]+ d[i][0], hash.getOrDefault(100*d[i][1]+ d[i][0], 0)+1); 

        }
        for(int i : hash.keySet()){
            if (hash.get(i)>1)
                System.out.println(i);
                count += (hash.get(i)*(hash.get(i)-1))/2;
        }
        return count/2;
        
    }
}