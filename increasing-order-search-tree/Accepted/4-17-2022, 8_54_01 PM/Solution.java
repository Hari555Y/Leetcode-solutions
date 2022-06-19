// https://leetcode.com/problems/increasing-order-search-tree

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
    static TreeNode ans = new TreeNode(0);
    TreeNode temp = ans;
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return temp.right;
        
    }
     public static void inorder(TreeNode t){
         if(t==null){
             return;
         }
         inorder(t.left);
         ans.right = new TreeNode(t.val);
         ans = ans.right;
         inorder(t.right);
     }
}