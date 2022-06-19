// https://leetcode.com/problems/minimum-domino-rotations-for-equal-row

class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int fir = tops[0];
        int sec = bottoms[0];
        boolean bool = true;
        int n = tops.length;
        for(int i =0; i<n; i++){
            if (tops[i]!=fir && bottoms[i]!=fir){
                bool = false;
                break;
            }
        }
        int x = -1;
        int y = -1;
        if (bool == true){
            x = fir;
        
        }
        for(int j =0; j<n; j++){
            if(tops[j]!=sec && bottoms[j]!=sec){
                bool = false;
                break; 
            }
            if (j == n-1){
                bool = true;
                y = sec;
            }
            
        }
        System.out.println(x);
        System.out.print(bool);
        if ( x ==-1 && bool == false){
            return -1;
        }
        int c1 =0; int c2 =0;
        if (x!=-1){
            for(int i =0; i<n; i++){
                if (tops[i]!=x){
                    c1++;
                }

            }
        }
        if (y!=-1){
            for(int i =0; i<n; i++){
                if (bottoms[i]!=y){
                    c2++;
                }

            }
        }
        
        return x!=-1 && y!=-1 ? Math.min(c1, c2) : Math.max(c1, c2);
        
    }
}