// https://leetcode.com/problems/game-of-life

class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] ans = new int[m][n];
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                ans[i][j] = board[i][j];
            }
        }
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(board[i][j]==1){
                    if (live(ans, i,j)<2){
                        board[i][j]=0;
                    }
                    else if (live(ans, i,j)>=2 && live(ans, i, j)<=3){
                        board[i][j]=1;
                    }
                    else{
                        board[i][j]=0;
                    }
                }
                else{
                    if (live(ans,i ,j)==3){
                        board[i][j]=1;
                    }
                }
            }
        }
        
        
    }
    public int live(int[][] mat, int i, int j){
        int m = mat.length;
        int n = mat[0].length;
        int count =0;
        if (i-1>=0){
            count +=(mat[i-1][j] ==1) ? 1 : 0;
            if (j-1>=0){
                count +=(mat[i-1][j-1] ==1) ? 1 : 0;
            }
            if(j+1<n){
                count +=(mat[i-1][j+1] ==1) ? 1 : 0;
            }   
        }
        if(j-1>=0){
            count +=(mat[i][j-1] ==1) ? 1 : 0;
            
            
            
        }
        if (i+1<m){
            count +=(mat[i+1][j] ==1) ? 1 : 0;
            if (j-1>=0){
                count +=(mat[i+1][j-1] ==1) ? 1 : 0;
            }
            if (j+1<n){
                count +=(mat[i+1][j+1] ==1) ? 1 : 0;
            }
            
        }
        if(j+1<n){
            count +=(mat[i][j+1] ==1) ? 1 : 0;
            
            
        }
        return count;
    }
    public int dead(int[][] mat, int i, int j){
        int m = mat.length;
        int n = mat[0].length;
        int count =0;
        if (i-1>=0){
            count +=(mat[i-1][j] ==0) ? 1 : 0;
            if (j-1>=0){
                count +=(mat[i-1][j-1] ==0) ? 1 : 0;
            }
            if(j+1<n){
                count +=(mat[i-1][j+1] ==0) ? 1 : 0;
            }   
        }
        if(j-1>=0){
            count +=(mat[i][j-1] ==0) ? 1 : 0;
            
            
            
        }
        if (i+1<m){
            count +=(mat[i+1][j] ==0) ? 1 : 0;
            if (j-1>=0){
                count +=(mat[i+1][j-1] ==0) ? 1 : 0;
            }
            if (j+1<m){
                count +=(mat[i+1][j+1] ==0) ? 1 : 0;
            }
            
        }
        if(j+1<n){
            count +=(mat[i][j+1] ==0) ? 1 : 0;
            
            
        }
        return count;
    }
    
}