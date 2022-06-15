// https://leetcode.com/problems/random-point-in-non-overlapping-rectangles

class Solution {
    long[] pre;
    int[][] rec;
    public Solution(int[][] rects) {
        int m = rects.length;
        int n = rects[0].length;
        rec = new int[m][n];
        rec = rects;
        pre = new long[m];
        pre[0] = (long)((long)rects[0][2]-(long)rects[0][0] +1L)*((long)rects[0][3]-(long)rects[0][1]+1L);
        for(int i =1; i<m; i++){
            pre[i] = pre[i-1] + ((long)rects[i-1][2]-(long)rects[i-1][0] +1L)*((long)rects[i-1][3]-(long)rects[i-1][1]+1L);
            
        }    
    }
    
    public int[] pick() {
        int[] ans = new int[2];
        long tar  = (long)(Math.random()*pre[pre.length-1]);
        int ind = bin_sear(pre, tar)+1;
        int tepx = rec[ind][0] + (int)((long)tar%((long)rec[ind][2]-(long)rec[ind][0]+1L));
        int tepy = rec[ind][1] + (int)((long)tar%((long)rec[ind][3]-(long)rec[ind][1]+1L));
        ans[0] = tepx;
        ans[1] = tepy;
        return ans;
        
        
        
    }
   public static int bin_sear(long[] a , long trget){
        int s = 0;
        int e = a.length-1;
        int res = -1;
        while(s<e){
            int mid = s + (e-s)/2;
            if (a[mid]<=trget){
                res = mid;
                s = mid+1;
            }
            else if (a[mid]>trget){
                e = mid;
                
            }
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */

// class Solution {
//     int[] pre;
//     public Solution(int[] w) {
//         int n = w.length;
//         pre = new int[n];
//         pre[0] = w[0];
//         for(int i =1; i<n; i++){
//             pre[i] = w[i] + pre[i-1];
            
//         }
        
        
//     }
    
//     public int pickIndex() {
//         int tar = (int)(Math.random()*pre[pre.length-1]);
//         return bin_sear(pre, tar) +1;
        
        
        
//     }
    // [1,2, 5, 7] 
    // 3
    
//     public static int bin_sear(int[] a , int trget){
//         int s = 0;
//         int e = a.length-1;
//         int res = -1;
//         while(s<e){
//             int mid = s + (e-s)/2;
//             if (a[mid]<=trget){
//                 res = mid;
//                 s = mid+1;
//             }
//             else if (a[mid]>trget){
//                 e = mid;
                
//             }
//         }
//         return res;
//     }
//}
