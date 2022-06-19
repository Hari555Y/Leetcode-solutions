// https://leetcode.com/problems/maximum-width-of-binary-tree

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
    public int widthOfBinaryTree(TreeNode root) {
        ArrayDeque<TreeNode> q= new ArrayDeque<>();
        int ans = 0;
        q.addFirst(root);
        while(q.size()!=0){
            TreeNode fir = q.getFirst();
            while(q.size()!=0 && fir!= null && fir.val==-101){
                q.removeFirst();
                if(q.size()!=0)
                    fir = q.getFirst();
            }
            if(q.size()>0){
            TreeNode las = q.getLast();
            while(q.size()!= 0 && las!=null && las.val==-101){
                q.removeLast();
                if(q.size()!=0)
                    las = q.getLast();
            }
            }
            int p = q.size();
            ans = Math.max(ans, p);
            for(int i =0; i<p; i++){
                TreeNode x = q.poll();
                if(x.val==-101){
                    q.add(new TreeNode(-101));
                    q.add(new TreeNode(-101));
                    continue;
                }
                if(x.left!=null){
                    q.add(x.left);
                }
                else{
                    q.add(new TreeNode(-101));
                }
                if(x.right!=null){
                    q.add(x.right);
                }
                else{
                    q.add(new TreeNode(-101));
                }
                  
            }
        }
        return ans;
        
    }
}