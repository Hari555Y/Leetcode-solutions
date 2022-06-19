// https://leetcode.com/problems/merge-two-binary-trees

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
    public TreeNode mergeTrees(TreeNode A, TreeNode B) {
        if(A==null&&B==null){
            return null;
        }
        if(A==null){
            return B;
        }
        if(B==null){
            return A;
        }
        A.val +=B.val;
        A.left =mergeTrees(A.left, B.left); A.right =mergeTrees(A.right,B.right);
        return A;
        
    }
}