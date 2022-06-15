// https://leetcode.com/problems/random-pick-with-weight

class Solution {
    int[] pre;
    public Solution(int[] w) {
        int n = w.length;
        pre = new int[n];
        pre[0] = w[0];
        for(int i =1; i<n; i++){
            pre[i] = w[i] + pre[i-1];
            
        }
        
        
    }
    
    public int pickIndex() {
        int tar = (int)(Math.random()*pre[pre.length-1]);
        return bin_sear(pre, tar) +1;
        
        
        
    }
    // [1,2, 5, 7] 
    // 3
    
    public static int bin_sear(int[] a , int trget){
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
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */