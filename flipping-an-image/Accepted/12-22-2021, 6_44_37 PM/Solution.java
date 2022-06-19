// https://leetcode.com/problems/flipping-an-image

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length; int n = image[0].length;
        for(int i =0; i<n; i++){
            reverse(image[i], m);
        }
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                image[i][j] = (image[i][j]==0)?1:0;
            }
        }
        return image;
        
    }
    static void reverse(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
       // return arr;
        
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }
}