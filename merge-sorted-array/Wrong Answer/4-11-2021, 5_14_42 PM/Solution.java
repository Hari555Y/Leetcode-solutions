// https://leetcode.com/problems/merge-sorted-array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] myarr = new int[m+n];
        for (int i =0; i<m; i++){
            myarr[i] = nums1[i];
        }
        for (int i =m; i<m+n; i++){
            myarr[i] = nums2[i-m];
        }
        Arrays.sort(myarr);
        
        
    }
}