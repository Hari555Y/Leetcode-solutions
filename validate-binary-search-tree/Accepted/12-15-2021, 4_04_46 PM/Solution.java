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
        return ist(root.left,(long)((long)Integer.MIN_VALUE-1L), (long)root.val)&&ist(root.right, (long)root.val, (long)((long)Integer.MAX_VALUE+1L));
    }
    public static boolean ist(TreeNode t, long a, long b){
        if (t==null){
            return true;
        }
        if (t.val >a && t.val <b){
            return ist(t.left, a, t.val)&&ist(t.right, t.val, b);
        }
        return false;
    }
}