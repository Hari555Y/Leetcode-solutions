// https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (a, b)-> a.length()!=b.length() ? b.length()-a.length() :Integer.parseInt(b) - Integer.parseInt(a));
        return nums[k-1];
        
    }
}