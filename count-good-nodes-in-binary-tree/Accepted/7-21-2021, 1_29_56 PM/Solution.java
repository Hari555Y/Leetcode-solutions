// https://leetcode.com/problems/count-good-nodes-in-binary-tree

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
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left== null && root.right ==null){
            return 1;
        }
        int count =1;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.peek();
            q.poll();
            if(curr.left!=null){
                if(curr.left.val<curr.val){
                    curr.left.val = curr.val;
                    
                }
                else{
                    count++;
                }
                q.add(curr.left);
            }
            if(curr.right!=null){
                if(curr.right.val<curr.val){
                    curr.right.val = curr.val;
                }
                else{
                    count++;
                }
                q.add(curr.right);
            }
        }
        return count;
        
    }
}