// https://leetcode.com/problems/add-one-row-to-tree

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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth==1){
            TreeNode newroot = new TreeNode(val);
          //  newroot.val = val;
            newroot.left = root;
            return newroot;
            
        }
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.add(root);
        int d = 1;
         //   TreeNode fakel = root;
           // TreeNode faker = root;
        while (d<depth-1){
            int jp = qu.size();
            for (int i =0; i<jp; i++){
                TreeNode pehla = qu.poll();
                if (pehla.left !=null){
                    qu.add(pehla.left);
                }
                if (pehla.right!=null){
                    qu.add(pehla.right);
                }                    }
                    //qu.poll();
                    
              }
              d++;    
        }
        int m = qu.size();
        for (int h =0; h< m;h++){
               TreeNode chut = qu.poll();
               TreeNode ass = new TreeNode(val);
               TreeNode fuck = new TreeNode(val);
                    //TreeNode ass, fuck;
               // ass.val = val;
                //fuck.val = val;
               ass.left = chut.left;
               fuck.right = chut.right;
               chut.left = ass;
               chut.right = fuck;
        }
        return root;
        
    }
}