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
        ArrayDeque<pair> q= new ArrayDeque<>();
        int ans = 0;
        q.addFirst(new pair(root,0));
        while(q.size()!=0){
            int p = q.size();
            int f = q.getFirst().n;
            int r = q.getLast().n;;
            for(int i =0; i<p; i++){
                pair m = q.poll();
                TreeNode x = m.t;
                int n = m.n;
                if(x.left!=null){
                    q.addLast(new pair(x.left, 2*n+1));
                }
                if(x.right!=null){
                    q.addLast(new pair(x.right, 2*n+2));
                }
                  
            }
            ans = Math.max(ans, r-f+1);
            
        }
        return ans;
        
    }
}
class pair{
    int n;
    TreeNode t;
    public pair(TreeNode t, int n){
        this.t = t;
        this.n = n;
    }
}