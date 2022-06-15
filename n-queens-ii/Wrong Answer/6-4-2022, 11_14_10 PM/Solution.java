// https://leetcode.com/problems/n-queens-ii

class Solution {
    static int count =0;
        
    public int totalNQueens(int a) {
        List<List<String>> arr = new ArrayList<>();
        List<String> board = new ArrayList<>();
        if(a==1){
            return 1;
        }
        String s = "";
        for (int i =0; i<a; i++){
            s+='.';
        }
        for (int i =0; i<a; i++){
            board.add(new String(s));
        }
        solve(0, board, arr, a);
        return count;
        
    }
    void solve(int col,List<String> board,List<List<String>> arr ,int a){
        if(col==a){
            arr.add(new ArrayList<String>(board));
            count++;
            return;
            
        }
        for (int row = 0; row<a; row++){
            if(issafe(board, row, col,a)){
                place(board, row, col , 'Q');
                solve(col+1, board, arr,a);
                place(board, row,col, '.' );
            }
        }
        
    }
    void place(List<String> board, int row,int col, char c){
        StringBuilder sb = new StringBuilder(board.get(row));
        sb.setCharAt(col,c );
        board.set(row, sb.toString());
    }
    public boolean issafe(List<String> board, int row, int col, int a){
        int dr = row; int dc =col;
        while(col>=0){
            if(board.get(row).charAt(col)=='Q'){
                return false;
            }
            col--;
        }
        col = dc;
        while(row>=0&&col>=0){
            if (board.get(row).charAt(col)=='Q'){
                return false;
            }
            row--; col--;
        }
        col = dc;row = dr;
        while(row<a&&col>=0){
            if (board.get(row).charAt(col)=='Q'){
                return false;
            }
            row++; col--;
            
        }
        return true;
    }
}