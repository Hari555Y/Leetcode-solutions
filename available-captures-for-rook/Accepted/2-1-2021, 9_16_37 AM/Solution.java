// https://leetcode.com/problems/available-captures-for-rook

class Solution {
    public int numRookCaptures(char[][] board) {
        int rookx=0;
        int rooky =0;
        for (int i =0; i<8;i++){
            for(int j=0; j<8;j++){
                if (board[i][j]=='R'){
                    rookx= i;
                    rooky= j;
                    break;
                }
                else{
                    continue;
                }
            }
        }
        int count=0;
        for (int r = rookx; r<8; r++){
            if (board[r][rooky] == 'B'){
                break;
            }
            else if (board[r][rooky] == 'p'){
                count+=1;
                break;
                
            }
            else{
                continue;
            }
        }
        for (int m = rookx; m>=0; m--){
            if (board[m][rooky] == 'B'){
                break;
            }
            else if (board[m][rooky] == 'p'){
                count+=1;
                break;
                
            }
            else{
                continue;
            }
        }
        for (int p = rooky; p<8; p++){
            if (board[rookx][p] == 'B'){
                break;
            }
            else if (board[rookx][p] == 'p'){
                count+=1;
                break;
                
            }
            else{
                continue;
            }
        }
        for (int t = rooky; t>=0; t--){
            if (board[rookx][t] == 'B'){
                break;
            }
            else if (board[rookx][t] == 'p'){
                count+=1;
                break;
                
            }
            else{
                continue;
            }
        }
        return count;
        
        
        
    }
}