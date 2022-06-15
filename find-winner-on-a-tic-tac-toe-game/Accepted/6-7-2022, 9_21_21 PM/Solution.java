// https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game

class Solution {
    public String tictactoe(int[][] moves) {
        int[] aRow = new int[3];
        int[] aCol = new int[3];
        int[] bRow = new int[3];
        int[] bCol = new int[3];
        int aDiagonal1 = 0, bDiagonal1 = 0, aDiagonal2 = 0, bDiagonal2 = 0;
        int n = moves.length;
        for (int i = 0; i < n; i++) {
            int r = moves[i][0], c = moves[i][1];
            if (i % 2 == 1) {
                if (++bRow[r] == 3 || ++bCol[c] == 3 || (r == c && ++bDiagonal1 == 3) || (r + c == 2 && ++bDiagonal2 == 3)) return "B";
            }else {
                if (++aRow[r] == 3 || ++aCol[c] == 3 || (r == c && ++aDiagonal1 == 3) || (r + c == 2 && ++aDiagonal2 == 3)) return "A";
            }
        }
        return n == 9 ? "Draw" : "Pending";     
    }
}