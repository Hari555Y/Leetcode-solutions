// https://leetcode.com/problems/move-zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int te = nums.length;
       // int start =0; int flat = 1;
        if (nums.length ==1){
            return;
        }
        else{
            int count = 0;
            for (int i=0; i<te; i++){
                if (nums[i] !=0){
                    nums[count++] = nums[i];
                }
            }
            while(count<te){
                nums[count++] = 0;
            }
        }
        
    }
}