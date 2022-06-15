// https://leetcode.com/problems/random-pick-index

class Solution {
    int[] arr;
    public Solution(int[] nums) {
        int n = nums.length;
        arr= new int[n];
        arr = nums;
    }
    
    public int pick(int target) {
        ArrayList<Integer> ar = new ArrayList<>();
        int n = arr.length;
        for(int i =0; i<n; i++){
            if (arr[i]==target){
                ar.add(i);
            }
        }
        int x = (int)(Math.random()*ar.size());
        return ar.get(x);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */