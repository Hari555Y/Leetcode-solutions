// https://leetcode.com/problems/flood-fill

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length;
        int col = image[0].length;
        if (sr< row&& sc<col){
            image[sr][sc]==newColor;
        }
        if (sr+1<row && sc+1<col){
           // int[sr+1][sc+1]==newColor;
            floodFill(image,sr+1, sc+1, newColor);
       //     floodFill(int[][] image, int sr, int sc, int newColor)
        }
        if (sr+1<row && sc-1>=0){
           // int[sr+1][sc+1]==newColor;
            floodFill(image,sr+1, sc-1, newColor);
        }
        if (sr-1>=0&& sc+1<col){
           // int[sr+1][sc+1]==newColor;
            floodFill(image,sr-1, sc+1, newColor);
         //   floodFill(int[][] image, int sr, int sc, int newColor)
                
        }
        if (sr-1>=0&& sc-1>=0){
          //  int[sr+1][sc+1]==newColor;
            floodFill(image,sr-1, sc-1, newColor);
            //floodFill(int[][] image, int sr, int sc, int newColor)
        }
        if (sr+1<row){
           // int[sr+1][sc+1]==newColor;
            floodFill(image,sr+1, sc, newColor);
           // floodFill(int[][] image, int sr, int sc, int newColor)
        }
        if (sc+1<col){
          //  int[sr+1][sc+1]==newColor;
            floodFill(image,sr, sc+1, newColor);
          //  floodFill(int[][] image, int sr, int sc, int newColor)
        }
        if (sr-1>=0){
        //    int[sr+1][sc+1]==newColor;
            floodFill(image,sr-1, sc, newColor);
         //   floodFill(int[][] image, int sr, int sc, int newColor)
        }
        if (sc-1>=0){
        //    int[sr+1][sc+1]==newColor;
            floodFill(image,sr, sc-1, newColor);
         //   floodFill(int[][] image, int sr, int sc, int newColor)
        }
        return image;
    }
}