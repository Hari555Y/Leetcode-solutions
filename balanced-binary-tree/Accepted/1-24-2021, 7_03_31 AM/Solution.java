// https://leetcode.com/problems/balanced-binary-tree

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
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        if( Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
            
        }
        return false;
        
    }
    public int height(TreeNode node){
        if (node == null){
            return 0;
        }
        else{
            return 1+ Math.max(height(node.left),height(node.right));
            
        }
    }
}