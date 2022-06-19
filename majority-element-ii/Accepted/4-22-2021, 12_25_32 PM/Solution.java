// https://leetcode.com/problems/majority-element-ii

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for (int i =0; i<len; i++){
            hs.add(nums[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int t:hs){
            int count =0;
            for (int k=0; k<len;k++){
                if (nums[k] == t){
                    count++;
                }
            }
            if (count>len/3){
                arr.add(t);
            }
        }
        return arr;
        
    }
}