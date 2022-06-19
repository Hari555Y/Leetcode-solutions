// https://leetcode.com/problems/minimum-depth-of-binary-tree

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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return ans(root);
    }
    public int ans(TreeNode root){
        if(root ==null){
            return 0;
            
        }
        else if (root.left == null&& root.right ==null){
            return 1;
            
        }
        else if ((root.left != null) && (root.right ==null)){
            return 1 + ans(root.left);
            
            
        }
        else if((root.left == null)&& (root.right !=null)){
            return 1 + ans(root.right);
            
        }
        return 1 + Math.min(ans(root.left), ans(root.right));
        
    }
}