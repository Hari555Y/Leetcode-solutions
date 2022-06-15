// https://leetcode.com/problems/flood-fill

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        dfs(image, sr, sc, newColor , visited);
        return image;
        
    }
    public static void dfs(int[][] image, int sr, int sc, int newColor,boolean[][] visited ){
        int rs = image[sr][sc];
        visited[sr][sc] = true;
        image[sr][sc] = newColor;
        for(int i =sr-1; i<=sr+1; i++){
            for(int  j = sc-1; j <= sc+1; j++){
                if (Math.abs(i-sr) + Math.abs(j-sc)==1 && i>=0 && j>=0 && i<image.length && j< image[0].length && image[i][j]==rs && !visited[i][j]){
                    dfs(image, i, j, newColor, visited);
                    
                }
            }
        }
        
    }
}