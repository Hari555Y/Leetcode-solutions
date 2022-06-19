// https://leetcode.com/problems/max-consecutive-ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =-1;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        for (int i =0; i<nums.length; i++){
            if (nums[i]==0){
                arr.add(i);
            }
        }
        arr.add(nums.length);
        for (int i =1; i<arr.size();i++){
            max = Math.max(max, arr.get(i)-arr.get(i-1));
        }
        return max;
    }
}