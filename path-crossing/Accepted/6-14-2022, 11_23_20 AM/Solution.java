// https://leetcode.com/problems/path-crossing

class Solution {
    public boolean isPathCrossing(String s) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(0);
        int n= s.length();
        int sx =0;
        int sy =0;
        for(int i =0 ; i<n ; i++){
            if(s.charAt(i)=='N'){
                sy++;
            }
            else if(s.charAt(i)=='S'){
                sy--;
            }
            else if (s.charAt(i)=='W'){
                sx--;
            }
            else{
                sx++;
            }
            if (hash.contains(100000*sx + sy)){
                return true;
            }  
            hash.add(100000*sx+sy);
        }
        return false;
        
    }
}
class pair{
    int x; int y;
    public pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}