// https://leetcode.com/problems/construct-string-from-binary-tree

class Solution {
    public String tree2str(TreeNode root) {
        return construct(root);
    }
    
    private String construct(TreeNode root) {
        if (root == null) return "";
        
        if (root.left == null && root.right == null) {
            return String.valueOf(root.val);
        }
        
        if (root.left != null && root.right == null) {
            return root.val + "(" + construct(root.left) + ")";
        }
        
        if (root.left == null && root.right != null) {
            return root.val + "(" + ")" + "(" + construct(root.right) + ")";
        }
        
        return root.val + "(" + construct(root.left) + ")" + "(" + construct(root.right) + ")";
    }
}