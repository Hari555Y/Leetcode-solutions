// https://leetcode.com/problems/find-center-of-star-graph

class Solution {
    public int findCenter(int[][] edges) {
        int count =0;
        HashSet<Integer> set = new HashSet<>();
        int m = edges.length; int n = edges[0].length;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(set.contains(edges[i][j])){
                    return edges[i][j];                
                }
                else{
                    set.add(edges[i][j]);
                }
            }
        }
        return 1;
        
    }
}