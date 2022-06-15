// https://leetcode.com/problems/count-lattice-points-inside-a-circle

class Solution {
    public int countLatticePoints(int[][] circles) {
        HashSet<Integer> hash = new HashSet<>();
        for(int[] ar : circles){
            int rad = ar[2] ;
            int r = ar[0];
            int c = ar[1];
            for(int i = r - rad; i<=r+rad; i++){
                for(int j = c-rad; j<=c+rad; j++){
                    if (rad*rad>= (r-i)*(r-i)  + (c-j)*(c-j)){
                      //  count++;
                        hash.add(10000*i + j);
                    }
                }
            }
            
        }
        return hash.size();
        
        
    }
}