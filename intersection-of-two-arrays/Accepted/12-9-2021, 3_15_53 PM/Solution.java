// https://leetcode.com/problems/intersection-of-two-arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr = new HashSet<>();
        Arrays.sort(nums1); Arrays.sort(nums2);
        int i = 0; int j = 0;
        while(i<nums1.length && j <nums2.length){
            if (nums1[i] == nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
                
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
            
        }
        int[] ans = new int[arr.size()];
        int p =0;
        for (int s: arr){
            ans[p++] =s;
        }
        return ans;
        
        
    }
}