// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits

class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        pair[] purr = new pair[arr.length];
        int[] ans = new int[n];
        for(int i =0; i<n; i++){
            purr[i] = bitc(arr[i]);
        }
        
        Arrays.sort(purr, (a,b)-> (a.oneb==b.oneb) ? a.val -b.val : a.oneb-b.oneb);
                   // (a,b)-> bitc(a) == bitc(b) ? a-b : bitc(a)-bitc(b));
        for(int i =0; i<n; i++)
            ans[i] = purr[i].val;
        return ans;
    }
    public static pair bitc(int a){
        return new pair(a,Integer.bitCount(a));
    }
}
class pair{
    int val;
    int oneb;
    public pair(int val, int oneb){
        this.val = val;
        this.oneb = oneb;
    }
}