// https://leetcode.com/problems/binary-tree-paths

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dop(root, sb, ans);
        return ans;
        
    }
    public void dop(TreeNode root, StringBuilder sb, List<String> ans){
        if (root == null){
            return;
        }
        if (root.left == null && root.right==null){
            sb.append(root.val);
            ans.add(sb.toString());
            return;
        }
        sb.append(root.val + "->");
        dop(root.left, new StringBuilder(sb), ans);
        dop(root.right, new StringBuilder(sb), ans);
    }
}