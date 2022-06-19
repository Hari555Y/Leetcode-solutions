// https://leetcode.com/problems/maximum-product-of-three-numbers

class Solution {
    public int maximumProduct(int[] nums) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i: nums){
            A.add(i);
        }
        
        Collections.sort(A);
        int len = A.size();
        if (len<=2){
            return 0;
        }
        return Math.max((A.get(0)*A.get(1)*A.get(len-1)),(A.get(len-1)*A.get(len-2)*A.get(len-3)));
        
    }
}