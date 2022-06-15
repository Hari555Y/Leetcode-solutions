// https://leetcode.com/problems/construct-string-from-binary-tree

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
    static String ans = "";
    public String tree2str(TreeNode root) {
       // String ans = "";
        pre(root);
        return ans;
        
    }
    public static void pre(TreeNode root){
        if (root == null){
            return;
        }
        ans+= String.valueOf(root.val);
        if(root.left!=null){
                    ans += '(';
            pre(root.left);
            ans += ')';}
      
        if (root.right!=null){
              ans +='(';
            pre(root.right);
        ans +=')';}
        
    }
}