// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root, p.val, q.val);
    }
    public boolean find(TreeNode A , int B){
        if(A==null){
            return false;
        }
        if(A.val==B){
            return true;
        }
        return find(A.left,B)||find(A.right,B);
    }
    public static TreeNode ans(TreeNode a, int b, int c){
        if(a==null){
            return null;
        }
        if(a.val==b||a.val==c){
            return a;
        }
        TreeNode left = ans(a.left,b,c);
        TreeNode right = ans(a.right,b,c);
        if(left!=null&&right!=null){
            return a;
            
        }
        if(left!=null){
            return left;
        }
        if(right!=null){
            return right;
        }
        return null;
    }
    
    public TreeNode lca(TreeNode A, int B, int C) {
        if(find(A,B)&&find(A,C)){
            return ans(A,B,C);
            
        }    
        return  null;
        
    }
}