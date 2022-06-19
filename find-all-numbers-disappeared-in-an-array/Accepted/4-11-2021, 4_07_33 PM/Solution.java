// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ty = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i =0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        for (int i =1; i<nums.length+1; i++){
            if (!hs.contains(i)){
                ty.add(i);
            }
        }
        return ty;
    }
}