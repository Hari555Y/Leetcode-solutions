// https://leetcode.com/problems/binary-tree-right-side-view

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        lvl mx_level = new lvl();
        rc(ans, mx_level, 1 , root);
        return ans;
    }
    
    public static void rc(List<Integer> ans, lvl mx_level, int level, TreeNode root){
        if(root == null){
            return;
        }
        if (mx_level.mx_lvl <level){
            ans.add(root.val);
            mx_level.mx_lvl = level;
        }
        rc(ans, mx_level, level+1, root.right);
        rc(ans, mx_level , level +1 , root.left);
        
    }
}

class lvl{
    int mx_lvl;
}