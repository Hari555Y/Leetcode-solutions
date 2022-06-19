// https://leetcode.com/problems/maximum-product-subarray

class Solution {
    public int maxProduct(int[] nums) {
        List<Integer> A = new ArrayList<>();
        for(int i: nums){
            A.add(i);
        }
        int len = A.size();
        if (len==0){
            return 0;
        }
        int minsofar = A.get(0);
        int maxsofar = A.get(0);
        int ans = A.get(0);
        for (int i =1; i<len ;i++){
            int temp = minsofar;
            int tempi = maxsofar;
            minsofar = Math.min(A.get(i),Math.min( A.get(i)*temp, A.get(i)*tempi));
            maxsofar = Math.max(A.get(i),Math.max( A.get(i)*temp, A.get(i)*tempi));
            ans = Math.max(maxsofar, ans);
            
        }
        return ans;
        
    }
}