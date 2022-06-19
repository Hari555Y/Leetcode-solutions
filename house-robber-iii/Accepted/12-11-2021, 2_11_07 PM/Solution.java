// https://leetcode.com/problems/house-robber-iii

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
    public int rob(TreeNode root) {
        return robbing(root).a;
        
        
    }
    public static pair robbing(TreeNode root){
        if(root==null){
            return new pair(0,0);
        }
        pair l = robbing(root.left);
        pair r = robbing(root.right);
        return new pair( Math.max(root.val + l.b+r.b ,l.a+r.a ),l.a + r.a);
    }
}
class pair{
    int a; int b;
    public pair(int a, int b){
        this.a =a;
        this.b =b;
    }
}