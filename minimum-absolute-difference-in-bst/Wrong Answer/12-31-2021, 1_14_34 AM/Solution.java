// https://leetcode.com/problems/minimum-absolute-difference-in-bst

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
    static int min  = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return min;
        
        
    }
    public static void dfs(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left!=null){
            min = Math.min(min, root.val-root.left.val);
        }
        if(root.right!=null){
            min = Math.min(min, root.right.val-root.val);
        }
        dfs(root.left);
        dfs(root.right);
    }
}