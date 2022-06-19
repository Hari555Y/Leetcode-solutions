// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toavl(nums,0,nums.length-1);
        
        
    }
    public TreeNode toavl(int[] arr, int start, int end){
        if (start>end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode fake = new TreeNode(mid);
        
        fake.left = toavl(arr, start, mid-1);
        fake.right = toavl(arr, mid+1,end);
        return fake;
    }
}