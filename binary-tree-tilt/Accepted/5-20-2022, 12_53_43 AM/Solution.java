// https://leetcode.com/problems/binary-tree-tilt

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
    static int sum =0;
    public int findTilt(TreeNode root) {
        sum =0;
        if (root ==null){
            return 0;
        }
        sum_nodes(root);
        return sum;
        
    }
    public static int sum_nodes(TreeNode root){
        if (root==null){
            return 0;
        }
        int lsum = sum_nodes(root.left);
        int rsum = sum_nodes(root.right);
        sum += Math.abs(lsum - rsum);
        return lsum + rsum + root.val;
    }
}
