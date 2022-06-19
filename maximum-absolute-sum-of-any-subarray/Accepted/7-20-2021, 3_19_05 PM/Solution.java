// https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int [] nums2 = new int[nums.length];
        for (int x= 0; x< nums.length; x++){
            nums2[x] = (-1)*nums[x];
        }
      //  int ans = Integer.MIN_VALUE;
        int maxvalue = Integer.MIN_VALUE; int maxendinghere= 0;
        for (int i =0; i < nums.length ;i ++){
            maxendinghere = maxendinghere + nums[i];
            if (maxendinghere> maxvalue){
                maxvalue = maxendinghere;
            }
            if (maxendinghere<0){
                maxendinghere = 0;
            }
        }
        int maxvalue2 = Integer.MIN_VALUE; int maxendinghere2= 0;
        for (int i =0; i < nums.length ;i ++){
            maxendinghere2 = maxendinghere2 + nums2[i];
            if (maxendinghere2> maxvalue2){
                maxvalue2 = maxendinghere2;
            }
            if (maxendinghere2<0){
                maxendinghere2 = 0;
            }
        }
        return Math.max(maxvalue, maxvalue2);
    }
}