// https://leetcode.com/problems/matrix-cells-in-distance-order

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows*cols][2];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                int bno = i * cols + j; //ans. array index
                ans[bno][0] = i;
                ans[bno][1] = j;
            }
        }
        Arrays.sort(ans, (a,b)-> (Math.abs(a[0]-rCenter)  + Math.abs(a[1]-cCenter)) - 
                    (Math.abs(b[0]-rCenter)  + Math.abs(b[1]-cCenter)));
        return ans;
    }
}