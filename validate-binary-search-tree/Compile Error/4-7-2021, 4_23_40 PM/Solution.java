// https://leetcode.com/problems/validate-binary-search-tree

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
    public boolean isValidBST(TreeNode root) {
        if (root == null || root.left==null && root.right ==null){
            return true;
        }
        if (root.right!=null &&root.left==null){
            if (root.right.val>=root.val){
                return isValidBST(root.right);
            }
            
        }
        if (root.right!=null &&root.left!=null){
            if (root.left.val<=root.val<=root.right.val){
                return isValidBST(root.left)&& isValidBST(root.right);
                
            }
            else{
                return false;
            }
        }
        if (root.right==null&&root.left!=null){
            if (root.left.val<=root.right){
                return isValidBST(root.left);
            }
            else{
                return false;
            }
            
        }
        
    }
}