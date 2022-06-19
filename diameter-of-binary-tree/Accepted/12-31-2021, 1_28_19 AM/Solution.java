// https://leetcode.com/problems/diameter-of-binary-tree

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
    public int diameterOfBinaryTree(TreeNode root) {
        return dfs(root).a;
        
        
    }
    public static pair dfs(TreeNode root){
        if (root ==null){
            return new pair(0,0);
        }
        pair x = dfs(root.left);
        pair y = dfs(root.right);
        int diameter = Math.max(x.a , Math.max(y.a, x.b+y.b));
        return new pair(diameter, Math.max(x.b , y.b)+1);
        
    }
}
class pair{
    int a; int b;
    public pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}